package com.example.androidkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_images.*

class DisplayImages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_images)

        btnChangeImage.setOnClickListener {
            ivImage.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }
}