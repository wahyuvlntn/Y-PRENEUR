package com.example.y_preneur.login_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.y_preneur.BuildBusinessActivity
import com.example.y_preneur.databinding.ActivityLogin1Binding
import com.example.y_preneur.databinding.ActivityLogin2Binding
import com.example.y_preneur.home_page_activity.HomeActivity
import com.example.y_preneur.home_page_activity.HomeActivity1
import com.example.y_preneur.login_register.SignUpActivity
import com.google.firebase.auth.FirebaseAuth

class login2_activity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()




        binding.loginBtn.setOnClickListener{
            val email  = binding.etEmail1.text.toString().trim()
            val password = binding.etPassword1.text.toString().trim()
            if (email.isEmpty()){
                binding.etEmail1.error = "Email harus diisi"
                binding.etEmail1.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.etEmail1.error = "Email tidak valid"
                binding.etEmail1.requestFocus()
                return@setOnClickListener
            }
            if(password.isEmpty()|| password.length<6){
                binding.etPassword1.error="Password harus lebih dari 6 karakter"
                binding.etPassword1.requestFocus()
                return@setOnClickListener
            }

            loginUser(email, password)
        }

        binding.accountBtn.setOnClickListener{
            val intent = Intent(this@login2_activity, SignUpActivity::class.java)
            startActivity(intent)
        }

    }

    private fun loginUser(email:String, password:String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if(it.isSuccessful){
                    val intent = Intent(this@login2_activity, HomeActivity1::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }

                }
                else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
