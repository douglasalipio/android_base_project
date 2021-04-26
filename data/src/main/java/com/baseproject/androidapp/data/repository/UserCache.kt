package com.baseproject.androidapp.data.repository

import com.baseproject.androidapp.data.model.UserEntity
import com.baseproject.androidapp.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserCache {

    fun getAll(): Flow<UserEntity>

    fun loadAllByIds(vararg userIds : Long): Flow<UserEntity>

    fun findByName(firstName: String): Flow<UserEntity>

    fun insertAll(vararg users: UserEntity)

    fun delete(user: UserEntity)

    fun isCached(): Flow<Boolean>

    fun setLastCacheTime(lastCache: Long)

    fun isExpired(): Flow<Boolean>
}