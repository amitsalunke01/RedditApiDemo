package com.amitsalunke.redditapidemo.cache

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amitsalunke.redditapidemo.data.cacheEntity.RedditCacheEntity

@Dao
interface RedditDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(redditCacheEntity: RedditCacheEntity): Long


    @Query("SELECT * FROM RedditData")
    suspend fun getRedditData(): List<RedditCacheEntity>
}