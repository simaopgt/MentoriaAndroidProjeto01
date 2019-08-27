package myapplcation.simonsapp.com.mentoriaandroidprojeto01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

    }

    fun openBirdActivity(view: View) {
        var intent = Intent(this@MainActivity, BirdActivity::class.java)
        startActivity(intent)
    }


}
