package com.korwe.kordapt.api.util

import com.korwe.kordapt.api.bean.Type
import org.testng.annotations.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

/**
 * Created by tjad on 2015/05/27.
 */

class ApiUtilTest {

    @Test
    public void typeDefinitionFromTypeName_shouldReturnTypeArguments(){

        def argumentType = new Type("my.testing", "SimpleObject")
        String typeIdentifier = "List<${argumentType.definitionString}>"
        String defaultPackgeName = "com.testing.dto"

        def type = ApiUtil.typeDefinitionFromTypeName(typeIdentifier, defaultPackgeName)
        assertThat(type, notNullValue())

        assertThat(type.typeArguments,
                allOf(
                        notNullValue(),
                        not(empty()),
                        contains(argumentType)
                ))

    }



    @Test
    public void testTypeIsNotBasicType(){
        def type = new Type("my.testing", "SimpleObject")

        assertThat(ApiUtil.isBasicType(type), is(false))
    }

    @Test
    public void testTypeIsBasicType(){

    }

    @Test
    public void typeDefinitionFromTypeName_shouldPopulateArrayDimension(){
        def type = new Type("my.testing", "SimpleObject")
        String defaultPackgeName = "com.testing.dto"
        String typeIdentifier = "${type.definitionString}[]";
        def populatedType = ApiUtil.typeDefinitionFromTypeName(typeIdentifier, defaultPackgeName)

        assertThat(populatedType, notNullValue())
        assertThat(populatedType.name, equalTo(type.name))
        assertThat(populatedType.arrayDimension, allOf(
          notNullValue(),
          equalTo(1)
        ))


        typeIdentifier = "${type.definitionString}[][]";
        populatedType = ApiUtil.typeDefinitionFromTypeName(typeIdentifier, defaultPackgeName)

        assertThat(populatedType, notNullValue())
        assertThat(populatedType.name, equalTo(type.name))
        assertThat(populatedType.arrayDimension, allOf(
                notNullValue(),
                equalTo(2)
        ))


        def argumentType = new Type("my.testing", "SimpleObjectArgument")
        typeIdentifier = "List<${argumentType.definitionString}>[]"

        populatedType = ApiUtil.typeDefinitionFromTypeName(typeIdentifier, defaultPackgeName)

        assertThat(populatedType, notNullValue())
        assertThat(populatedType.arrayDimension, allOf(
                notNullValue(),
                equalTo(1)
        ))

        assertThat(populatedType.typeArguments,
                allOf(
                        notNullValue(),
                        not(empty()),
                        contains(argumentType)
                ))


    }
}
