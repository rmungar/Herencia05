class Ordenador(nombre:String, precio:Double, tipo:String = "Básico") : Articulo(nombre, precio) {

    val tipo:String = tipo
    override fun promocionNavidad():Double{
        if (precio > 500.00){
            return super.promocionNavidad()
        }
        else{
            return precio
        }
    }

    override fun toString(): String {
        return super.toString()+", tipo: $tipo"
    }

}