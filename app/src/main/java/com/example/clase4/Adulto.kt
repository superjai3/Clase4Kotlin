package com.example.clase4

class Adulto (
    private val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estadoCivil: EstadoCivil
    ) : Persona(nombre, edad), AccionesAdulto, Acciones

{
    override fun obtenerNombre(): String {
        return "Mi Nombre es: ${this.nombre}"
    }

    override fun obtenerEdad(): String {
        return "Mi Edad es: ${this.edad}"
    }

    override fun trabajar(): String {
        return "Estoy trabajando"
    }

    override fun estudiar(): String {
        return "Estoy estudiando en la universidad"
    }

    fun obtenerProfesion(): String {
        return "Mi Profesion es: ${this.profesion}"
    }
}

enum class EstadoCivil {
    CASADO, SOLTERO, DIVORCIADO, CONVIVENCIA, CONYUGUE, VIAUDO
}
