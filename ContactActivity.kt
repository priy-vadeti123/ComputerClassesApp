package com.example.computerclassesapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.computerclassesapp.R

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val callBtn = findViewById<Button>(R.id.callBtn)

        callBtn.setOnClickListener {
            Toast.makeText(this, "Calling 9892342078...", Toast.LENGTH_SHORT).show()
        }
    }
}