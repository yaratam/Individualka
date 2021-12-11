package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.individualka.R.layout.activity_loginfilled_three

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_loginfilled_three)

        val textView = findViewById<ImageView>(R.id.start)

        textView.setOnClickListener{
            startActivity(Intent(this,Four::class.java))
        }

    }
}