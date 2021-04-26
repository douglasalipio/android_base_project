package com.baseproject.androidapp.cache

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class PreferencesCacheHelper @Inject constructor(context: Context) {

    private val bufferPref: SharedPreferences =
        context.getSharedPreferences(PREF_BUFFER_PACKAGE_NAME, Context.MODE_PRIVATE)

    companion object {
        private const val PREF_BUFFER_PACKAGE_NAME = "com.baseproject.androidapp.preferences"

        private const val PREF_KEY_LAST_CACHE = "last_cache"
    }

    fun getLastCacheTime() = bufferPref.getLong(PREF_KEY_LAST_CACHE, 0)

    fun setLastCacheTime(time: Long) {
        bufferPref.edit().putLong(PREF_KEY_LAST_CACHE, time).apply()
    }
}