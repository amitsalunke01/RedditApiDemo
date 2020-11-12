package com.amitsalunke.redditapidemo.data.networkEntity

import com.amitsalunke.redditapidemo.data.networkEntity.data.Data
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RedditResponse(
    @SerializedName("kind")
    @Expose
    var kind: String,

    @SerializedName("data")
    @Expose
    var data: Data
)