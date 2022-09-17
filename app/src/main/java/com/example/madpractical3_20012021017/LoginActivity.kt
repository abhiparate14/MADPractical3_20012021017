package com.example.madpractical3_20012021017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021017.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

    fun launchreistration(view: View){
        val intent= Intent(this,RegistrationActivity::class.java)
//        intent.putExtra("mainactivity1",msg)
        startActivity(intent)
    }
    fun launchresultlogin(view: View){
        Toast.makeText(this,"Welcome", Toast.LENGTH_LONG).show()
    }
}