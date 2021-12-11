package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choosemeditation_seven)

        val textView = findViewById<ImageView>(R.id.Focus)

        textView.setOnClickListener{
            startActivity(Intent(this,Eight::class.java))
        }

    }
}