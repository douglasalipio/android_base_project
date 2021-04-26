package com.baseproject.androidapp.cache.disk

import com.baseproject.androidapp.data.model.UserEntity
import com.baseproject.androidapp.data.repository.UserCache
import kotlinx.coroutines.flow.Flow

class UserCacheImp() : UserCache {
    override fun getAll(): Flow<UserEntity> {
        TODO("Not yet implemented")
    }

    override fun loadAllByIds(userIds: IntArray): Flow<UserEntity> {
        TODO("Not yet implemented")
    }

    override fun findByName(first: String, last: String): Flow<UserEntity> {
        TODO("Not yet implemented")
    }

    override fun insertAll(vararg users: UserEntity) {
        TODO("Not yet implemented")
    }

    override fun delete(user: UserEntity) {
        TODO("Not yet implemented")
    }

    override fun isCached(): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override fun setLastCacheTime(lastCache: Long) {
        TODO("Not yet implemented")
    }

    override fun isExpired(): Flow<Boolean> {
        TODO("Not yet implemented")
    }


}