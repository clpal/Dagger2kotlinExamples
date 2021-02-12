package clpal.sample.kotlin.dagger2

import javax.inject.Inject

class Engine @Inject constructor() {

    fun start(){
        Utils.showTag("Engine has started")
    }

}