package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.databinding.ActivityBuildAttentionBinding

class BuildAttentionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBuildAttentionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuildAttentionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLanjut.setOnClickListener{
            val intent = Intent(this@BuildAttentionActivity,BusinessCreatedActivity::class.java)
            startActivity(intent)
        }
    }
}