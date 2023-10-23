package ejerciciosOmegaUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paridad {
    /*Escribe un programa que lea un arreglo de N enteros y un entero P. Si P=0,
    tu programa deberá imprimir los valores del arreglo que sean pares; si P=1,
    tu programa deberá imprimir los valores del arreglo que sean impares.
    El orden de aparición debe respetarse.*/

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int entrada  = Integer.parseInt(br.readLine());
            int arreglo[] = {2,5,9,6,1};
            int arr[];
            int paridad = Integer.parseInt((br.readLine()));
          /*  if(paridad==0){
                for(int i = 0;i<entrada;i++) {
                    if(arreglo[i]%2==0){
                        arre
                    }

                }
            }*/
            
        }
    }
}
