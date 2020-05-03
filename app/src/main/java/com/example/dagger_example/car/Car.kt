package com.example.dagger_example.car

import com.example.dagger_example.annotations.PerActivity
import javax.inject.Inject

@PerActivity
data class Car @Inject constructor(
    private val engine: Engine, private val wheels: Wheels, private val driver: Driver
) {

    companion object {
        val TAG: String = "TAG --- ${Car::class.java.simpleName} ---"
    }

    @Inject
    fun connectToRemote(remote: Remote) = remote.setRemoteListener(this)

    fun drive() {
        engine.startEngine()
        println("$TAG driving a car...")
        println("$TAG driver : $driver --- car : $this")
    }
}