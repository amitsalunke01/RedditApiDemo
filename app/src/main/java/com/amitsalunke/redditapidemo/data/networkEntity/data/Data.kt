package com.amitsalunke.redditapidemo.data.networkEntity.data

import com.amitsalunke.redditapidemo.data.networkEntity.children.Children
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("modhash")
    @Expose
    var modhash: String,

    @SerializedName("dist")
    @Expose
    var dist: String,

    @SerializedName("children")
    @Expose
    var children: ArrayList<Children>

)