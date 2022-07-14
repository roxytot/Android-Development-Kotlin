package com.example.androidkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val tvCount: TextView = findViewById(R.id.tvCount)
        val btnCount: Button = findViewById(R.id.btnCount)

        var counter = 0
        btnCount.setOnClickListener {
            counter++
            tvCount.text = "Let's count together: $counter"
        }
    }
}