public class AppStack {
    public static void main(String[] args){
        ArrayStack<String> pila = new ArrayStack<>();
        String frase = "Anita lava la tina";
        for(int i = 0; i<frase.length();i++){
            pila.push(frase.substring(i,i+1));
        }
        System.out.println(frase);
        while(!pila.isEmpty()){
            System.out.print(pila.pop());
        }
    }
}
