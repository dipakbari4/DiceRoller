package com.dipak.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dipak.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // main binding object for main activity
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Intializing binding object by inflating layoutInflater object
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)    // Replace layout reference with binding's root object

    }
}