package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tvNombre: TextView
    private lateinit var tvEdad: TextView
    private lateinit var tvEstudiar: TextView
    private lateinit var tvAccion: TextView
    private lateinit var button: Button
    private lateinit var etMainName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNombre = findViewById(R.id.textViewNombre)
        tvEdad = findViewById(R.id.textViewEdad)
        tvEstudiar = findViewById(R.id.textViewProfesion)
        tvAccion = findViewById(R.id.textViewAccion)
        button = findViewById(R.id.button)
        etMainName = findViewById(R.id.editTextMainName)

        /*
        Toast.makeText( this, adulto1.obtenerNombre(), Toast.LENGTH_LONG).show()
        Toast.makeText( this, adulto1.obtenerEdad(), Toast.LENGTH_LONG).show()
        Toast.makeText( this, adulto1.obtenerProfesion(), Toast.LENGTH_LONG).show()
        */

        button.setOnClickListener {
            val nombre = etMainName.text.toString()
            checkNameInNotEmpty(nombre)

        }
    }

    private fun checkNameInNotEmpty(nombre: String) {
        if(nombre.isEmpty()){
            Toast.makeText(this, "Debe agregar un nombre", Toast.LENGTH_LONG).show()
        }
        else {
            val adulto = Adulto(nombre, 26, "Estudiante", estadoCivil = EstadoCivil.SOLTERO)
            tvNombre.text = adulto.obtenerNombre()
            tvEdad.text = adulto.obtenerEdad()
            tvEstudiar.text = adulto.estudiar()
            tvAccion.text = adulto.trabajar()

        }
    }
}