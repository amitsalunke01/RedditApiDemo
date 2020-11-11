package com.amitsalunke.redditapidemo.data.cacheEntity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "RedditData")
class RedditCacheEntity(
    @PrimaryKey(autoGenerate = true)
    private var id: Int,
    private var author_fullname: String,
    private var title: String,
    private var name: String,
    private var total_awards_received: Int
)