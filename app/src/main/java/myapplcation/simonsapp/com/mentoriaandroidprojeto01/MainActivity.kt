package myapplcation.simonsapp.com.mentoriaandroidprojeto01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val adapter = AnimalsAdapter(imagesList, animalsNameList, this)

        main_gridview.adapter = adapter

        main_gridview.numColumns = 3
        main_gridview.horizontalSpacing = 15
        main_gridview.verticalSpacing = 15
    }

    private val imagesList = arrayOf(R.drawable.ic_bird,
        R.drawable.ic_cat,
        R.drawable.ic_chicken,
        R.drawable.ic_clown_fish,
        R.drawable.ic_dog,
        R.drawable.ic_duckling,
        R.drawable.ic_jellyfish,
        R.drawable.ic_flamingo,
        R.drawable.ic_owl)

    private val animalsNameList = arrayOf("Bird",
        "Cat",
        "Chicken",
        "Clown Fish",
        "Dog",
        "Duckling",
        "JellyFish",
        "Flamingo",
        "Owl"
    )

}
