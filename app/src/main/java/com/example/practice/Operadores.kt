package com.example.practice

class Operadores {

    // Método para demostrar operadores aritméticos
    fun demostrarAritmeticos(a: Int, b: Int) {
        val suma = a + b
        val resta = a - b
        val multiplicacion = a * b
        val division = a / b
        val modulo = a % b

        println("Suma: $suma")
        println("Resta: $resta")
        println("Multiplicación: $multiplicacion")
        println("División: $division")
        println("Módulo: $modulo")
    }

    // Método para demostrar operadores de comparación
    fun demostrarComparacion(a: Int, b: Int) {
        println("a == b: ${a == b}")  // Igual a
        println("a != b: ${a != b}")  // No igual a
        println("a > b: ${a > b}")    // Mayor que
        println("a < b: ${a < b}")    // Menor que
        println("a >= b: ${a >= b}")  // Mayor o igual que
        println("a <= b: ${a <= b}")  // Menor o igual que
    }
}

fun main() {
    val operadores = Operadores()

    println("Operadores Aritméticos")
    operadores.demostrarAritmeticos(10, 5)

    println("\nOperadores de Comparación")
    operadores.demostrarComparacion(10, 5)
}
