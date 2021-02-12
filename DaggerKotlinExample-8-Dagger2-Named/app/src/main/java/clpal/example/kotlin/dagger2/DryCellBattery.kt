package clpal.example.kotlin.dagger2

import javax.inject.Inject
import javax.inject.Named

class DryCellBattery : Battery {

    val voltage: Double
    val capacity: Double

    @Inject
    constructor(
        @Named("voltage") voltage: Double,
        @Named("capacity") capacity: Double
    ) {
        this.voltage = voltage
        this.capacity = capacity
    }

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready, voltage, $voltage, capacity $capacity")
    }
}