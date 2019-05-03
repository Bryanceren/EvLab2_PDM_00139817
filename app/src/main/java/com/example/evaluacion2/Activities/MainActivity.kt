package com.example.evaluacion2.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.evaluacion2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoview = findViewById<ImageView>(R.id.ImageView)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.drawable.test)
        videoview.setVideoURI(uri)
        videoview.start()
    }

    /*
    */
}
