package com.example.descansayrelajate

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Layout3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout3)  // Usa el layout correspondiente para Layout3


        // Vincula el ImageButton con su ID
        val imageButton: ImageButton = findViewById(R.id.informabtn)

        // Cambiar a otra actividad al presionar el botón
        imageButton.setOnClickListener {
            val intent = Intent(this, Layout4::class.java)
            startActivity(intent)
        }
    }
}