package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import com.example.y_preneur.databinding.ActivityBusinessPlanBinding

class BusinessPlanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBusinessPlanBinding
    private lateinit var list: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBusinessPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLanjut.setOnClickListener{
            val intent = Intent(this@BusinessPlanActivity,BuildAttentionActivity::class.java)
            startActivity(intent)
        }
    }
}