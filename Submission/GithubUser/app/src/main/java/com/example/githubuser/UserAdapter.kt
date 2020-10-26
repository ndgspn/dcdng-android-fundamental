package com.example.githubuser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var users = arrayListOf<User>()

    override fun getCount(): Int {
        return users.size
    }

    override fun getItem(position: Int): Any {
        return users[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {
        var itemView = view

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_user, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView
    }

    inner class ViewHolder internal constructor(view: View) {
        private val tvName: TextView = view.findViewById(R.id.tv_name)
        private val tvFollowers: TextView = view.findViewById(R.id.tv_followers)
        private val tvFollowing: TextView = view.findViewById(R.id.tv_following)
        private val tvLocation: TextView = view.findViewById(R.id.tv_location)
        private val avatar: ImageView = view.findViewById(R.id.img_user)

        internal fun bind(user: User) {
            tvName.text = user.name
            tvFollowers.text = user.followers
            tvFollowing.text = user.following
            tvLocation.text = user.location
            avatar.setImageResource(user.avatar)
        }
    }
}