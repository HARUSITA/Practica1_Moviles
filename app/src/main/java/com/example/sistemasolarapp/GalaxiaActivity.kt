package com.example.sistemasolarapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GalaxiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galaxia)

        val boton = findViewById<Button>(R.id.btnSistemaSolar)

        boton.setOnClickListener {
            val intent = Intent(this, SistemaSolarActivity::class.java)
            startActivity(intent)
        }
    }
}