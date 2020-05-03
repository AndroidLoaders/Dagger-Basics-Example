package com.example.dagger_example.di

import com.example.dagger_example.annotations.PerActivity
import com.example.dagger_example.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Most imp Note : Here you can not apply PetrolEngine::class and DieselEngineModule::class
 * both together because both implements Engine class also in both provides(returns) Engine
 * object.
 *
 * Hence we can only add either PetrolEngine::class or DieselEngineModule::class at a time
 * in the array of modules
 * */

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineWithHorsePowerModule::class])
interface ActivityComponent {
    fun getCar(): Car
    //fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        /**
         * @Named(any String) annotation is not compulsory when you have only one method
         * with return type in Builder Class.
         *
         * Also try with, 2 Arguments in PetrolEngine class and only one method that return
         * Int value
         * */

        @BindsInstance
        fun bindHorsePower(@Named("horse_power") horsePower: Int): Builder

        @BindsInstance
        fun bindEngineCapacity(@Named("engine_capacity") engineCapacity: Int): Builder

        fun setAppComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }
}