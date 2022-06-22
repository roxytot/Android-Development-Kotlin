package com.example.androidkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debug","This is how to print a message to the android log at debug level")
        Log.e("error","This is how to print an error message to the android log at error level")
        println("This is how you print a message to the console")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","This is the last step where data should be saved, as it is always executed " +
                "during an app's lifecycle")
    }
}