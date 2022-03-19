package com.example.y_preneur.home_page_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.BuildBusinessActivity
import com.example.y_preneur.LearnBusinessActivity
import com.example.y_preneur.R
import com.example.y_preneur.databinding.ActivityHome1Binding
import com.example.y_preneur.databinding.ActivityHomeBinding

class HomeActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityHome1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHome1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.build1Btn.setOnClickListener{
            val intent = Intent(this@HomeActivity1, BuildBusinessActivity::class.java)
            startActivity(intent)
        }

        binding.learnBtn.setOnClickListener{
            val intent = Intent(this@HomeActivity1, LearnBusinessActivity::class.java)
            startActivity(intent)
        }

    }
}