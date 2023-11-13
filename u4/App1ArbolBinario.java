package u4;

public class App1ArbolBinario {
    public static void main(String[] args) {
        ArbolBinario<String> m = new  ArbolBinario<String>("Maria");
        ArbolBinario<String> r = new  ArbolBinario<String>("Rodrigo");
        ArbolBinario<String> e = new  ArbolBinario<String>("Esperanza",m,r);
        ArbolBinario<String> an = new  ArbolBinario<String>("Anyora");
        ArbolBinario<String> ab = new  ArbolBinario<String>("Abel");
        ArbolBinario<String> mj = new  ArbolBinario<String>("M de Jesus", an, ab);
        ArbolBinario<String> raiz = new  ArbolBinario<String>("Maria",e, mj);

        Visitor<String> v = new PrintingVisitor<String>();

        System.out.println("Recorrido en Preorden");
        raiz.recorridoEnProfundidad(new PreOrden<>(v));
        System.out.println("\nRecorrido en InOrden");
        raiz.recorridoEnProfundidad(new InOrden<>(v));
        System.out.println("\nRecorrido en PostOrden");
        raiz.recorridoEnProfundidad(new PostOrden<>(v));
    }
}
