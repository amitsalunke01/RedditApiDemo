package com.amitsalunke.redditapidemo.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.amitsalunke.redditapidemo.data.cacheEntity.RedditCacheEntity

@Database(entities = [RedditCacheEntity::class], version = 1)
abstract class RedditDatabase : RoomDatabase() {

    abstract fun redditDao(): RedditDao

    companion object {
        val DATABASE_NAME: String = "Reddit_DB"
    }
}