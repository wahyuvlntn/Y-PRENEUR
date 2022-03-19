package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.y_preneur.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val news1: Button = findViewById (R.id.button4)
        val news2: Button = findViewById (R.id.button8)
        news1.setOnClickListener() {
            val intent = Intent(this, news1::class.java)
            startActivity(intent)
        }

        news2.setOnClickListener() {
            val intent = Intent(this, news2::class.java)
            startActivity(intent)
        }
    }
}