package com.example.unraf_tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

var dni = "43128783"
var domicilio = "Av. Suipacha 30 \n 2300 Rafaela (Santa Fe) "
var nacionalidad = "Argentino"



class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        val dniUser = findViewById<TextView>(R.id.dniUser)
        val domicilioUser = findViewById<TextView>(R.id.domicilioUser)
        val nacionalidadUser = findViewById<TextView>(R.id.nacionalidadUser)
        val btnSalir = findViewById<Button>(R.id.salir)
        dniUser.setText(dni)
        domicilioUser.setText(domicilio)
        nacionalidadUser.setText(nacionalidad)
        btnSalir.setOnClickListener {
            finish()
        }
    }
}