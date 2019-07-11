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

    fun openCatActivity(view: View) {
        var intent = Intent(this@MainActivity, CatActivity::class.java)
        startActivity(intent)
    }

    fun openChickenActivity(view: View) {
        var intent = Intent(this@MainActivity, ChickenActivity::class.java)
        startActivity(intent)
    }

    fun openClownFishActivity(view: View) {
        var intent = Intent(this@MainActivity, ClownFishActivity::class.java)
        startActivityForResult(intent, 1)
    }

    fun openDogActivity(view: View) {
        var intent = Intent(this@MainActivity, DogActivity::class.java)
        startActivity(intent)
    }

    fun openDucklingActivity(view: View) {
        var intent = Intent(this@MainActivity, DucklingActivity::class.java)
        startActivity(intent)
    }

    fun openFlamingoActivity(view: View) {
        var intent = Intent(this@MainActivity, FlamingoActivity::class.java)
        startActivity(intent)
    }

    fun openJellyfishActivity(view: View) {
        var intent = Intent(this@MainActivity, JellyfishActivity::class.java)
        startActivity(intent)
    }

    fun openOwlActivity(view: View) {
        var intent = Intent(this@MainActivity, OwlActivity::class.java)
        startActivity(intent)
    }
}
