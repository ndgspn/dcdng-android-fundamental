package com.example.githubuser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.githubuser.R
import com.example.githubuser.model.User
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.item_user.view.*
import org.w3c.dom.Text

class UserAdapter(val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.tv_item_name
        var tvfollowers: TextView = itemView.tv_item_followers
        var tvfollowing: TextView = itemView.tv_item_following
        var tvlocation: TextView = itemView.tv_item_location
        var imgAvatar: ImageView = itemView.img_item_avatar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ListViewHolder, position: Int) {
        val user = listUser[position]

        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions().override(90, 90))
            .into(holder.imgAvatar)

        holder.tvName.text = user.name
        holder.tvfollowers.text = user.followers
        holder.tvfollowing.text = user.following
        holder.tvlocation.text = user.location
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])}
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: User)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

}