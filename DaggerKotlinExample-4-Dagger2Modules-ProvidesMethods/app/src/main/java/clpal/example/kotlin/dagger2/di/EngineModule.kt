package clpal.example.kotlin.dagger2.di

import clpal.example.kotlin.dagger2.CrankShaft
import clpal.example.kotlin.dagger2.Engine
import clpal.example.kotlin.dagger2.Piston
import clpal.example.kotlin.dagger2.PistonRings
import dagger.Module
import dagger.Provides
// object EngineModule in kotlin class  method can not be static possible when we are using
//object keywords

// direct we can use EngineModule  method madatory  @Provides
@Module
object EngineModule {

    @Provides
    @JvmStatic
    fun provideCrankShaft(): CrankShaft {
        return CrankShaft()
    }

    @Provides
    @JvmStatic
    fun providePistonRings(): PistonRings {
        return PistonRings()
    }

    @Provides
    @JvmStatic
    fun providePistonPiston(pistonRings: PistonRings): Piston {
        val piston = Piston(pistonRings)
        piston.sealPiston()
        return piston
    }

    @Provides
    @JvmStatic
    fun provideEngine(piston: Piston, crankShaft: CrankShaft): Engine {
        return Engine(piston, crankShaft)
    }


}