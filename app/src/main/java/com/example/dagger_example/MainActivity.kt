package com.example.dagger_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_example.car.Car
import com.example.dagger_example.di.DaggerActivityComponent
import javax.inject.Inject

open class MainActivity : AppCompatActivity() {

    /**
     * This demo is prepared from
     * https://www.youtube.com/playlist?list=PLrnPJCHvNZuA2ioi4soDZKz8euUQnJW65
     *
     * Dagger will the dependencies in following manner
     * 1). It will call constructor first and inject all the dependencies then
     * 2). It will inject all the parameters of the class then
     * 3). Finally it will inject all the methods of the class
     *
     * Conclusion : constructor ----- parameters ----- methods
     *
     * and it will inject only those methods, variables and constructors which has
     * @Inject annotation.
     *
     * For example below, in Car class drive() method is not annotated with @Inject
     * annotation so it wont be call after Dependency Injection but connectToRemote()
     * method is annotated with @Inject annotation so it will b called as soon as car
     * object will be initialized.
     * */

    @set:Inject
    internal var car1: Car? = null

    @set:Inject
    internal var car2: Car? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val carComponent = DaggerCarComponent.create()
        /**
         * Above code will only work when none of the module in components takes
         * arguments over the constructor.
         * */

        /*val carComponent1 = DaggerCarComponent.builder().bindHorsePower(1100)
            .bindEngineCapacity(100)
            .build()*/

        //carComponent.inject(this)

        /*val carComponent2 = DaggerCarComponent.builder().bindHorsePower(1100)
            .bindEngineCapacity(100)
            .build()
        carComponent2.getCar().drive()*/

        /*car1?.drive()
        car2?.drive()*/

        val carComponent = DaggerActivityComponent.builder().bindHorsePower(1100)
            .bindEngineCapacity(100)
            .setAppComponent(ExampleApp.APP_COMPONENT)
            .build()
        carComponent.getCar().drive()
    }
}
