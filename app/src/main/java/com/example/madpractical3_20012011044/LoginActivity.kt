package com.example.madpractical3_20012011044

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.madpractical3_20012011044.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.bottom_nav_reg -> {
                    Intent(this,RegistrationActivity::class.java).also{startActivity(it)}
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}