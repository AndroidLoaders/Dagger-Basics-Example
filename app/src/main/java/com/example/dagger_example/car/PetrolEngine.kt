package com.example.dagger_example.car

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse_power")
    private val horsePower: Int,

    @Named("engine_capacity")
    private val engineCapacity: Int
    ) : Engine {

    override fun startEngine() {
        println("${Car.TAG} Petrol Engine Started")
        println("${Car.TAG} Engine Horse-Power : $horsePower")
        println("${Car.TAG} Engine Capacity : $engineCapacity")
    }
}