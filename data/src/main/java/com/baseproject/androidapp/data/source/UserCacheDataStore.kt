package com.baseproject.androidapp.data.source

import com.baseproject.androidapp.data.model.UserEntity
import com.baseproject.androidapp.data.repository.UserCache
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import sun.rmi.runtime.Log

class UserCacheDataStore(private val userCache: UserCache) : UserCache {

    override fun getAll(): Flow<UserEntity> = userCache.getAll().map { it }

    override fun loadAllByIds(vararg userIds: Long) =
        userCache.loadAllByIds(userIds = userIds).map { it }

    override fun findByName(firstName: String) = userCache.findByName(firstName)

    override fun insertAll(vararg users: UserEntity) = userCache.insertAll(users = users)

    override fun delete(user: UserEntity) = userCache.delete(user)

    override fun isCached() = userCache.isCached()

    override fun setLastCacheTime(lastCache: Long) = userCache.setLastCacheTime(lastCache)

    override fun isExpired() = userCache.isExpired()

}