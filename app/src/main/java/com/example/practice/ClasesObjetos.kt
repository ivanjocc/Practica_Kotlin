package com.example.practice

// Definición de la clase Persona
class Persona(val nombre: String, var edad: Int) {
    // Método de la clase que incrementa la edad
    fun cumpleanos() {
        edad++
        println("Feliz cumpleaños, $nombre! Ahora tienes $edad años.")
    }
}

// Clase que demuestra el uso de clases y objetos
class ClasesObjetos {

    fun demostrarClasesYObjetos() {
        // Crear una instancia de la clase Persona
        val persona1 = Persona("Juan", 30)
        println("La persona se llama ${persona1.nombre} y tiene ${persona1.edad} años.")

        // Llamar a un método del objeto
        persona1.cumpleanos()

        // Crear otra instancia de la clase Persona
        val persona2 = Persona("Ana", 25)
        println("La persona se llama ${persona2.nombre} y tiene ${persona2.edad} años.")

        // Llamar a un método del segundo objeto
        persona2.cumpleanos()
    }
}

fun main() {
    val demo = ClasesObjetos()
    demo.demostrarClasesYObjetos()
}
