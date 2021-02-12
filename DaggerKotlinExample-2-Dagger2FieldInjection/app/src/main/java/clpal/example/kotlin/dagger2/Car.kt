package clpal.example.kotlin.dagger2

import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var battery: Battery
) {

    fun drive() {
        battery.ignite()
        engine.start()
        Utils.showTag("Vhrooom! Car is driving")
    }

}