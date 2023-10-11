import java.util.ArrayList;
import java.util.Random;

public class DatoImpar {
   /* Implemente una funcion que dada una lista de enteros,
   genere otra lista de enteros con solamente los elementos
   que almacenen datos impar.
    */

    public static void main(String []args) {
        Random objRand = new Random();
        //Con arreglo
        ArrayList<Integer> lista1 = new ArrayList<>();
        int limite = objRand.nextInt(1000);
        for (int i = 0; i <= limite; i++) {
            lista1.add(objRand.nextInt(100));
        }
        System.out.println(lista1.toString());
        ArrayList<Integer> lista2 = generarLista2(lista1);
        if(!lista2.isEmpty()){
            System.out.println(lista2.toString());
        }else{
            System.out.println("\nNo hay impares en la lista 1");
        }

    }
    public static ArrayList<Integer> generarLista2(ArrayList<Integer> lista1){
        ArrayList<Integer> lista2 = new ArrayList<>();
        for(Integer elemento: lista1){
            if(elemento % 2 != 0){
                lista2.add(elemento);
            }
        }
        return lista2;
    }
}
