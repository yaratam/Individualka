package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosetime_six)

        val textView = findViewById<ImageView>(R.id.save)

        textView.setOnClickListener{
            startActivity(Intent(this,Seven::class.java))
        }

    }
}