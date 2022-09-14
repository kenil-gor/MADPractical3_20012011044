package com.example.madpractical3_20012011044

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.madpractical3_20012011044.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.bottom_nav_login -> {
                    Intent(this,MainActivity::class.java).also{startActivity(it)}
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}