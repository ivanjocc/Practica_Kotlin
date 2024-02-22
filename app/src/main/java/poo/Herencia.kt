package poo

// Clase base o superclase
open class Vehiculo(val marca: String, val modelo: String) {
    open fun acelerar() {
        println("El vehículo $marca $modelo está acelerando.")
    }

    open fun frenar() {
        println("El vehículo $marca $modelo está frenando.")
    }
}

// Clase derivada o subclase: Coche
class Coche(marca: String, modelo: String, val numeroDePuertas: Int) : Vehiculo(marca, modelo) {
    override fun acelerar() {
        super.acelerar()
        println("El coche $marca $modelo con $numeroDePuertas puertas acelera más rápido.")
    }

    override fun frenar() {
        super.frenar()
        println("El coche $marca $modelo con $numeroDePuertas puertas frena.")
    }
}

// Clase derivada o subclase: Moto
class Moto(marca: String, modelo: String, val cilindrada: Int) : Vehiculo(marca, modelo) {
    override fun acelerar() {
        super.acelerar()
        println("La moto $marca $modelo de $cilindrada cc acelera rápidamente.")
    }

    override fun frenar() {
        super.frenar()
        println("La moto $marca $modelo de $cilindrada cc frena.")
    }
}

// Clase para demostrar herencia
class Herencia {
    fun demostrar() {
        val miCoche = Coche("Toyota", "Corolla", 4)
        miCoche.acelerar()
        miCoche.frenar()

        val miMoto = Moto("Yamaha", "R1", 1000)
        miMoto.acelerar()
        miMoto.frenar()
    }
}

fun main() {
    val demo = Herencia()
    demo.demostrar()
}
