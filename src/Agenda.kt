import utiles.Depurar

class Agenda() {
    //Creacion de la lista de contactos
    var contactos: MutableList<Contacto> = mutableListOf()

    //Funcion donde ocurre el bucle del programa
    fun comenzar() {
        var salir = false
        do {
            var opcion = Depurar.leerInt(menu());
            when (opcion) {
                0 -> salir = true
                1 -> anadirContacto()
                2 -> listarContactos()
                3 -> buscarContacto()
                4 -> {
                    if (contactos.isEmpty()) {
                        println("La lista de contactos esta vacia")
                    } else {
                        borrarContacto()
                    }
                }

                else -> println("Opción no válida.")
            }
        } while (!salir)
    }

    //Menu
    fun menu(): String {
        return "===== AGENDA DE CONTACTOS =====\n" +
                "1. Añadir contacto\n" +
                "2. Listar contactos\n" +
                "3. Buscar contacto\n" +
                "4. Eliminar contacto\n" +
                "0. Salir\n" +
                "Seleccione una opción:"
    }

    //Funcion para añadir contacto
    fun anadirContacto() {
        val nombre = Depurar.leerTexto("Introduce el nombre: ")
        var numero = ""
        do {
            //Si no coincide con el patron te lo vuelve a pedir
            numero = Depurar.leerTexto("Introduce el número: ")
            if (!numero.matches(Regex("^[6-9][0-9]{8}$"))) {
                println("Introduce un número valido")
            }
        } while (!numero.matches(Regex("^[6-9][0-9]{8}$")))
        var email = ""
        do {
            //Si no coincide con el email te lo vuelve a pedir
            email = Depurar.leerTexto("Introduce el email: ")
            if (!email.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))) {
                println("Introduce un email valido.")
            }
        } while (!email.matches(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")))
        //Crea el contacto y lo añade a la lista
        val a = Contacto(nombre, numero, email)
        contactos.add(a)
        println("Contacto añadido correctamente")
    }


    //Funcion que te muestra todos los contactos
    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos")
        } else {
            var i = 1
            for (contacto in contactos) {
                println("$i. $contacto")
                i++
            }
        }
    }

    //Funcion para buscar contacots
    fun buscarContacto() {
        val nombre = Depurar.leerTexto("Introduce el nombre a buscar: ")
        //Te encuentra el usuario si contiente lo que le hayas pedido
        val usuarioEncontrado = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }

        if (usuarioEncontrado.isEmpty()) {
            println("No se han encontrado contactos")
        } else {
            var i = 1
            for (contacto in usuarioEncontrado) {
                println("$i. $contacto.toString()")
                i++
            }
        }
    }

    //Borra contactos
    fun borrarContacto() {
        var salir = false
        do {
            var opcion =
                Depurar.leerInt("\n1. Eliminación por número de posición en la lista.\n" + "2. Eliminación por nombre.\n" + "3. Mostrar lista contactos. \n" + "0. Salir\n");
            //Distintas opciones para borrar contacto
            when (opcion) {
                0 -> salir = true
                1 -> {
                    do {
                        val numero = Depurar.leerInt("Introduce el número de posición: ")
                        if (numero <= 0 || numero > contactos.size) {
                            println("Introduce una posicion valida")
                        } else {
                            contactos.removeAt(numero - 1)
                        }
                    } while (numero <= 0 || numero > contactos.size)
                }
                2 -> {
                    val nombre = Depurar.leerTexto("Dime el nombre del contacto: ")
                    contactos.removeIf { it.nombre == nombre }
                }
                3 -> listarContactos()
                else -> println("Opción no válida.")
            }
        } while (!salir)
    }
}