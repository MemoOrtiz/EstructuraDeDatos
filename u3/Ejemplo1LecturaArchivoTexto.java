import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1LecturaArchivoTexto {
    public static void main(String[]args){
        //abrir archivo de text para lectura
        try {
            BufferedReader br = new BufferedReader(new FileReader("productos.txt"));
            //Procesar contenido del archivo
            SinglyLinkedList<Producto> lista = new SinglyLinkedList<>();
            while(br.ready()){
                String cadenaEntrada = br.readLine();
                String [] datosProductos = cadenaEntrada.split(",");
                int clave = Integer.parseInt(datosProductos[0]);
                String descripcion = datosProductos[1];
                double precio = Double.parseDouble(datosProductos[2]);
                lista.addLast(new Producto(clave,descripcion,precio));
            }
            System.out.println(lista.toString());
            //cerrar archivo
            br.close();
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar al archivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder al archivo");
        }

    }
}
