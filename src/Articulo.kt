open class Articulo(var nombre: String, var precio:Double) {
    companion object{
        var contador = 0
        fun generarID(): Int {
            contador++
            return contador
        }
    }
    init {
        generarID()
    }
    open fun promocionNavidad():Double{
        print("Ingrese la rebaja con el siguiente formato (00.00): ")
        val rebaja = readln().toDouble()
        return precio-rebaja
    }
    fun formatearPrecio():String{
        return "%.2f".format(precio)
    }

    override fun toString(): String {
        return  "$nombre - {${formatearPrecio()}}€ (ID: $contador)"
    }
}