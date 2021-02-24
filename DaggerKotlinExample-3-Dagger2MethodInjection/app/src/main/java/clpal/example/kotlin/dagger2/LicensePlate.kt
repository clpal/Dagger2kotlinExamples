package clpal.example.kotlin.dagger2

import javax.inject.Inject

class LicensePlate {
// method refernce constructor @Inject
    @Inject
    constructor()

    fun attachToCar(car: Car) {
        Utils.showTag("License plate is attached")
    }

}
