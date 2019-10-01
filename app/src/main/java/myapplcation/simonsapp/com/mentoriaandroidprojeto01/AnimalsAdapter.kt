package myapplcation.simonsapp.com.mentoriaandroidprojeto01

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.grid_item.view.*


class AnimalsAdapter(private val imagesList: Array<Int>, private val animalsNameList : Array<String> , private val mContext : Context) : BaseAdapter() {

    override fun getCount(): Int {
        return this.imagesList.size
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val view = LayoutInflater.from(mContext).inflate(R.layout.grid_item, null)

        val holder = AnimalsViewHolder(view)

        view.tag = holder

        view.animal_image_button.setOnClickListener {

            val intent = Intent(mContext, AnimalsActivity::class.java)
            intent.putExtra("AnimalsName", animalsNameList[position])
            startActivity(mContext, intent, null)

        }

        holder.imageButton.setImageResource(imagesList[position])
        holder.textView.setText(animalsNameList[position])

        return view
    }

    override fun getItem(position: Int): Int {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

}