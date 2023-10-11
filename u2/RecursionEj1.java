public class RecursionEj1 {
    public static void main(String[]args){
        System.out.println(new RecursionEj1().sumaNEnteros(3));
    }
    public int sumaNEnteros(int n){
        if(n==1){
            return 1;

        }
        else{
            return n + sumaNEnteros(n-1);
        }
    }
}
