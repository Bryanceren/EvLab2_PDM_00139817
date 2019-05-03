package com.example.evaluacion2.Fragments

import android.content.Context
import android.graphics.Movie
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.example.evaluacion2.R
import kotlinx.android.synthetic.main.fragment_dinamic.view.*


class Dinamic : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var  movies :ArrayList<Movie>
    var listenerTool :  SearchNewMovieListener? = null

    companion object {
        fun newInstance(dataset : ArrayList<Movie>): Dinamic{
            val newFragment = Dinamic()
            newFragment.movies = dataset
            return newFragment
        }
    }

    interface SearchNewMovieListener{
        fun bindImage(movieName: String)

        fun manageLeftItemClick(movie: String)

        fun manageRightItemClick(movie: String)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_dinamic, container, false)

        return view
    }



    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is SearchNewMovieListener) {
            listenerTool = context
        } else {
            throw RuntimeException("Se necesita una implementación de  la interfaz")
        }
    }


    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }
}
