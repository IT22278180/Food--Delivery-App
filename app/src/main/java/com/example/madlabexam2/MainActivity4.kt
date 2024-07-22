package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val back4 = findViewById<ImageView>(R.id.back4)
        back4.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}