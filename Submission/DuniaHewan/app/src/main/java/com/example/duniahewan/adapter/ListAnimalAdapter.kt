package com.example.duniahewan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.duniahewan.R
import com.example.duniahewan.model.Animal
import kotlinx.android.synthetic.main.item_row_animal.view.*
import org.w3c.dom.Text

class ListAnimalAdapter(val listAnimal: ArrayList<Animal>) : RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvSummary: TextView = itemView.findViewById(R.id.tv_item_summary)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_animal, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]

        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = animal.name
        holder.tvSummary.text = animal.summary
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listAnimal[holder.adapterPosition])}

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Animal)
    }
}