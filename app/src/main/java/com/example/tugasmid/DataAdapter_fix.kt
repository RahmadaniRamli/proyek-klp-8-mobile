package com.example.tugasmid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.tugasmid.Datavalues.Companion.namafilm
import com.example.tugasmid.Datavalues.Companion.gambarfilm
import com.example.tugasmid.Datavalues.Companion.detailfilm

//TODO 5A: Lengkapi parameter DataAdapter
class DataAdapter(val listMovie) : RecyclerView.Adapter<DataAdapter
.ListViewHolder>() {

    //TODO 7A



    //TODO 5A: Uncomment 3 fungsi yang sudah ada
    //override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //TODO 6A...

    //}
    //TODO 6A
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        TODO("NO")
        val view: View = LayoutInflater.from(parent.context).inflate()

        TODO 6B...


        TODO 7B...

    }

    //override fun getItemCount(): Int {

    //}

    //TODO 5B
    //class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //TODO 6A...


    //}


}
