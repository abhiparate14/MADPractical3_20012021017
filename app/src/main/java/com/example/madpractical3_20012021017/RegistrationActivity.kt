package com.example.madpractical3_20012021017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021017.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    lateinit var email:EditText
    lateinit var password1:EditText
    lateinit var password2:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
//        setContentView(R.layout.activity_registration)
    }
    fun launchlogin(view: View){

        email =findViewById(R.id.emailonreg)
        password1 = findViewById(R.id.passwordonreg)
        password2 = findViewById(R.id.conpasswordonreg)
        var msg = email.text.toString()
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        if (password1 == password2)
        {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this,"Enter correct password", Toast.LENGTH_LONG).show()
        }

    }
}