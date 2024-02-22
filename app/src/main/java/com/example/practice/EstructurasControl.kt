package com.example.practice

class EstructurasControl {

    // Método para demostrar el uso de la sentencia if-else
    fun demostrarIfElse(a: Int, b: Int) {
        if (a > b) {
            println("$a es mayor que $b")
        } else if (a < b) {
            println("$a es menor que $b")
        } else {
            println("$a es igual a $b")
        }
    }

    // Método para demostrar el uso de la sentencia when
    fun demostrarWhen(a: Int) {
        when (a) {
            1 -> println("a es uno")
            2 -> println("a es dos")
            in 3..10 -> println("a está entre 3 y 10")
            else -> println("a es otro número")
        }
    }

    // Método para demostrar el uso de bucles for
    fun demostrarFor() {
        val lista = listOf("manzana", "banana", "cereza")
        for (item in lista) {
            println(item)
        }
    }

    // Método para demostrar el uso de bucles while
    fun demostrarWhile() {
        var a = 5
        while (a > 0) {
            println(a)
            a--
        }
    }
}

fun main() {
    val estructuras = EstructurasControl()

    println("Demostración de if-else")
    estructuras.demostrarIfElse(10, 5)

    println("\nDemostración de when")
    estructuras.demostrarWhen(5)

    println("\nDemostración de bucle for")
    estructuras.demostrarFor()

    println("\nDemostración de bucle while")
    estructuras.demostrarWhile()
}
