package com.vas.week5_1.di

import com.vas.feature_details_screen.data.network.NetworkClientDetails
import com.vas.feature_details_screen.data.repository.DetailsRepositoryImpl
import com.vas.feature_details_screen.domain.repository.DetailsRepository
import com.vas.feature_main_screen.data.network.NetworkClient
import com.vas.feature_main_screen.data.repository.MainRepositoryImpl
import com.vas.feature_main_screen.domain.repository.MainRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideNetworkClient(): NetworkClient{
        return NetworkClient()
    }

    @Provides
    fun provideMainRepository(networkClient: NetworkClient): MainRepository {
        return MainRepositoryImpl(networkClient = networkClient)
    }

    @Provides
    fun provideNetworkClientDetails(): NetworkClientDetails{
        return NetworkClientDetails()
    }

    @Provides
    fun provideDetailsRepository(networkClient: NetworkClientDetails): DetailsRepository {
        return DetailsRepositoryImpl(networkClient = networkClient)
    }
}