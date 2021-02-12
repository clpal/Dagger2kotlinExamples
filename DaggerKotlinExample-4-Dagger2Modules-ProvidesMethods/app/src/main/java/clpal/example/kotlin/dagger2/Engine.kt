package clpal.example.kotlin.dagger2

// we can not anotated @ Engine @Inject constructor()
class Engine constructor(
    val piston: Piston,
    val crankShaft: CrankShaft
) {

    //this class is not part of our own code
    //this class is from third party library
    //so we cannot change any code in this class

    fun start(){
        Utils.showTag("Engine has started")
    }

}