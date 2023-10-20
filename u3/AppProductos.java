import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppProductos {
    /*implemente una aplicacion que utilice una lista simplemente enlazada de productos.txt
estos tienen clave descripcion y precio
la cual lee los datos desde un archivo de texto,

Muestre la lista de productos.txt
Muestre el producto mas caro
Muestre el producto mas barato
Calcule y muestre el total a pagar por toda la lista de productos.txt
Elimine el producto mas caro
Muestre la lista de productos.txt

*/

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("productos.txt"));
            SinglyLinkedList<Producto> lista = new SinglyLinkedList<>();
            while(br.ready()) {
                String cadenaEntrada = br.readLine();
                String[] datosProductos = cadenaEntrada.split(",");
                int clave = Integer.parseInt(datosProductos[0]);
                String descripcion = datosProductos[1];
                double precio = Double.parseDouble(datosProductos[2]);
                lista.addLast(new Producto(clave, descripcion, precio));
            }
            br.close();
            System.out.println(lista);
            //Producto más caro
            Producto productoCaro = new ListaProductos().productoCaro(lista);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar al archivo");
            } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al archivo");
        }

    }
}

