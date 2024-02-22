package poo

class CuentaBancaria(private var balance: Double) {

    // Método para obtener el balance actual. Solo lectura externa.
    fun obtenerBalance(): Double {
        return balance
    }

    // Método para depositar dinero en la cuenta
    fun depositar(monto: Double) {
        if (monto > 0) {
            balance += monto
            println("Depósito exitoso. Balance actual: $balance")
        } else {
            println("El monto a depositar debe ser positivo.")
        }
    }

    // Método para retirar dinero de la cuenta
    fun retirar(monto: Double) {
        if (monto > 0 && monto <= balance) {
            balance -= monto
            println("Retiro exitoso. Balance actual: $balance")
        } else {
            println("El monto a retirar es inválido o excede el balance actual.")
        }
    }
}

// Clase para demostrar encapsulación
class Encapsulacion {
    fun demostrarEncapsulacion() {
        val cuenta = CuentaBancaria(1000.0)
        println("Balance inicial: ${cuenta.obtenerBalance()}")

        cuenta.depositar(500.0)
        cuenta.retirar(200.0)

        println("Balance final: ${cuenta.obtenerBalance()}")
    }
}

fun main() {
    val demo = Encapsulacion()
    demo.demostrarEncapsulacion()
}
