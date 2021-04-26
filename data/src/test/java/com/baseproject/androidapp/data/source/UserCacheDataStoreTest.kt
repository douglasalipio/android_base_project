package com.baseproject.androidapp.data.source

import com.baseproject.androidapp.data.model.UserEntity
import com.baseproject.androidapp.data.repository.UserCache
import com.nhaarman.mockito_kotlin.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class UserCacheDataStoreTest {

    @Mock
    private lateinit var userCacheMock: UserCache
    private lateinit var userCacheDataStore: UserCacheDataStore

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        userCacheDataStore = UserCacheDataStore(userCacheMock)
    }

    @Test
    fun `request save user`() {
        //given
        val fakeUserEntity = UserEntity(1L, "Douglas", "Mesquita", "URL")
        //when
        userCacheDataStore.insertAll(fakeUserEntity)
        //then
        verify(userCacheMock).insertAll(fakeUserEntity)
    }

    @Test
    fun `request delete user`() {
        //given
        val fakeUserEntity = UserEntity(1L, "Douglas", "Mesquita", "URL")
        //when
        doNothing().`when`(userCacheMock).delete(fakeUserEntity)
        userCacheDataStore.delete(fakeUserEntity)
        //then
        verify(userCacheMock).delete(fakeUserEntity)
    }

    @Test
    fun `request get all user`() {
        //given
        val fakeUserEntity = UserEntity(1L, "Douglas", "Mesquita", "URL")
        //when
        userCacheDataStore.getAll()
        //then
        verify(userCacheMock).getAll()
    }

    @Test
    fun `request load all by Ids`() {
        //given
        val fakeIds = longArrayOf(1L, 2L, 3L)
        val fakeUserEntity = UserEntity(1L, "Douglas", "Mesquita", "URL")
        //when
        userCacheDataStore.loadAllByIds(userIds = fakeIds)
        //then
        verify(userCacheMock).loadAllByIds(userIds = fakeIds)
    }

    @Test
    fun `request user by name`() {
        //given
        val name = "Douglas"
        val fakeUserEntity = UserEntity(1L, "Douglas", "Mesquita", "URL")
        //when
        userCacheDataStore.findByName(name)
        //then
        verify(userCacheMock).findByName(name)
    }

    @Test
    fun `request user's cache`() {
        //given
        val name = "Douglas"
        //when
        userCacheDataStore.isCached()
        //then
        verify(userCacheMock).isCached()
    }

    @Test
    fun `request set last cache time`() {
        //given
        val cacheTime = 123L
        //when
        userCacheDataStore.setLastCacheTime(cacheTime)
        //then
        verify(userCacheMock).setLastCacheTime(cacheTime)
    }

    @Test
    fun `request user's cache expire`() {
        //given
        val cacheTime = 123L
        //when
        userCacheDataStore.isExpired()
        //then
        verify(userCacheMock).isExpired()
    }
}