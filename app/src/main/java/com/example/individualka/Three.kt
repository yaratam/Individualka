package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val textView = findViewById<ImageView>(R.id.START)

        textView.setOnClickListener{
            startActivity(Intent(this,Four::class.java))
        }

    }
}