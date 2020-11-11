package com.amitsalunke.redditapidemo.data.networkEntity.children

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("author_fullname")
    @Expose
    var author_fullname: String,

    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("total_awards_received")
    @Expose
    var total_awards_received: Int
)