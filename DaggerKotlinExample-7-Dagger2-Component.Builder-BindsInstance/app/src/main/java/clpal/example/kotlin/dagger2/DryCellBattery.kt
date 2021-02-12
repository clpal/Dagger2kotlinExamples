package clpal.example.kotlin.dagger2

import javax.inject.Inject

class DryCellBattery : Battery {

    val voltage: Double

    @Inject
    constructor(voltage: Double) {
        this.voltage = voltage
    }

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready, voltage, $voltage")
    }
}