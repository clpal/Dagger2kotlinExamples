package clpal.sample.kotlin.dagger2

import javax.inject.Inject

class Car @Inject constructor(
    var engine: Engine,
    var battery: Battery
) {

    fun drive() {
        engine.start()
        battery.ignite()

        Utils.showTag("Vhrooom! Car is driving")
    }

}