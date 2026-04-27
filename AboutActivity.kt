package com.example.computerclassesapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Toast.makeText(this, "About Opened", Toast.LENGTH_SHORT).show()
    }
}