package clpal.example.kotlin.dagger2

import javax.inject.Inject

class DryCellBattery : Battery {

    @Inject
    constructor()

    override fun ignite() {
        Utils.showTag("DryCell Battery is ready")
    }
}