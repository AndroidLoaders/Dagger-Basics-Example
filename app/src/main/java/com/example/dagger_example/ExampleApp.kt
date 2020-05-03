package com.example.dagger_example

import android.app.Application
import com.example.dagger_example.di.AppComponent
import com.example.dagger_example.di.DaggerAppComponent

class ExampleApp : Application() {

    companion object {
        internal val APP_COMPONENT: AppComponent by lazy { DaggerAppComponent.create() }
    }
}