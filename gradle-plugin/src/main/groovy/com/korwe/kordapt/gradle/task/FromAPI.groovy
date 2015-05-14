package com.korwe.kordapt.gradle.task
import com.esotericsoftware.yamlbeans.YamlReader
import com.korwe.kordapt.api.bean.Attribute
import com.korwe.kordapt.api.bean.Service
import com.korwe.kordapt.api.bean.ServiceFunction
import com.korwe.kordapt.api.bean.ServiceFunctionParameter
import com.korwe.kordapt.api.bean.Type
import org.gradle.api.tasks.TaskAction
/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com>Dario Matonicki</a>
 * */
class FromAPI{

    public static void main(String[] args) {
        FromAPI fromAPI = new FromAPI()
        fromAPI.serviceFromApi()
        fromAPI.typeFromApi()
    }

    @TaskAction
    def serviceFromApi(){
        def reader = new YamlReader(new FileReader("/Users/dariom/Dev/clients/korwe/env_forge/korwe_dev_tree/korwe-dev/kordapt/service-registry/api-definition/services/com/korwe/kordapt/registry/service/ServiceRegistry.yaml"))
        def serviceYaml = reader.read()

        //Populate service definition object
        def serviceDefinition = new Service()
        serviceDefinition.name = serviceYaml.name

        //Populate service function definition objects
        serviceDefinition.functions = functionDefinitions(serviceYaml.functions)
    }

    @TaskAction
    def typeFromApi() {
        def reader = new YamlReader(new FileReader("/Users/dariom/Dev/clients/korwe/env_forge/korwe_dev_tree/korwe-dev/tree-services/services/api-definition/types/com/korwe/tree/domain/User.yaml"))
        def typeYaml = reader.read()

        //Populate type def object
        def typeDefObject = typeDefinitionFromTypeName(typeYaml.name)
        typeDefObject.inheritsFrom = typeDefinitionFromTypeName(typeYaml.inherits_from)
        typeDefObject.attributes = attributeDefinitions(typeYaml.attributes)

        println""
    }

    def attributeDefinitions(attributeDefYaml) {

        attributeDefYaml.collect { a ->
            def attribute = new Attribute()
            attribute.name = a.name
            attribute.description = a.description
            attribute.type = typeDefinitionFromTypeName(a.type)

            attribute
        }
    }

    def functionDefinitions(functionsYaml) {

        functionsYaml.collect { f ->
            def function = new ServiceFunction()
            function.name = f.name
            function.description = f.description
            function.parameters = functionParameterDefinition(f.parameters)
            def returnType = typeDefinitionFromTypeName(f.return_type)
            if (returnType.name != null || 'void'.equals(returnType.name)) {
                function.returnType = returnType
            }
            function
        }
    }

    def functionParameterDefinition(parametersYaml){
        parametersYaml.collect{ p ->
            def serviceFunctionParameter = new ServiceFunctionParameter()
            serviceFunctionParameter.name = p.name
            serviceFunctionParameter.description = p.description
            serviceFunctionParameter.type = typeDefinitionFromTypeName(p.type)
        }
    }

    def typeDefinitionFromTypeName(String typeIdentifier){
        Type type = new Type()
        //handle generics
        def typeName = typeIdentifier

        def typeParameterOffset = typeIdentifier.indexOf('<')
        if(typeParameterOffset != -1 ){ // if generic
            typeName = typeIdentifier.substring(0, typeParameterOffset)
            def typeArgumentNames = typeIdentifier.substring(typeParameterOffset+1, typeIdentifier.length()-1).split(',')
            type.typeArguments = []
            typeArgumentNames.each{ t ->
                type.typeArguments << typeDefinitionFromTypeName(t)
            }
        }

        def packageNameOffset = typeName.lastIndexOf('.')
        if(packageNameOffset != -1){
            type.name = typeName.substring(packageNameOffset+1)
            type.packageName = typeName.substring(0, packageNameOffset)
        }
        else{
            type.name = typeName
        }
        type

    }


}
