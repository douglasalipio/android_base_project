package com.baseproject.androidapp.data

import com.baseproject.androidapp.domain.UserRepository
import com.baseproject.androidapp.domain.model.User

class UserRepositoryImp : UserRepository {

    override suspend fun save(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllByIds(vararg ids: Long): User {
        TODO("Not yet implemented")
    }

    override suspend fun insertAll(vararg users: List<User>) {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): List<User> {
        TODO("Not yet implemented")
    }
}