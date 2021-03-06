package com.example.y_preneur.home_page_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.y_preneur.BuildBusinessActivity
import com.example.y_preneur.LearnBusinessActivity
import com.example.y_preneur.R
import com.example.y_preneur.databinding.ActivityHomeBinding
import com.example.y_preneur.databinding.ActivityLogin2Binding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buildBtn.setOnClickListener{
            val intent = Intent(this@HomeActivity, BuildBusinessActivity::class.java)
            startActivity(intent)
        }

        binding.learnBtn.setOnClickListener{
            val intent = Intent(this@HomeActivity, LearnBusinessActivity::class.java)
            startActivity(intent)
        }

    }
}