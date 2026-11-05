class Contacto(var nombre : String, var telefono: String, var email: String) {
    //toString que muestra los datos
    override fun toString(): String {
        return "$nombre, telefono=$telefono, email=$email"
    }
}