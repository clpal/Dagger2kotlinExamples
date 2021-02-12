package clpal.example.kotlin.dagger2

import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var battery: Battery


) {
   // lateinit var battery: Battery @Inject set
    // lateinit is optional in field & method injection
    fun drive() {
        battery.ignite()
        engine.start()
        Utils.showTag("Vhrooom! Car is driving")
    }
// method injection with car & licensePlate
    // method param is Depency of Car class
    @Inject
    fun attachToLicensePlate(licensePlate: LicensePlate) {
        licensePlate.attachToCar(this)
    }

}