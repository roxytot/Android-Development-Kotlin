package com.example.androidkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply: Button = findViewById(R.id.btnApply)
        val etFirstName: EditText = findViewById(R.id.etFirstName)
        val etLastName: EditText = findViewById(R.id.etLastName)
        val etBirthDate: EditText = findViewById(R.id.etBirthDate)
        val etCountry: EditText = findViewById(R.id.etCountry)

//        Log.d("debug","This is how to print a message to the android log at debug level")
//        Log.e("error","This is how to print an error message to the android log at error level")
//        println("This is how you print a message to the console")

        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("MainActivity", "$firstName $lastName, born on $birthDate, from $country just applied to the formular.")
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","This is the last step where data should be saved, as it is always executed " +
                "during an app's lifecycle")
    }
}