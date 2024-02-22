package poo3

// Definición de la interfaz Movilidad
interface Movilidad {
    fun moverse()
}

// Clase abstracta Vehiculo
abstract class Vehiculo(val nombre: String) {
    abstract fun describir()
}

// Clase concreta Coche que implementa la interfaz Movilidad y hereda de Vehiculo
class Coche(nombre: String) : Vehiculo(nombre), Movilidad {
    override fun moverse() {
        println("El coche $nombre se mueve utilizando ruedas.")
    }

    override fun describir() {
        println("El coche $nombre es un vehículo de motor.")
    }
}

// Clase para demostrar el uso de interfaces y clases abstractas
class Interfaz {
    fun demostrarInterfaz() {
        val miCoche = Coche("Toyota")
        miCoche.moverse()
        miCoche.describir()
    }
}

fun main() {
    val demo = Interfaz()
    demo.demostrarInterfaz()
}
