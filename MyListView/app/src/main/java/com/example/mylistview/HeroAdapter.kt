package com.example.mylistview

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import java.security.AccessControlContext

class HeroAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var heroes = arrayListOf<Hero>()
    override fun getCount(): Int {
        return heroes.size
    }

    override fun getItem(i: Int): Any {
        return heroes[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_hero, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val hero = getItem(position) as Hero
        viewHolder.bind(hero)
        return itemView
    }

    private inner class ViewHolder internal constructor(view: View) {
        private val tvName: TextView = view.findViewById(R.id.tv_name)
        private val tvDescription: TextView = view.findViewById(R.id.tv_description)
        private val imgPhone: CircleImageView = view.findViewById(R.id.img_photo)

        internal fun bind(hero: Hero) {
            tvName.text = hero.name
            tvDescription.text = hero.description
            imgPhone.setImageResource(hero.photo)
        }
    }
}