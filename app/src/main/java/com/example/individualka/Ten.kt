
package com.example.individualka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NIne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_Player_ten)

        val textView = findViewById<ImageView>(R.id.Close)

        textView.setOnClickListener{
            startActivity(Intent(this,NIne::class.java))
        }
    }
}
