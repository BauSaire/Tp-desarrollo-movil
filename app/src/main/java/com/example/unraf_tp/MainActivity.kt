package com.example.unraf_tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIngresar = findViewById<Button>(R.id.buttonIngresar)
        btnIngresar.setOnClickListener{
            abrirActividadInicio()
        }
    }
    fun abrirActividadInicio(){
        val intento: Intent = Intent(this@MainActivity, InicioActivity::class.java)
        startActivity(intento)
    }
}