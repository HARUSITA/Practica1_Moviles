package com.example.sistemasolarapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class GalaxiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galaxia)

        val root = findViewById<ScrollView>(R.id.rootScroll)
        val btnSistemaSolar = findViewById<MaterialButton>(R.id.btnSistemaSolar)

        // Navegación a Sistema Solar
        btnSistemaSolar.setOnClickListener {
            startActivity(Intent(this, SistemaSolarActivity::class.java))
        }

        // Navegación interna (scroll a secciones)
        val sectionCentro = findViewById<View>(R.id.sectionCentro)
        val sectionEstructura = findViewById<View>(R.id.sectionEstructura)
        val sectionObjetos = findViewById<View>(R.id.sectionObjetos)
        val sectionHistoria = findViewById<View>(R.id.sectionHistoria)

        findViewById<MaterialCardView>(R.id.navCentro).setOnClickListener { scrollToView(root, sectionCentro) }
        findViewById<MaterialCardView>(R.id.navEstructura).setOnClickListener { scrollToView(root, sectionEstructura) }
        findViewById<MaterialCardView>(R.id.navObjetos).setOnClickListener { scrollToView(root, sectionObjetos) }
        findViewById<MaterialCardView>(R.id.navHistoria).setOnClickListener { scrollToView(root, sectionHistoria) }

        // Secciones expandibles (sin animación)
        setupExpandableNoAnim(R.id.headerCentro, R.id.detailsCentro, R.id.arrowCentro)
        setupExpandableNoAnim(R.id.headerEstructura, R.id.detailsEstructura, R.id.arrowEstructura)
        setupExpandableNoAnim(R.id.headerObjetos, R.id.detailsObjetos, R.id.arrowObjetos)
        setupExpandableNoAnim(R.id.headerHistoria, R.id.detailsHistoria, R.id.arrowHistoria)
    }

    private fun setupExpandableNoAnim(headerId: Int, detailsId: Int, arrowId: Int) {
        val header = findViewById<View>(headerId)
        val details = findViewById<View>(detailsId)
        val arrow = findViewById<TextView>(arrowId)

        header.setOnClickListener {
            val isVisible = details.visibility == View.VISIBLE
            details.visibility = if (isVisible) View.GONE else View.VISIBLE
            arrow.rotation = if (isVisible) 0f else 180f
        }
    }

    private fun scrollToView(scrollView: ScrollView, target: View) {
        scrollView.post {
            val y = target.top - dp(12)
            scrollView.smoothScrollTo(0, if (y < 0) 0 else y)
        }
    }

    private fun dp(value: Int): Int {
        val density = resources.displayMetrics.density
        return (value * density).toInt()
    }
}