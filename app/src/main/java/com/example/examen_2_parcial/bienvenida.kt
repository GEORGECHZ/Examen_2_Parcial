package com.example.examen_2_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen_2_parcial.databinding.ActivityBienvenidaBinding
import com.example.examen_2_parcial.databinding.ActivityMainBinding

class bienvenida : AppCompatActivity() {
    private lateinit var binding: ActivityBienvenidaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBienvenidaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val parExtra = intent.extras

        binding.button.setOnClickListener(){
            val inento1 = Intent(this,MainActivity::class.java)
            startActivity(inento1)
        }
    }
}