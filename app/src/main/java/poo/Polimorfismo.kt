package poo

// Definición de la interfaz Forma
interface Forma {
    fun dibujar()
}

// Clase que implementa la interfaz Forma
class Circulo : Forma {
    override fun dibujar() {
        println("Dibujando un círculo")
    }
}

// Otra clase que implementa la interfaz Forma
class Cuadrado : Forma {
    override fun dibujar() {
        println("Dibujando un cuadrado")
    }
}

// Clase para demostrar polimorfismo
class Polimorfismo {
    fun demostrarPolimorfismo() {
        val formas: List<Forma> = listOf(Circulo(), Cuadrado())

        for (forma in formas) {
            forma.dibujar()
        }
    }
}

fun main() {
    val demo = Polimorfismo()
    demo.demostrarPolimorfismo()
}
