package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.databinding.ActivityChooseBusinessBinding
import com.example.y_preneur.databinding.ActivityMainBusinessCreateBinding

class ChooseBusinessActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseBusinessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChooseBusinessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLanjut.setOnClickListener {
            val intent = Intent(this@ChooseBusinessActivity,BusinessPlanActivity::class.java)
            startActivity(intent)
        }
    }
}