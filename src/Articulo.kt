class Articulo(var nombre: String, var precio:Double) {
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
      fun promocionNavidad(){

      }
    fun formatearPrecio():String{
        return "%.2f".format(precio)
    }
    override fun toString(): String {
        return  "$nombre - {${formatearPrecio()}}€ (ID: $contador)"
    }
}