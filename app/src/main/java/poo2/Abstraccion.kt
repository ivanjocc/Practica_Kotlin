package poo2

// Clase abstracta Vehiculo
abstract class Vehiculo(val nombre: String) {
    abstract fun moverse()
}

// Clase concreta Coche que hereda de Vehiculo
class Coche(nombre: String) : Vehiculo(nombre) {
    override fun moverse() {
        println("El coche $nombre se está moviendo sobre ruedas.")
    }
}

// Clase concreta Bicicleta que hereda de Vehiculo
class Bicicleta(nombre: String) : Vehiculo(nombre) {
    override fun moverse() {
        println("La bicicleta $nombre se está moviendo con pedales.")
    }
}

// Clase para demostrar abstracción
class Abstraccion {
    fun demostrarAbstraccion() {
        val miCoche = Coche("Toyota")
        val miBicicleta = Bicicleta("BMX")

        val vehiculos: List<Vehiculo> = listOf(miCoche, miBicicleta)
        vehiculos.forEach { it.moverse() }
    }
}

fun main() {
    val demo = Abstraccion()
    demo.demostrarAbstraccion()
}
