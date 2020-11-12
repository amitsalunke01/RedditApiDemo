package com.amitsalunke.redditapidemo.data.cacheEntity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "RedditData")
data class RedditCacheEntity(
    var author_fullname: String,
    var title: String,
    var name: String,
    var total_awards_received: Int
) {
    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0
}