package clpal.sample.kotlin.dagger2.di

import clpal.sample.kotlin.dagger2.Car
import dagger.Component

@Component
interface CarInjector {

    fun getCar(): Car

}
