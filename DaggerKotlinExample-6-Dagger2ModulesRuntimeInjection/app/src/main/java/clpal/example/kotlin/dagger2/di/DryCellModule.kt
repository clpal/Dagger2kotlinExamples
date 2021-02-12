package clpal.example.kotlin.dagger2.di

import clpal.example.kotlin.dagger2.Battery
import clpal.example.kotlin.dagger2.DryCellBattery
import dagger.Module
import dagger.Provides

@Module
class DryCellModule {

    private val voltage: Double

    constructor(voltage: Double) {
        this.voltage = voltage
    }

    @Provides
    fun provideBattery(): Battery {
        return DryCellBattery(voltage)
    }


}