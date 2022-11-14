package com.example.tugasmid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

//TODO 5A: Lengkapi parameter DataAdapter
class DataAdapter(private val listMovie:ArrayList<Movie>) : RecyclerView.Adapter<DataAdapter
.ListViewHolder>() {

    //TODO 7A


    //TODO 5A: Uncomment 3 fungsi yang sudah ada
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //TODO 6A...
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_content_fix, parent, false)
        return ListViewHolder(view)
    }

    //
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //TODO 6A...
        val (judul, details, photos) = listMovie[position]
        holder.imgPhoto.setImageResource(photos)
        holder.tvNama.text = judul
        holder.tvDescriptor.text = details


        //TODO 6B...


        //TODO 7B...

    }

    //
    override fun getItemCount(): Int {
        return listMovie.size
    }

    //TODO 5B

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescriptor: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    //TODO 6A...


}
