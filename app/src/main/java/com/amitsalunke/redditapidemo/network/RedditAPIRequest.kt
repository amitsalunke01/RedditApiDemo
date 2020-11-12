package com.amitsalunke.redditapidemo.network

import com.amitsalunke.redditapidemo.data.networkEntity.RedditResponse
import retrofit2.http.GET

interface RedditAPIRequest {
    @GET(".json")
    suspend fun getRedditAPIList(): RedditResponse
}