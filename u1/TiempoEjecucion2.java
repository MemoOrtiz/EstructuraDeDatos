package u1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class TiempoEjecucion2 {

    public static void main(String[] args) {
        System.out.println("\nArreglo de tamaño definido en la declaración");
        procesarArreglo1();
        System.out.println("\nArreglo de tamaño definido en la ejecución");
        procesarArreglo2();
        //System.out.println("\nArreglo de tamaño definido en la ejecución, con captura");
        //procesarArreglo3();
        System.out.println("\nArrayList para 1000 elementos insertados en ejecución");
        procesarLista1();
        System.out.println("\nLinkedList para 1000 elementos insertados en ejecución");
        procesarLista2();
    }

    public static void procesarArreglo1() {
        Random objRan = new Random();

        long t0 = System.nanoTime();
        int[] arreglo = new int[1000];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = objRan.nextInt(1000);
        }
        long tf = System.nanoTime();

        System.out.println(Arrays.toString(arreglo));

        System.out.println("N="+arreglo.length + "    Duración: " + (tf - t0) / 1e6 + " ms");
    }

    public static void procesarArreglo2() {
        Random objRan = new Random();

        long t0 = System.nanoTime();
        int[] arreglo;

        arreglo = new int[objRan.nextInt(1000) + 1000];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = objRan.nextInt(1000);
        }
        long tf = System.nanoTime();

        System.out.println(Arrays.toString(arreglo));

        System.out.println("N="+arreglo.length + "    Duración: " + (tf - t0) / 1e6 + " ms");
    }

    public static void procesarArreglo3() {
        Random objRan = new Random();

        long t0 = System.nanoTime();
        int[] arreglo;

        arreglo = new int[objRan.nextInt(30)];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
        }
        long tf = System.nanoTime();

        System.out.println(Arrays.toString(arreglo));

        System.out.println("N="+arreglo.length + "    Duración: " + (tf - t0) / 1e6 + " ms");
    }

    public static void procesarLista1() {
        Random objRan = new Random();

        long t0 = System.nanoTime();
        ArrayList<Integer> lista = new ArrayList<>(1000);

        final int LIMITE = 1000;

        for (int i = 0; i < LIMITE; i++) {
            lista.add(objRan.nextInt(1000));
        }
        long tf = System.nanoTime();

        System.out.println(lista);

        System.out.println("N="+lista.size() + "    Duración: " + (tf - t0) / 1e6 + " ms");
    }

    public static void procesarLista2() {
        Random objRan = new Random();

        long t0 = System.nanoTime();
        LinkedList<Integer> lista = new LinkedList<>();

        final int LIMITE = 1000;

        for (int i = 0; i < LIMITE; i++) {
            lista.add(objRan.nextInt(1000));
        }
        long tf = System.nanoTime();

        System.out.println(lista);

        System.out.println("N="+lista.size() + "    Duración: " + (tf - t0) / 1e6 + " ms");
    }

}

