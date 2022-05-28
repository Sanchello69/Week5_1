package com.vas.feature_main_screen.domain.repository

import com.vas.feature_main_screen.domain.model.Hero

interface MainRepository {
    suspend fun getMainResult() : List<Hero>
}