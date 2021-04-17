package com.baseproject.androidapp.cache

interface PreferencesCache {

    fun getLastCacheTime(): Long

    fun setLastCacheTime(time: Long)
}