public class ListaProductos {
    //Producto mas caro
    public Producto productoCaro(SinglyLinkedList<Producto>listaProductos){
        double precioCaro = 0;
        Producto productoCaro = null;
        int cantidadNodos = listaProductos.size();
        for(int contador = 1; contador<=cantidadNodos;contador++){
            if(listaProductos.first().getPrecio() >precioCaro){
                precioCaro = listaProductos.first().getPrecio();
                productoCaro = listaProductos.first();
            }
            listaProductos.addLast(listaProductos.removeFirst());
        }
    }

}
