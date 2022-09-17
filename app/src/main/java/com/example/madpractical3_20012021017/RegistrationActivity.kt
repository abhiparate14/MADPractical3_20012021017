package com.example.madpractical3_20012021017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021017.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
//        setContentView(R.layout.activity_registration)
    }
    fun launchlogin(view: View){
        val intent= Intent(this,LoginActivity::class.java)
        startActivity(intent)
        Toast.makeText(this,"Login button is clicked",Toast.LENGTH_LONG).show()
    }
    fun launchresult(view: View){
        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()
    }
}
