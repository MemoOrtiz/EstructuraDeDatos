import java.util.Scanner;

public class Metodos {

    public static int sumaR(int n){
        if(n<=9)
            return n;
        else
           return sumaR(n/10) + n%10;
    }

    public static int sumaI(int n){
        int s= 0;
        while(n>9){
            s += n%10;
            n/=10;
        }
        return (s+n);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("dame numero entero\n");
        int n= sc.nextInt();
        System.out.println(sumaR(n));
        System.out.println(sumaI(n));
    }
}
