package com.baseproject.androidapp.cache.local

interface PreferencesCache {

    fun getLastCacheTime(): Long

    fun setLastCacheTime(time: Long)
}