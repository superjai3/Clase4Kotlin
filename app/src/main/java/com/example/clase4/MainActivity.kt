package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adulto1 = Adulto("Sofia", 26, "Estudiante", estadoCivil = EstadoCivil.SOLTERO)
        Toast.makeText( this, adulto1.obtenerNombre(), Toast.LENGTH_LONG).show()
        Toast.makeText( this, adulto1.obtenerEdad(), Toast.LENGTH_LONG).show()
        Toast.makeText( this, adulto1.obtenerProfesion(), Toast.LENGTH_LONG).show()

    }
}