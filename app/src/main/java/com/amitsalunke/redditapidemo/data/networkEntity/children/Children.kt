package com.amitsalunke.redditapidemo.data.networkEntity.children

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("kind")
    @Expose
    private var kind: String,

    @SerializedName("data")
    @Expose
    private var data: Data
)