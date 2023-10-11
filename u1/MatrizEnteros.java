package u1;

import java.util.Random;

/**
 * Desarrollar un programa que genere un arreglo de 3x4
 * con numeros enteros aleatorios en el rango de 10-50.
 * Muestre la matriz, la suma de cada renglon
 * y la suma de cada columna. Ademas el promedio de todos
 * los elementos
 */
public class MatrizEnteros {
    private int [][] matriz;
    public MatrizEnteros() {
        matriz = new int[3][4];
        Random ran = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(10,50)+1;
            }
        }
      //  for (int i = 0; i < matriz.length; i++) {
        //    for (int j = 0; j < matriz[i].length; j++) {
          //      System.out.print(matriz[i][j] + " ");
            //}
            //System.out.println();
        //}
    }

    public int sumarRenglon(int i){
        int suma = 0;
        for(int j = 0 ; j<matriz[i].length; j++){
            suma = suma+ matriz[i][j];
        }return suma;
    }

    public int sumarColumna(int j){
        int suma = 0;
        for(int i = 0 ; i<matriz.length; i++){
            suma = suma+ matriz[i][j];
        }return suma;
    }

    public float calcularPromedio(){
        float promedio = 0;
        for(int i = 0 ; i< matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                promedio += matriz[i][j];
            }
        } return promedio/12;
    }

 public String toString(){
        String s = "";
        for(int i = 0 ; i< matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++) {
                s = s + matriz[i][j];
            }
            s = s + sumarRenglon(i);
        }
        for(int j = 0; j<matriz[0].length; j++){
            s = s + sumarColumna(j) + "      ";
        }
        s += calcularPromedio();
        return s;
    }

}
