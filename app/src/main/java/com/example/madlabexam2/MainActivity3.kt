package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btncart = findViewById<ImageView>(R.id.btncart)
        btncart.setOnClickListener {
            val intent = Intent (this,MainActivity5::class.java)
            startActivity(intent)
        }


        val btnfavourite = findViewById<ImageView>(R.id.btnfavourite)
        btnfavourite.setOnClickListener {
            val intent = Intent (this,MainActivity4::class.java)
            startActivity(intent)
        }

        val btnprofile = findViewById<ImageView>(R.id.btnprofile)
        btnprofile.setOnClickListener {
            val intent = Intent (this,MainActivity6::class.java)
            startActivity(intent)
        }

        val btnfood = findViewById<Button>(R.id.btnfood)
        btnfood.setOnClickListener {
            val intent = Intent (this,MainActivity7::class.java)
            startActivity(intent)
        }

        val btnman = findViewById<ImageView>(R.id.btnman)
        btnman.setOnClickListener {
            val intent = Intent (this,MainActivity6::class.java)
            startActivity(intent)
        }

    }
}