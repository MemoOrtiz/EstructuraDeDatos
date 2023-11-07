package ejerciciosOmegaUp;

import java.util.Scanner;
import java.lang.Math;
public class Cofre {
    /*  Según una antigua leyenda, la historia de Gilgamesh fue escrita en tablillas de lapizlázuli.
        En ellas están narradas todas las pruebas que sufrió Gilgamesh para volverse el más famoso de los reyes.
        Según la misma leyenda, las tablillas están guardadas en un cofre de cobre con un cerrojo de bronce.
        Los cofres está guardado en un templo de Uruk.
        Por alguna razón sabes las dimensiones A x B x C de una tablilla y
        deseas saber si ésta cabe en el cofre de dimensiones X x Y x Z que tienes frente a ti.
    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        /*int a = 3;
        int b = 4;
        int c = 6;
        int x = 6;
        int y = 3;
        int z = 5;*/
        int menor1 = 0;
        int menor2 = 0;
        int mayor1 = 0;
        int mayor2 = 0;

        if(a<b){
            menor1 = Math.min(a, c);
            mayor1 = Math.max(b, c);
        }else {
            menor1 = Math.min(b, c);
            mayor1 = Math.max(a, c);
        }


        if(x<y){
            menor2 = Math.min(x, z);
            mayor1 = Math.max(y, z);
        }else {
            menor2 = Math.min(y, z);
            mayor1 = Math.max(x, z);
        }

        /*if(a>b){
            m1 = Math.max(a, c);
        }else if(b>c){
            m1=b;
        }else{
            m1=c;
        }

        if(x>y){
            m2 = Math.max(x, z);
        }else if(y>z){
            m2=y;
        }else{
            m2=z;
        }*/

        if (menor1<=menor2 || mayor2>=mayor1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        /*public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int m1 = 0;
            int m2 = 0;
            if(a<b){
                m1 = Math.min(a, c);
            }else if(b<c){
                m1=b;
            }else{
                m1=c;
            }
            if(x<y){
                m2 = Math.min(x, z);
            }else if(y<z){
                m2=y;
            }else{
                m2 = z;
            }
            if (m2<=m1){
                System.out.println(1);
            }else {
                System.out.println(0);
            }

        }*/
    }
}
