package com.baseproject.androidapp.data.mapper

import com.baseproject.androidapp.data.model.UserEntity
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.SoftAssertions
import org.junit.Before
import org.junit.Test

class UserEntityMapperTest {

    private lateinit var userEntityMapperTest: UserEntityMapper

    @Before
    fun setUp() {
        userEntityMapperTest = UserEntityMapper()
    }

    @Test
    fun `map user entity to user model`() {

        val userModel = userEntityMapperTest.map(userEntityFake())
        SoftAssertions.assertSoftly {
            assertThat(userModel.id).isEqualTo(userEntityFake().id)
            assertThat(userModel.name).isEqualTo(userEntityFake().name)
            assertThat(userModel.lastName).isEqualTo(userEntityFake().lastName)
            assertThat(userModel.avatar).isEqualTo(userEntityFake().avatar)
        }
    }

    private fun userEntityFake() = UserEntity(1L, "Douglas", "Mesquita", "URL")

}