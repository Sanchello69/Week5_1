package com.vas.week5_1.di

import com.vas.feature_main_screen.di.MainDeps
import com.vas.feature_main_screen.presentation.MainViewModelFactory
import com.vas.week5_1.MainActivity
import dagger.Component

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent : MainDeps {

    override val mainViewModelFactory: MainViewModelFactory

    fun inject(mainActivity: MainActivity)
}