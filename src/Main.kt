fun main() {
    val Articulo1 = Articulo("pan", 25.00)
    val Articulo2 = Articulo("tomate", 45.00)
    val Articulo3 =Ordenador("A", 1299.99, "Gaming")
    val Articulo4 =Ordenador("B", 399.99, "Básico")
    val listaArticulo = mutableListOf<Articulo>(Articulo1, Articulo2, Articulo3, Articulo4)
    for (articulo in listaArticulo){
        println(articulo.toString())
    }
}