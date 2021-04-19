package com.baseproject.androidapp.cache.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.baseproject.androidapp.cache.dao.UserDao
import com.baseproject.androidapp.cache.model.UserModel
import javax.inject.Inject

@Database(entities = [UserModel::class], version = 1)
abstract class AppDatabase @Inject constructor() : RoomDatabase() {

    abstract fun cachedUserDao(): UserDao

    private var INSTANCE: AppDatabase? = null

    private val sLock = Any()

    fun getInstance(context: Context): AppDatabase? {
        if (INSTANCE == null) {
            synchronized(sLock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java, "app_database.db"
                    )
                        .build()
                }
                return INSTANCE
            }
        }
        return INSTANCE
    }

}