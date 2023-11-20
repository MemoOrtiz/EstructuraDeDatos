package u4.tareaEquipo;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String []args){
        ArbolBinarioDeBusqueda<String> arbol = new ArbolBinarioDeBusqueda<>();
       // final String file_name;
        String menu = """
                |1.- Lectura desde el archivo.
                |2.- Buscar una palabra.
                |3.- Eliminar una palabra.
                |4.- Mostrar las palabras.
                |5.- Terminar el programa.
                """;
        int opcion = 0;
        while(opcion != 5){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcion){
                case 1:
                    try {
                        leerArchivo(arbol);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    bucarPalabra(arbol);
                    break;
                case 3:
                    eliminarPalabra(arbol);
                    break;
                case 4:
                    imprimirLista(arbol);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;

            }

        }
    }

    //Aqui se tiene que leer desde un archivo y colocar las palabras en un arbol

    public static void leerArchivo(ArbolBinarioDeBusqueda<String> arbol) throws IOException {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("ArchivoPalabras.txt"));
            while(br.ready()){
                String linea = br.readLine();
                try {
                    arbol.insertar(linea);
                }catch(IllegalArgumentException e){
                    System.out.println("Dato repetido, no se insertará");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if( br != null)
                br.close(); //cierra el archivo
        }

    }

    public static void imprimirLista(ArbolBinarioDeBusqueda<String> arbol){
        Visitor<String> v = new PrintingVisitor<>();
        arbol.recorridoEnProfundidad(new InOrden<>(v));
    }

    public static void bucarPalabra(ArbolBinarioDeBusqueda<String> arbol){
        String palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra a buscar: ");
        if(arbol.encontrar(palabra)!=null){
            JOptionPane.showMessageDialog(null, "La palabra: " + palabra + " se encuentra en el arbol ");
        }else{
            JOptionPane.showMessageDialog(null,"La palabra "+palabra+" no fue encontrada en el arbol");
        }
    }

    public static void eliminarPalabra(ArbolBinarioDeBusqueda<String> arbol){
        String palabra = JOptionPane.showInputDialog(null,"Ingrese la palabra a eliminar: ");
        if (arbol.encontrar(palabra) != null) {
            arbol.eliminar(palabra);
            JOptionPane.showInputDialog("La palabra "+ palabra +" ha sido eliminada");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar la palabra por que no existe en el arbol ");
        }
    }

    /*public static void imprimirlista(ArbolBinarioDeBusqueda<String> arbol) {
        Visitor<String> v = new PrintingVisitor<>();
        arbol.recorridoEnProfundidad(new InOrden<>(v));
    }*/

}
