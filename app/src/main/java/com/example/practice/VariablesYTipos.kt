package com.example.practice

class VariablesYTipos {
    fun demostrarVariables() {
        // Variables inmutables (val) - No pueden cambiar su valor una vez asignado
        val nombre: String = "Juan"
        val edad: Int = 30
        val altura: Double = 1.75
        val estudiante: Boolean = true

        // Variables mutables (var) - Pueden cambiar su valor
        var puntaje: Int = 90
        var temperatura: Float = 36.5f
        var ciudad: String = "Madrid"


        // Imprimir valores iniciales
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Altura: $altura")
        println("Estudiante: $estudiante")
        println("Puntaje: $puntaje")
        println("Temperatura: $temperatura")
        println("Ciudad: $ciudad")

        // Modificar valores de las variables mutables
        puntaje = 95
        temperatura = 37.0f
        ciudad = "Barcelona"

        // Imprimir valores modificados
        println("Nuevo puntaje: $puntaje")
        println("Nueva temperatura: $temperatura")
        println("Nueva ciudad: $ciudad")
    }
}

// Método main para probar la clase
fun main() {
    val demo = VariablesYTipos()
    demo.demostrarVariables()
}