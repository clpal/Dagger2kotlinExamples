package clpal.example.kotlin.dagger2.di

import clpal.example.kotlin.dagger2.Battery
import clpal.example.kotlin.dagger2.DryCellBattery
import dagger.Binds
import dagger.Module

@Module
interface DryCellModule {

    @Binds
    fun bindBattery(dryCellBattery: DryCellBattery): Battery

}