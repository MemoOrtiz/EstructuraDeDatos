package ejerciciosOmegaUp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int m1 = 0;

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(a);
        lista1.add(b);
        lista1.add(c);
        Collections.sort(lista1);

        lista2.add(x);
        lista2.add(y);
        lista2.add(z);
        Collections.sort(lista2);

        for (int i = 0; i < lista1.size();i++){
            if (lista1.get(i) <= (lista2.get(i))){
                m1=1;
            }else{
                m1=0;
                break;
            }
        }
        System.out.println(m1);
    }
}
