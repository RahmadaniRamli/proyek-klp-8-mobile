package com.example.tugasmid

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasmid.Datavalues.Companion.detailfilm
import com.example.tugasmid.Datavalues.Companion.gambarfilm
import com.example.tugasmid.Datavalues.Companion.namafilm

class MainActivity_fix : AppCompatActivity(){

    //TODO 01
    private lateinit var rvMovie: RecyclerView
    private var list = ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fix)

        //TODO 04
        rvMovies = findViewById(R.id.rv_movies)
        rvMovies.setHasFixedSize(true)
        list.addAll(listMovies)
        showRecyclerList()

    }

    //TODO 02
    val listMovies:ArrayList<Movie>
    get() {
        val dataJudul = namafilm
        val dataDetail = detailfilm
        val dataPhoto = gambarfilm
        val listMovie = ArrayList<Movie>()
        for (i in dataJudul.indices){
            val movie = Movie(dataJudul[i],dataDetail[i],dataPhoto[i])
            listMovie.add(movie)
        }
        return listMovie
    }


    //TODO 03
    private fun showRecyclerList() {
        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvMovies.layoutManager = GridLayoutManager(this, 2)
        } else {
            rvMovies.layoutManager = LinearLayoutManager(this)
        }

        val listMovieAdapter = DataAdapter(list)
        rvMovie.adapter = listMovieAdapter
    }


        //TODO 7C


            //TODO 8

//    }

    //TODO 7C
}
