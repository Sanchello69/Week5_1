package com.vas.week5_1.app

import android.app.Application
import com.vas.feature_main_screen.di.MainDepsStore
import com.vas.week5_1.di.AppComponent
import com.vas.week5_1.di.DaggerAppComponent

class App : Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()

        MainDepsStore.deps = appComponent
    }
}