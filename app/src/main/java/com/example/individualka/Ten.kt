
package com.example.individualka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individualka.databinding.ActivityTenBinding

class Ten : AppCompatActivity() {

    private lateinit var binding:ActivityTenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}