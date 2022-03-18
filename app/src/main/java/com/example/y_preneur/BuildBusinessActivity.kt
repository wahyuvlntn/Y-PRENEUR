package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.databinding.ActivityBuildBusinessBinding

class BuildBusinessActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBuildBusinessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuildBusinessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBangunBisnis.setOnClickListener {
            val intent = Intent(this@BuildBusinessActivity,MainBusinessCreateActivity::class.java)
            startActivity(intent)
        }
    }
}