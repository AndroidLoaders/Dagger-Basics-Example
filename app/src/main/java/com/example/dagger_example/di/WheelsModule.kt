package com.example.dagger_example.di

import com.example.dagger_example.car.Rims
import com.example.dagger_example.car.Tires
import com.example.dagger_example.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    companion object {

        @Provides
        fun provideRims() = Rims()

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels = Wheels(rims, tires)
    }
}