package com.korwe.kordapt.gradle.util

import com.korwe.kordapt.api.bean.Type
import org.testng.annotations.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * */
class GeneratorUtilTest {
    @Test
    public void typeArgumentImportsShouldAddTypesOfDifferentBasePackage(){

        Type type = new Type("java.util", "List")
        def argumentType = new Type("my.testing", "SimpleObject")

        type.typeArguments << argumentType

        String basePackgeName = "com.testing.dto"

        assertThat("Argument type package should be different from basePackage",
                argumentType.packageName, not(basePackgeName))


        assertThat(type.typeArguments,
                allOf(
                        notNullValue(),
                        not(empty()),
                        contains(argumentType)
                ))

        def imports = GeneratorUtil.typeArgumentImports(basePackgeName, type)

        assertThat(imports, allOf(
                notNullValue(),
                not(empty()),
                contains(argumentType.definitionString)
        ))


    }



    @Test
    public void typeArgumentImportsShouldNotAddTypesOfSameBasePackage(){
        Type type = new Type("java.util", "List")
        def argumentType = new Type("my.testing", "SimpleObject")

        type.typeArguments << argumentType

        String basePackgeName = "my.testing"

        assertThat("Argument type package should be same as basePackage",
                basePackgeName.equals(argumentType.packageName))


        assertThat(type.typeArguments,
                allOf(
                        notNullValue(),
                        not(empty()),
                        contains(argumentType)
                ))

        def imports = GeneratorUtil.typeArgumentImports(basePackgeName, type)

        assertThat(imports, allOf(
                notNullValue(),
                empty(),
                not(contains(argumentType.definitionString))
        ))

    }
}
