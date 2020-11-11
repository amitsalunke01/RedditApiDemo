package com.amitsalunke.redditapidemo.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RedditData(
    var author_fullname: String,
    var title: String,
    var name: String,
    var total_awards_received: Int
)