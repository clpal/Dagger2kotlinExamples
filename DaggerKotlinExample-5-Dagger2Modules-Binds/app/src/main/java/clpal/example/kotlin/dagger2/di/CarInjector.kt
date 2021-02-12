package clpal.example.kotlin.dagger2.di

import clpal.example.kotlin.dagger2.Car
import clpal.example.kotlin.dagger2.MainActivity
import dagger.Component

@Component(modules = [EngineModule::class, DryCellModule::class])
interface CarInjector {

    fun getCar(): Car

    fun injectFields(mainActivity: MainActivity)

}