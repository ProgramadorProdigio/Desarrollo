package com.example.descansayrelajate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val buttonChangeLayout: Button = findViewById(R.id.iniciarbtn)
        // Establece el listener para el botón
        buttonChangeLayout.setOnClickListener {
            // Crea un Intent para cambiar de actividad
            val intent = Intent(this, Layout2::class.java)
            startActivity(intent)  // Inicia Layout2
        }
    }
}