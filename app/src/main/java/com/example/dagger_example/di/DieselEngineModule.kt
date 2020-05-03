package com.example.dagger_example.di

import com.example.dagger_example.car.DieselEngine
import com.example.dagger_example.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindDieselEngine(engine: DieselEngine): Engine
}