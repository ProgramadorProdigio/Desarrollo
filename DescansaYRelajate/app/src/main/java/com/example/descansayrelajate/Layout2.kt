package com.example.descansayrelajate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Layout2  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)  // Usa el layout correspondiente para Layout2

        val buttonChangeLayout: Button = findViewById(R.id.btnirloyout3)
        // Establece el listener para el botón
        buttonChangeLayout.setOnClickListener {
            // Crea un Intent para cambiar de actividad
            val intent = Intent(this, Layout3::class.java)
            startActivity(intent)  // Inicia Layout2
        }
    }
}