package com.korwe.kordapt.api.util

import com.esotericsoftware.yamlbeans.YamlReader
import com.korwe.kordapt.api.bean.*
/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 */
class ApiUtil {

    static customDefinitions = ['Object': new Type('Object', null),
                             'DateTime': new Type('DateTime', 'org.joda.time'),
                             'Set': new Type('Set', 'java.util'),
                             'List': new Type('List', 'java.util'),
                             'Map': new Type('Map','java.util')]

    static Service populateServiceFromApi(File file) {
        populateServiceFromApi(new FileInputStream(file))


    }
    static Service populateServiceFromApi(InputStream inputStream){

        def reader = new YamlReader(new InputStreamReader(inputStream))

        def serviceYaml = reader.read()

        //Populate service definition object
        def serviceDefinition = new Service()

        //Set name and packageName(if packageName exists)
        String serviceYamlName = serviceYaml.name
        def packageNameOffset = serviceYamlName.lastIndexOf('.')
        if(packageNameOffset != -1){
            serviceDefinition.name = serviceYamlName.substring(packageNameOffset+1)
            serviceDefinition.packageName = serviceYamlName.substring(0, packageNameOffset)
        }
        else{
            serviceDefinition.name = serviceYamlName
        }

        //Populate service function definition objects
        serviceDefinition.functions = functionDefinitions(serviceYaml.functions)
        serviceDefinition
    }

    static def populateTypeFromApi(File file) {
        def reader = new YamlReader(new FileReader(file))
        def typeYaml = reader.read()

        //Populate type def object
        def typeDefObject = typeDefinitionFromTypeName(typeYaml.name)
        typeDefObject.inheritsFrom = typeDefinitionFromTypeName(typeYaml.inherits_from)
        typeDefObject.attributes = attributeDefinitions(typeYaml.attributes)

        typeDefObject

    }

    static def attributeDefinitions(attributeDefYaml) {

        attributeDefYaml.collect { a ->
            def attribute = new Attribute()
            attribute.name = a.name
            attribute.description = a.description
            attribute.type = typeDefinitionFromTypeName(a.type)

            attribute
        }
    }

    static def functionDefinitions(functionsYaml) {

        functionsYaml.collect { f ->
            def function = new ServiceFunction()
            function.name = f.name
            function.description = f.description
            if(f.parameters!=null){
                function.parameters = functionParameterDefinition(f.parameters)
            }

            if(f.return_type != null && !"".equals(f.return_type)){
                def returnType = typeDefinitionFromTypeName(f.return_type)
                if (returnType.name != null && !'void'.equals(returnType.name)) {
                    function.returnType = returnType
                }
            }
            function
        }
    }

    static def functionParameterDefinition(parametersYaml){
        parametersYaml.collect{ p ->
            def serviceFunctionParameter = new ServiceFunctionParameter()
            serviceFunctionParameter.name = p.name
            serviceFunctionParameter.description = p.description
            serviceFunctionParameter.type = typeDefinitionFromTypeName(p.type)
            serviceFunctionParameter
        }
    }

    static def typeDefinitionFromTypeName(String typeIdentifier){
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
                type.typeArguments << typeDefinitionFromTypeName(t.trim())
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
        type

    }


    static def isBasicType(type){
        ['Object', 'Byte', 'String', 'Boolean', 'Integer', 'Long', 'Short', 'Double', 'Float', 'Character'].any { name ->
            name.equals(type.name)
        } && !type.packageName
    }
}
