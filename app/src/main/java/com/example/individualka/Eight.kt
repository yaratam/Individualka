package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_narrator_eight)

        val textView = findViewById<ImageView>(R.id.Atention)

        textView.setOnClickListener{
            startActivity(Intent(this,NIne::class.java))
        }

    }
}