package com.amitsalunke.redditapidemo.cache

import com.amitsalunke.redditapidemo.data.cacheEntity.RedditCacheEntity
import com.amitsalunke.redditapidemo.data.model.RedditData
import com.amitsalunke.redditapidemo.util.EntityMapper
import javax.inject.Inject

class RedditDataCacheMapper @Inject constructor() : EntityMapper<RedditCacheEntity, RedditData> {
    override fun mapEntityToDomain(entity: RedditCacheEntity): RedditData {
        return RedditData(
            author_fullname = entity.author_fullname,
            title = entity.title,
            name = entity.name,
            total_awards_received = entity.total_awards_received
        )
    }

    override fun mapDomainToEntity(domain: RedditData): RedditCacheEntity {
        return RedditCacheEntity(
            author_fullname = domain.author_fullname,
            title = domain.title,
            name = domain.name,
            total_awards_received = domain.total_awards_received
        )
    }

    fun mapEntityToDomainList(entities: List<RedditCacheEntity>): List<RedditData> {
        return entities.map { entities -> mapEntityToDomain(entities) }
    }

}