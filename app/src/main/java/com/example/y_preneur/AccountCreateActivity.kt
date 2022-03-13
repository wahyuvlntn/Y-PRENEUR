package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.y_preneur.databinding.ActivityAccountCreateBinding
import com.google.firebase.auth.FirebaseAuth

class AccountCreateActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityAccountCreateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityAccountCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnContApp.setOnClickListener {
            val intent = Intent(this@AccountCreateActivity,HomeScreenActivity::class.java)
            startActivity(intent)
        }

    }

}