import java.util.Scanner;

public class CuentaRecursiva {
    /*
    * Escriba un método recursivo para mostrar en
    * pantalla (system.in) cuenta recursiva ede n a 1
    * */

    public static int cuentaRegresiva(int n){
        if(n<0)
            return n;
        else {
            System.out.println(n);
            return cuentaRegresiva(n-1);
        }
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero a contar regresivamente");
        int n = sc.nextInt();
        cuentaRegresiva(n);

    }
}
