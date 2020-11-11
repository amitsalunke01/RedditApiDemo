package com.amitsalunke.redditapidemo.util

interface EntityMapper<Entity, DomainModel> {
    fun mapEntityToDomain(entity: Entity): DomainModel
    fun mapDomainToEntity(domain: DomainModel): Entity
}