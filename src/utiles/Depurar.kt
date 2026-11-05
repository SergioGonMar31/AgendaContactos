package utiles

object Depurar {


    //Funciones que nos depuran las entradas.
    fun leerDecimal(mensaje: String): Double {
        while (true) {
            println(mensaje)
            val n = readln().trim().replace(',', '.').toDoubleOrNull()
            if (n != null && n.isFinite()) return n

            System.err.println("Error: introduce un número decimal válido")
        }
    }

    fun leerInt(mensaje: String): Int {
        while (true) {
            println(mensaje)
            val n = readln().trim().toIntOrNull()
            if (n != null) return n

            System.err.println("Error: introduce un número entero válido")
        }

    }


    fun leerTexto(mensaje: String): String {
        var n=""
        do{
            println(mensaje)
            n = readln().trim()
            if(n.isBlank()) System.err.println("Error: introduce un texto")
        }while (n.isBlank())
        return n
    }
}