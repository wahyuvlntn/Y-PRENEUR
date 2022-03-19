package com.example.y_preneur.login_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.y_preneur.R
import com.example.y_preneur.databinding.ActivityLogin1Binding
import com.example.y_preneur.databinding.ActivityRegisterBinding

class login1_activity : AppCompatActivity() {
    private lateinit var binding: ActivityLogin1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogin1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login1Btn.setOnClickListener{
            val intent = Intent(this@login1_activity, login2_activity::class.java)
            startActivity(intent)
        }
//        val login1_btn: Button = findViewById(R.id.login1_btn)
//        login1_btn.setOnClickListener(){
//            val intent = Intent(this, login2_activity::class.java)
//            startActivity(intent)
//        }
    }
}