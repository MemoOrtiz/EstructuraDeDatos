package ejerciciosOmegaUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alreves {

       /* public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String texto = br.readLine();
            String textoInvertido = invertirString(texto);
            System.out.println(textoInvertido);
        }

        public static String invertirString(String input) {
            StringBuilder resultado = new StringBuilder(input);
            resultado.reverse();
            return resultado.toString();
        }*/



        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto = br.readLine();
            String textoInvertido = invertirString(texto);
            System.out.println(textoInvertido);
        }

        public static String invertirString(String input) {
            String[] palabras = input.split(",");

            StringBuilder resultado = new StringBuilder();

            for (String palabra : palabras) {
                String palabraInvertida = new StringBuilder(palabra).reverse().toString();
                resultado.append(palabraInvertida).append(",");
            }
            resultado.setLength(resultado.length() - 1);
            return resultado.toString();
        }


}
