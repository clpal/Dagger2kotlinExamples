package clpal.example.kotlin.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import clpal.example.kotlin.dagger2.di.DaggerCarInjector
import clpal.example.kotlin.dagger2.R.layout.activity_main
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var hondaCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        DaggerCarInjector.builder()
            .setBatteryVoltage(12.6)
            .setBatteryCapacity(45.0)
            .build()
            .injectFields(this)

        hondaCar.drive()
    }
}
