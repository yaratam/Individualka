package com.example.individualka

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val textView = findViewById<ImageView>(R.id.Focus)

        textView.setOnClickListener{
            startActivity(Intent(this,Eight::class.java))
        }

    }
}