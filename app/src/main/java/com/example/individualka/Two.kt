package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_two)

        val textView = findViewById<ImageView>(R.id.Email)

        textView.setOnClickListener{
            startActivity(Intent(this,Three::class.java))
        }
    }
}