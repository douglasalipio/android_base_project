package com.baseproject.androidapp.domain

import com.baseproject.androidapp.domain.model.User

interface UserRepository {

    suspend fun save(user: User)

    suspend fun delete(user: User)

    suspend fun getAllByIds(vararg ids: Long): User

    suspend fun insertAll(vararg users: List<User>)

    suspend fun getAll(): List<User>
}