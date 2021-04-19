package com.baseproject.androidapp.cache.mapper

import com.baseproject.androidapp.cache.model.UserModel
import com.baseproject.androidapp.data.mapper.Mapper
import com.baseproject.androidapp.data.model.UserEntity

class UserModelMapper : Mapper<UserModel, UserEntity> {

    override fun map(from: UserModel): UserEntity =
        UserEntity(from.uid, from.name, from.lastName, from.avatar)
}