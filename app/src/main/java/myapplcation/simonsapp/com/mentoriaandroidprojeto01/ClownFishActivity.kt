package myapplcation.simonsapp.com.mentoriaandroidprojeto01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ClownFishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clown_fish)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
