import java.util.Random;

public class AppPrueba1 {
    public static void main(String[]args){
        Random ran = new Random();
        SinglyLinkedList<Integer>lista1  = new SinglyLinkedList<>();
        int total = ran.nextInt(100);
        for(int contador = 1;contador <= total; contador++){
            lista1.addLast(ran.nextInt(1000));
        }
        System.out.println("Lista original: \n");
        System.out.println(lista1.toString());

        SinglyLinkedList<Integer> nuevo = new AppPrueba1().eliminarPares(lista1);
        System.out.println(nuevo);
    }
    /* Implemente un metodo que dada una lista enlazada de enteros genere otra lista de enteros con
     *  solamente los elementos que almacenan un dato impar*/

    //Este va en otra clase y se manda a llamar a un main
    public SinglyLinkedList<Integer> eliminarPares(SinglyLinkedList<Integer>listaOr){
        SinglyLinkedList<Integer> nuevo = new SinglyLinkedList<>();
        int cantNodos = listaOr.size();
        for(int contador = 0; contador<=cantNodos;contador++){
            if(listaOr.first()% 2 == 1){
                nuevo.addLast(listaOr.first());
            }
            listaOr.addLast(listaOr.removeFirst());
        }return nuevo;
    }
}

