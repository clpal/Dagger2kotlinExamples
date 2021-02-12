package clpal.sample.kotlin.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import clpal.sample.kotlin.dagger2.R.layout.activity_main
import clpal.sample.kotlin.dagger2.di.DaggerCarInjector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        val hondaCar = DaggerCarInjector.create().getCar()

        hondaCar.drive()
    }
}
