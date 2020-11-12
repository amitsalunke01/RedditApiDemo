package com.amitsalunke.redditapidemo.di

import com.amitsalunke.redditapidemo.RedditRepository
import com.amitsalunke.redditapidemo.cache.RedditDao
import com.amitsalunke.redditapidemo.cache.RedditDataCacheMapper
import com.amitsalunke.redditapidemo.network.RedditAPIRequest
import com.amitsalunke.redditapidemo.network.RedditDataNetworkMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun providesRedditRepository(
        redditDao: RedditDao,
        redditDataCacheMapper: RedditDataCacheMapper,
        redditAPIRequest: RedditAPIRequest,
        redditDataNetworkMapper: RedditDataNetworkMapper
    ): RedditRepository {
        return RedditRepository(
            redditDao,
            redditDataCacheMapper,
            redditAPIRequest,
            redditDataNetworkMapper
        )
    }
}