package com.vas.feature_details_screen.domain.useCase

import com.vas.feature_details_screen.domain.model.Hero
import com.vas.feature_details_screen.domain.repository.DetailsRepository

class GetDetailsUseCase(private val detailsRepository: DetailsRepository) {

    suspend fun execute(name: String): Hero {
        return detailsRepository.getDetailsResult(name)
    }
}