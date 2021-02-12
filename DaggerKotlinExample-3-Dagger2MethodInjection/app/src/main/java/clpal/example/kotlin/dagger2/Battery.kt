package clpal.example.kotlin.dagger2

import javax.inject.Inject

class Battery @Inject constructor() {
    fun ignite(){
        Utils.showTag("Battery is ready")
    }
}