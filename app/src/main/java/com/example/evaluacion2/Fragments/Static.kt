package com.example.evaluacion2.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.evaluacion2.R
import java.util.*




class Static : Fragment() {
    // TODO: Rename and change types of parameters
    var image:String? = null
    companion object {
        fun newInstance(image: String): Static{
            val newFragment = Static()
            newFragment.image = image
            return newFragment
        }
    }
    interface addImageEvents{
        fun manageLeftItemClick(event:EventListener)

        fun manageRightItemClick(event: EventListener)
    }
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_static, container, false)

        return view
    }


}
