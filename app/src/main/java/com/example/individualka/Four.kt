package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explorescreen_four)

        val textView = findViewById<ConstraintLayout>(R.id.Four)

        textView.setOnClickListener{
            startActivity(Intent(this,Five::class.java))
        }

    }
}