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
    public void typeDefinitionFromTypeNameShouldReturnTypeArguments(){

        def argumentType = new Type("SimpleObject", "my.testing")
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
        def type = new Type("SimpleObject", "my.testing")

        assertThat(ApiUtil.isBasicType(type), is(false))
    }

    @Test
    public void testTypeIsBasicType(){

    }
}
