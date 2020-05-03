package com.example.dagger_example.di

import com.example.dagger_example.car.DieselEngine
import com.example.dagger_example.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineWithHorsePowerModule(private val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine = DieselEngine(horsePower)
}