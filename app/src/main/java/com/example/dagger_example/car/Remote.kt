package com.example.dagger_example.car

import javax.inject.Inject

class Remote @Inject constructor() {
    internal fun setRemoteListener(car: Car) = println("${Car.TAG} Remote Listener connected...")
}