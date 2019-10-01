package myapplcation.simonsapp.com.mentoriaandroidprojeto01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnimalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)

        var extras: Bundle? = intent.extras

        var value = extras?.getString("AnimalsName")

        var displayIntentExtra = findViewById<TextView>(R.id.animalsNameTextView)
        displayIntentExtra.text = value

    }
}
