package com.example.computerclassesapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var enrollBtn: Button? = null
    var callBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutBtn = findViewById<Button>(R.id.aboutBtn)
        val courseBtn = findViewById<Button>(R.id.courseBtn)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val contactBtn = findViewById<Button>(R.id.contactBtn)


        courseBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, CoursesActivity::class.java)
                startActivity(intent)
            }
        })

        loginBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        })

        contactBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, ContactActivity::class.java)
                startActivity(intent)
            }
        })

        aboutBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        })
    }
}