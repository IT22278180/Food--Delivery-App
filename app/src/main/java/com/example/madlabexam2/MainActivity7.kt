package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val back7 = findViewById<ImageView>(R.id.back7)
        back7.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)
        }

        val btnadd = findViewById<Button>(R.id.btnadd)
        btnadd.setOnClickListener {
            val intent = Intent (this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}