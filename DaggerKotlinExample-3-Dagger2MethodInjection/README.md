# Dagger 2
Method Injection. 

// Car class

// method injection with car & licensePlate,method param is Depency of Car class

    @Inject
    fun attachToLicensePlate(licensePlate: LicensePlate) {
        licensePlate.attachToCar(this)
    }

class LicensePlate {
// method refernce constructor @Inject
    @Inject
    constructor()
    
    fun attachToCar(car: Car) {
        Utils.showTag("License plate is attached")
    }
