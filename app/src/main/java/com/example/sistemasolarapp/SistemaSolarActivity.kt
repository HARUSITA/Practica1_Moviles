package com.example.sistemasolarapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SistemaSolarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnGoPlanets = findViewById<Button>(R.id.btnGoPlanets)

        btnBack.setOnClickListener {
            finish()
        }

        btnGoPlanets.setOnClickListener {
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)
        }
    }
}