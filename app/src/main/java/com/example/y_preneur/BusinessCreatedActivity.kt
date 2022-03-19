package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.databinding.ActivityBuildBusinessBinding
import com.example.y_preneur.databinding.ActivityBusinessCreatedBinding

class BusinessCreatedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBusinessCreatedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessCreatedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFinish.setOnClickListener {
            val intent = Intent(this@BusinessCreatedActivity,BuildBusinessActivity::class.java)
            startActivity(intent)
        }
    }
}