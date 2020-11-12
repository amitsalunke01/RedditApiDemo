package com.amitsalunke.redditapidemo.di

import android.content.Context
import androidx.room.Room
import com.amitsalunke.redditapidemo.cache.RedditDao
import com.amitsalunke.redditapidemo.cache.RedditDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun providesRedditDB(@ApplicationContext context: Context): RedditDatabase {
        return Room.databaseBuilder(
            context,
            RedditDatabase::class.java,
            RedditDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesRedditDao(redditDatabase: RedditDatabase): RedditDao {
        return redditDatabase.redditDao()
    }
}