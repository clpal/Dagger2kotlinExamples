package clpal.example.kotlin.dagger2

class DryCellBattery : Battery {

    val voltage: Double

    constructor(voltage: Double) {
        this.voltage = voltage
    }

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready, voltage, $voltage")
    }
}