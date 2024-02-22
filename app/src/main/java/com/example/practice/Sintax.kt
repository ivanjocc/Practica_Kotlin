package com.example.practice

import android.util.Log

class Sintax {

    fun sintaxis() {
        println("hola atunes")

        val result = suma(2, 3)

        println("el resultado de la suma es $result")
//        Log.d("MainActivity", "el resultado es $result")
    }

    private fun suma(a: Int, b: Int): Int {
        return a + b
    }
}

fun main() {
    val demo = Sintax()
    demo.sintaxis()
}