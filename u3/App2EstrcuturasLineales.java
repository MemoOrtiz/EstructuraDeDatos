import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class App2EstrcuturasLineales {
     /* Implemente una funcion que dada una lista de enteros,
   genere otra lista de enteros con solamente los elementos
   que almacenen datos impar.
    */
    public static void main(String[]args){
        //Con LinkedList
        Random rand = new Random();
        //Se crea la primer linked list
        LinkedList<Integer> lista1 = new LinkedList<>();
        //Se declara el tamaño de la lista
        int tamaño = rand.nextInt(100);
        //Se llena de numeros enteros la linked list
        for(int i=0; i<=tamaño; i++){
            lista1.add(rand.nextInt(10));
        }
        //Se imprime con los datos generados la lista 1
        System.out.println(lista1.toString());
        //Se crea una segunda linked list y se llama al metodo generarLista2
        LinkedList<Integer>lista2 = generarLista2(lista1);
        //Se hace una verificacion si la lista está vacia y se imprime
        if(!lista2.isEmpty()){
            System.out.println(lista2.toString());
        }else{
            System.out.println("No hay numeros impares en la lista 1");
        }
    }
    public static LinkedList<Integer> generarLista2(LinkedList<Integer>lista1){
        LinkedList<Integer>lista2 = new LinkedList<>();
        for (Integer cadaElemento:lista1) {
            if(cadaElemento % 2 != 0){
                lista2.add(cadaElemento);
            }
        }
        return lista2;
    }
}
