package clpal.example.kotlin.dagger2

import javax.inject.Inject

class LicensePlate {

    @Inject
    constructor()

    fun attachToCar(car: Car) {
        Utils.showTag("License plate is attached")
    }

}