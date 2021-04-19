package com.baseproject.androidapp.cache.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.baseproject.androidapp.cache.model.UserModel

interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<UserModel>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserModel>

    @Query(
        "SELECT * FROM user WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1"
    )
    fun findByName(first: String, last: String): UserModel

    @Insert
    fun insertAll(vararg users: UserModel)

    @Delete
    fun delete(user: UserModel)

}