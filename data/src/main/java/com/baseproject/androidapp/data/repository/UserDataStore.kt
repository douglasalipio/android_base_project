package com.baseproject.androidapp.data.repository

import com.baseproject.androidapp.data.model.UserEntity

interface UserDataStore {

    suspend fun insertAll(users: List<UserEntity>)

    suspend fun loadById(vararg ids: Long): List<UserEntity>

    suspend fun loadAll(): List<UserEntity>

    suspend fun deleteUser(userEntity: UserEntity)

}