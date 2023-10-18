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
        return productoCaro;
    }
    //producto mas barato
    public Producto productoBarato(SinglyLinkedList<Producto>listaProductos){
        double precioBarato = listaProductos.last().getPrecio();
        Producto productoBarato = null;
        int cantidadNodos = listaProductos.size();
        for(int contador =0;contador<=cantidadNodos;contador++){
            if(listaProductos.first().getPrecio() < precioBarato){
                precioBarato = listaProductos.first().getPrecio();
                productoBarato = listaProductos.first();
            }
            listaProductos.addLast(listaProductos.removeFirst());
        }
        return productoBarato;
    }

}
