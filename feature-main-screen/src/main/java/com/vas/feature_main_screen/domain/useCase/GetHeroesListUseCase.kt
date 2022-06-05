package com.vas.feature_main_screen.domain.useCase

import com.vas.feature_main_screen.domain.model.Hero
import com.vas.feature_main_screen.domain.repository.MainRepository

class GetHeroesListUseCase(private val mainRepository: MainRepository) {

    suspend fun execute(): List<Hero> {
        return mainRepository.getHeroesListResult()
    }
}