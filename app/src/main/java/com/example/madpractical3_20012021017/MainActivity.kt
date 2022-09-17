package com.example.madpractical3_20012021017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021017.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
    fun launchlogin(view: View) {
        Toast.makeText(this,"login button is clicked", Toast.LENGTH_LONG).show()
//        Log.d("mainactivity","button is clicked")

        val intent= Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }
    fun launchregistration(view: View) {
        Toast.makeText(this,"registration button is clicked", Toast.LENGTH_LONG).show()
//        Log.d("mainactivity","button is clicked")

        val intent= Intent(this,RegistrationActivity::class.java)
        startActivity(intent)
    }
}
