package ejerciciosOmegaUp;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paridad {
    /*Escribe un programa que lea un arreglo de N enteros y un entero P. Si P=0,
    tu programa deberá imprimir los valores del arreglo que sean pares; si P=1,
    tu programa deberá imprimir los valores del arreglo que sean impares.
    El orden de aparición debe respetarse.*/


       /* public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N  = Integer.parseInt(br.readLine());
            int arreglo[] = new int[N];
            for (int i = 0; i < N; i++) {
                arreglo[i] = Integer.parseInt(br.readLine());
            }
            int P= Integer.parseInt((br.readLine()));

            if(P==0){
                for(int i = 0;i<N;i++) {
                    if(arreglo[i]%2==0){
                        System.out.print(arreglo[i] + " ");
                    }

                }
            } else if(P==1){
                for(int i = 0;i<N;i++) {
                    if(arreglo[i]%2!=0){
                        System.out.print(arreglo[i] + " ");
                    }
                }

            }
            br.close();
        }*/

    //Me marca  RTE 0/2
       public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           int N = Integer.parseInt(br.readLine());
           int[] arreglo = new int[N];
           String [] elementosEntrada = br.readLine().split(" ");

           for (int i = 0; i < elementosEntrada.length; i++) {
               arreglo[i] = Integer.parseInt(elementosEntrada[i]);
           }

           int P = Integer.parseInt(br.readLine());

           if (P == 0) {

               for (int i = 0; i < N; i++) {
                   if (arreglo[i] % 2 == 0) {
                       System.out.print(arreglo[i] + " ");
                   }
               }
           } else if (P == 1) {

               for (int i = 0; i < N; i++) {
                   if (arreglo[i] % 2 != 0) {
                       System.out.print(arreglo[i] + " ");
                   }
               }
           }
       }

        /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int[] arreglo = new int[N];

            for (int i = 0; i < N; i++) {
                arreglo[i] = scanner.nextInt();
            }


            int P = scanner.nextInt();

            if (P == 0) {

                for (int i = 0; i < N; i++) {
                    if (arreglo[i] % 2 == 0) {
                        System.out.print(arreglo[i] + " ");
                    }
                }
            } else if (P == 1) {

                for (int i = 0; i < N; i++) {
                    if (arreglo[i] % 2 != 0) {
                        System.out.print(arreglo[i] + " ");
                    }
                }
            }
            scanner.close();
        }*/
}
