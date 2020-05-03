package com.example.dagger_example.car

import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun startEngine() {
        println("${Car.TAG} Diesel Engine Started")
        println("${Car.TAG} Engine Horse-Power : $horsePower")
    }
}