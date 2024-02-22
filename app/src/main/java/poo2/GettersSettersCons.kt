package poo2

class Persona(nombreInicial: String, edadInicial: Int) {
    // Propiedad nombre con getter y setter básicos
    var nombre: String = nombreInicial
        get() = field
        set(value) {
            field = value
        }

    // Propiedad edad con getter y setter básicos
    var edad: Int = edadInicial
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    // Crear una instancia de la clase Persona con valores iniciales
    val persona = Persona("Juan", 30)
    println("Nombre inicial: ${persona.nombre}, Edad inicial: ${persona.edad}")

    // Modificar las propiedades usando los setters
    persona.nombre = "Ana"
    persona.edad = 28
    println("Nombre modificado: ${persona.nombre}, Edad modificada: ${persona.edad}")
}
