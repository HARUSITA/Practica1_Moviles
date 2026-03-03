package com.example.sistemasolarapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LunasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)

        // El código del botón DEBE ir aquí dentro
        val btnGalaxia = findViewById<Button>(R.id.btnBackToPlanets)

        btnGalaxia.setOnClickListener {
            // Creamos el salto a GalaxiaActivity
            val intent = Intent(this, GalaxiaActivity::class.java)

            // Estas banderas limpian la pila de actividades
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK

            startActivity(intent)

            // Finalizamos esta actividad para que no se pueda volver atrás a las lunas
            finish()
        }
    }
}