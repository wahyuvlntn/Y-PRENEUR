package com.example.y_preneur.login_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.y_preneur.R

class login1_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login2_btn: Button = findViewById(R.id.login1_btn)
        login2_btn.setOnClickListener(){
            val intent = Intent(this, login1_activity::class.java)
            startActivity(intent)
        }
    }
}