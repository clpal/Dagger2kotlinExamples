package clpal.example.kotlin.dagger2.di

import clpal.example.kotlin.dagger2.Battery
import clpal.example.kotlin.dagger2.WetCellBattery
import dagger.Binds
import dagger.Module

@Module
interface WetCellModule {

    @Binds
    fun bindBattery(wetCellBattery: WetCellBattery): Battery

}