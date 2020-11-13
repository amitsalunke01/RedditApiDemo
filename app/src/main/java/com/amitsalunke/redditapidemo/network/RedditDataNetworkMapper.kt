package com.amitsalunke.redditapidemo.network

import com.amitsalunke.redditapidemo.data.model.RedditData
import com.amitsalunke.redditapidemo.data.networkEntity.children.Data
import com.amitsalunke.redditapidemo.util.EntityMapper
import javax.inject.Inject

class RedditDataNetworkMapper @Inject constructor() : EntityMapper<Data, RedditData> {
    override fun mapEntityToDomain(entity: Data): RedditData {
        return RedditData(
            author_fullname = entity.author_fullname,
            title = entity.title,
            name = entity.name,
            total_awards_received = entity.total_awards_received
        )
    }

    override fun mapDomainToEntity(domain: RedditData): Data {
        return Data(
            author_fullname = domain.author_fullname,
            title = domain.title,
            name = domain.name,
            total_awards_received = domain.total_awards_received
        )
    }

    fun mapEntityToDomainList(data: ArrayList<Data>): List<RedditData> {
        return data.map { data -> mapEntityToDomain(data) }
    }
}