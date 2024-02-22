package com.example.practice

class FuncionesLambdas {

    // Ejemplo de una función simple
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    // Ejemplo de una función con una expresión lambda como parámetro
    fun operarConLambda(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    // Ejemplo de una función que retorna una lambda
    fun obtenerMultiplicador(): (Int, Int) -> Int {
        return { x, y -> x * y }
    }
}

fun main() {
    val funcionesLambdas = FuncionesLambdas()

    // Llamada a una función simple
    println("La suma de 5 y 3 es: ${funcionesLambdas.sumar(5, 3)}")

    // Llamada a una función con una lambda como parámetro
    val resultado = funcionesLambdas.operarConLambda(5, 3) { a, b -> a - b }
    println("El resultado de operar 5 y 3 con una lambda es: $resultado")

    // Obtener una lambda de una función y llamarla
    val multiplicador = funcionesLambdas.obtenerMultiplicador()
    println("El resultado de multiplicar 5 por 3 es: ${multiplicador(5, 3)}")
}
