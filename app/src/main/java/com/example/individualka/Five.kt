package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bringingto_five)

        val textView = findViewById<ImageView>(R.id.ReduceStress)

        textView.setOnClickListener{
            startActivity(Intent(this,Six::class.java))
        }
    }
}