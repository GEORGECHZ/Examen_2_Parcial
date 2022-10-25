package com.example.examen_2_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen_2_parcial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAgregar.setOnClickListener(){
            val usuario = binding.edit1.text.toString()
            val contra = binding.edit2.text.toString()

            val persona = ArrayList<Persona>()
            persona.add(Persona("George Michael","Chávez Rubio"))

            val n = persona[0].nombre
            val a = persona[0].apellidos
            val intent3 = Intent(this,bienvenida::class.java)
            if (usuario == "GeorgeChz" && contra == "12345"){
                intent3.putExtra("nombre",n)
                intent3.putExtra("apellido",a)
                startActivity(intent3)
            } else {
                Toast.makeText(this,"Usuario o Contraseña Incorrectos",Toast.LENGTH_SHORT).show()
            }
        }




    }
}