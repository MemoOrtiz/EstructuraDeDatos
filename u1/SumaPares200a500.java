package u1;

/**
 * La clase SumaPares200a500, tiene un método main que sumara los numeros
 * pares entre 200 y 500(estos 2 no entran)
 */
public class SumaPares200a500 {
    public static void main(String [] arg) {
        int suma = 0;
int ls= 200;
int li=500;
        for (int i = ls + 1; i < li; i ++) {
            if(i % 2 ==0){
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
