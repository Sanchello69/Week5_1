package com.vas.feature_details_screen.data.repository

import com.vas.feature_details_screen.data.network.NetworkClientDetails
import com.vas.feature_details_screen.domain.model.Hero
import com.vas.feature_details_screen.domain.repository.DetailsRepository

class DetailsRepositoryImpl(private val networkClient: NetworkClientDetails): DetailsRepository {

    override suspend fun getDetailsResult(name: String): Hero {
        val heroApi = networkClient.getHeroesList().first{it.name==name}
        return Hero(
            id = heroApi.id,
            name = heroApi.name,
            urlImg = heroApi.urlImg,
            attackType = heroApi.attackType,
            roles = heroApi.roles,
            health = heroApi.health,
            healthRegen = heroApi.healthRegen,
            mana = heroApi.mana,
            manaRegen = heroApi.manaRegen,
            armor = heroApi.armor,
            str = heroApi.str,
            strGain = heroApi.strGain,
            agi = heroApi.agi,
            agiGain = heroApi.agiGain,
            int = heroApi.int,
            intGain = heroApi.intGain,
            attackMin = heroApi.attackMin,
            attackMax = heroApi.attackMax
        )
    }
}