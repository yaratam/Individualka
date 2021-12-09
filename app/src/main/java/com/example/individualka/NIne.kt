
package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class NIne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        val textView = findViewById<ImageView>(R.id.daysseven)

        textView.setOnClickListener{
            startActivity(Intent(this,Ten::class.java))
        }

    }
}