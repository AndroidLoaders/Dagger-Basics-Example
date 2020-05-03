package com.example.dagger_example.di

import com.example.dagger_example.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object {

        @Provides
        @Singleton
        fun provideDriver(): Driver = Driver()
    }
}