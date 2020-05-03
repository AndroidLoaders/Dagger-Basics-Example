package com.example.dagger_example.di

import com.example.dagger_example.car.Engine
import com.example.dagger_example.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineWithHorsePowerModule() {

    @Binds
    abstract fun providePetrolEngine(engine: PetrolEngine): Engine
}