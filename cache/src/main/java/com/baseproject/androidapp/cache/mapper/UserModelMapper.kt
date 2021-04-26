package com.baseproject.androidapp.cache.mapper

import com.baseproject.androidapp.cache.model.UserModel
import com.baseproject.androidapp.data.mapper.Mapper
import com.baseproject.androidapp.data.model.UserEntity

class UserModelMapper : Mapper<UserEntity,UserModel> {

    override fun map(from: UserEntity): UserModel =
        UserModel(from.id, from.name, from.lastName, from.avatar)
}