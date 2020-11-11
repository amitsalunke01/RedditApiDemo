package com.amitsalunke.redditapidemo.data.networkEntity

import com.amitsalunke.redditapidemo.data.networkEntity.data.Data
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class RedditResponse(
    @SerializedName("kind")
    @Expose
    private var kind: String,

    @SerializedName("data")
    @Expose
    private var data: Data
)