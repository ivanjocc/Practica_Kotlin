package poo

class Constructor(val nombre: String, var edad: Int) {
    var ciudad: String = "No especificada"

    // Constructor primario
    init {
        println("Constructor primario llamado: Nombre es $nombre, Edad es $edad.")
    }

    // Constructor secundario 1
    constructor(nombre: String, edad: Int, ciudad: String) : this(nombre, edad) {
        this.ciudad = ciudad
        println("Constructor secundario 1 llamado: Nombre es $nombre, Edad es $edad, Ciudad es $ciudad.")
    }

    // Método para mostrar la información
    fun mostrarInfo() {
        println("Nombre: $nombre, Edad: $edad, Ciudad: $ciudad")
    }
}

fun main() {
    // Crear instancia usando el constructor primario
    val persona1 = Constructor("Juan", 30)
    persona1.mostrarInfo()

    // Crear instancia usando el constructor secundario
    val persona2 = Constructor("Ana", 25, "Madrid")
    persona2.mostrarInfo()
}
