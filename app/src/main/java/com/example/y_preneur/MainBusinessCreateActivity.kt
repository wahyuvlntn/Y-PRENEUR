package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.y_preneur.databinding.ActivityMainBusinessCreateBinding

class MainBusinessCreateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBusinessCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBusinessCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLanjut.setOnClickListener {
            val intent = Intent(this@MainBusinessCreateActivity,ChooseBusinessActivity::class.java)
            startActivity(intent)
        }
    }
}