package com.example.y_preneur.login_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.example.y_preneur.RegisterActivity
import com.example.y_preneur.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()


        binding.btnNext.setOnClickListener {
            val email  = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            val repassword = binding.etRepassword.text.toString().trim()
            if (email.isEmpty()){
                binding.etEmail.error = "Email harus diisi"
                binding.etEmail.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.etEmail.error = "Email tidak valid"
                binding.etEmail.requestFocus()
                return@setOnClickListener
            }
            if(password.isEmpty()|| password.length<6){
                binding.etPassword.error="Password harus lebih dari 6 karakter"
                binding.etPassword.requestFocus()
                return@setOnClickListener
            }
            if(repassword!=password){
                binding.etRepassword.error="Password harus sama"
                binding.etRepassword.requestFocus()
                return@setOnClickListener
            }
            registerUser(email, password)
        }
    }
    private fun registerUser(email:String, password:String){
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if(it.isSuccessful){
                    val intent = Intent(this@SignUpActivity, RegisterActivity::class.java)
                    startActivity(intent)
                }
            }
    }
}