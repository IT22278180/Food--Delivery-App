package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsignin = findViewById<Button>(R.id.btnsignin)
        btnsignin.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)
        }

        val btnnewone = findViewById<Button>(R.id.btnnewone)
        btnnewone.setOnClickListener {
            val intent = Intent (this,MainActivity2::class.java)
            startActivity(intent)
        }

    };
}