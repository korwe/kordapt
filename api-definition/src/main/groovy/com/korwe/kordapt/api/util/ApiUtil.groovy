package com.korwe.kordapt.api.util

import com.esotericsoftware.yamlbeans.YamlReader
import com.korwe.kordapt.api.bean.*
/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com">Dario Matonicki</a>
 */
class ApiUtil {

    static customDefinitions = ['Object': new Type(null, 'Object'),
                             'DateTime': new Type('org.joda.time', 'DateTime'),
                             'Set': new Type('java.util', 'Set'),
                             'List': new Type('java.util', 'List'),
                             'Map': new Type('java.util', 'Map')]

    static Service populateServiceFromApi(File file, String defaultTypePackageName) {
        populateServiceFromApi(new FileInputStream(file), defaultTypePackageName)
    }

    static Service populateServiceFromApi(InputStream inputStream, String defaultTypePackageName){

        def reader = new YamlReader(new InputStreamReader(inputStream))

        def serviceYaml = reader.read()

        //Populate service definition object
        def serviceDefinition = new Service()

        serviceDefinition.name = serviceYaml.name
        serviceDefinition.packageName = serviceYaml.package_name

        //Populate service function definition objects
        serviceDefinition.functions = functionDefinitions(serviceYaml.functions, defaultTypePackageName)
        serviceDefinition
    }


    static Type populateTypeFromApi(File file, String defaultPackageName) {
        populateTypeFromApi(new FileInputStream(file), defaultPackageName)
    }

    static Type populateTypeFromApi(InputStream inputStream, String defaultPackageName) {
        def reader = new YamlReader(new InputStreamReader(inputStream))

        def typeYaml = reader.read()

        //Populate type def object
        def typeDefObject = typeDefinitionFromTypeName(typeYaml.name, defaultPackageName)
        typeDefObject.inheritsFrom = typeDefinitionFromTypeName(typeYaml.inherits_from, defaultPackageName)
        typeDefObject.attributes = attributeDefinitions(typeYaml.attributes, defaultPackageName)

        typeDefObject
    }

    static def attributeDefinitions(attributeDefYaml, String defaultPackageName) {

        attributeDefYaml.collect { a ->
            def attribute = new Attribute()
            attribute.name = a.name
            attribute.description = a.description
            attribute.type = typeDefinitionFromTypeName(a.type, defaultPackageName)

            attribute
        }
    }

    static def functionDefinitions(functionsYaml, String defaultPackageName) {
        functionsYaml.collect { f ->
            def function = new ServiceFunction()
            function.name = f.name
            function.description = f.description
            if(f.parameters!=null){
                function.parameters = functionParameterDefinition(f.parameters, defaultPackageName)
            }

            if(f.return_type != null && !"".equals(f.return_type)){
                def returnType = typeDefinitionFromTypeName(f.return_type, defaultPackageName)
                if (returnType.name != null && !'void'.equals(returnType.name)) {
                    function.returnType = returnType
                }
            }
            function
        }
    }

    static def functionParameterDefinition(parametersYaml, String defaultPackageName){
        parametersYaml.collect{ p ->
            def serviceFunctionParameter = new ServiceFunctionParameter()
            serviceFunctionParameter.name = p.name
            serviceFunctionParameter.description = p.description
            serviceFunctionParameter.type = typeDefinitionFromTypeName(p.type, defaultPackageName)
            serviceFunctionParameter
        }
    }

    static Type typeDefinitionFromTypeName(String typeIdentifier, String defaultPackageName){
        if(typeIdentifier == null)return null;

        Type type = new Type()
        //handle generics
        def typeName = typeIdentifier

        def typeParameterOffset = typeIdentifier.indexOf('<')
        if(typeParameterOffset != -1 ){ // if generic
            typeName = typeIdentifier.substring(0, typeParameterOffset)
            def typeArgumentNames = typeIdentifier.substring(typeParameterOffset+1, typeIdentifier.length()-1).split(',')
            type.typeArguments = []
            typeArgumentNames.each{ t ->
                type.typeArguments << typeDefinitionFromTypeName(t.trim(), defaultPackageName)
            }
        }

        def packageNameOffset = typeName.lastIndexOf('.')
        if(packageNameOffset != -1){
            type.name = typeName.substring(packageNameOffset+1)
            type.packageName = typeName.substring(0, packageNameOffset)
        }
        else{
            if(customDefinitions.containsKey(typeName)){
                def customType = customDefinitions.get(typeName)
                type.name = customType.name
                type.packageName = customType.packageName
            }
            else{
                type.name = typeName
            }
        }
        correctPackageName(type, defaultPackageName)
        type

    }

    static void correctPackageName(Type type, String defaultPackageName){
        if(type && !isBasicType(type)){
            if(!type.packageName){
                type.packageName = defaultPackageName
            }
        }
    }

    static boolean isBasicType(type){
        ['Object', 'Byte', 'String', 'Boolean', 'Integer', 'Long', 'Short', 'Double', 'Float', 'Character'].any { name ->
            name.equals(type.name)
        } && !type.packageName
    }

    static boolean isCollection(Type type){
        if("java.util".equals(type.packageName)){
            return Collection.isAssignableFrom(forName(type.fullQualifiedName))
        }
        return false
    }
}
