package com.example.dagger_example.di

import com.example.dagger_example.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver():Driver
}