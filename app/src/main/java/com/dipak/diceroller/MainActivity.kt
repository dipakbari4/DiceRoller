package com.dipak.diceroller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dipak.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // main binding object for main activity
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Intializing binding object by inflating layoutInflater object
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)    // Replace layout reference with binding's root object

        binding.rollButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}