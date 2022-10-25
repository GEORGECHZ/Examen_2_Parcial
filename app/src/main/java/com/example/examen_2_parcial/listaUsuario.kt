package com.example.examen_2_parcial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examen_2_parcial.databinding.ActivityMainBinding
import com.example.examen_2_parcial.databinding.ListaUsuarioBinding

class listaUsuario: AppCompatActivity() {
    private lateinit var binding: ListaUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListaUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}