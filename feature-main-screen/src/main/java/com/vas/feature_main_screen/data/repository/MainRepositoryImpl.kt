package com.vas.feature_main_screen.data.repository

import com.vas.feature_main_screen.data.network.NetworkClient
import com.vas.feature_main_screen.domain.model.Hero
import com.vas.feature_main_screen.domain.repository.MainRepository

class MainRepositoryImpl(private val networkClient: NetworkClient): MainRepository {

    override suspend fun getMainResult() : List<Hero> = networkClient.getHeroesList().map {
            Hero(
                id = it.id,
                name = it.name,
                urlIcon = it.urlIcon
            )
        }
}