package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_main5`)

        val back5 = findViewById<ImageView>(R.id.back5)
        back5.setOnClickListener {
            val intent = Intent (this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}