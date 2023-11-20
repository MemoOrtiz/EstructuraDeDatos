package u4.tareaEquipo;

public class App1_ArbolBinario {

	public static void main(String[] args) {
		ArbolBinario<String> m = new ArbolBinario<>("Maria");
		ArbolBinario<String> r = new ArbolBinario<>("Rodrigo");
		ArbolBinario<String> e = new ArbolBinario<>("Esperanza", m, r);
		ArbolBinario<String> an = new ArbolBinario<>("Anyora");
		ArbolBinario<String> ab = new ArbolBinario<>("Abel");
		ArbolBinario<String> mj = new ArbolBinario<>("M de Jesús", an, ab);
		ArbolBinario<String> raiz = new ArbolBinario<>("Esperanza", e, mj);
		
		Visitor<String> v = new PrintingVisitor<>();
		
		System.out.println("Recorrido en Preorden");
		raiz.recorridoEnProfundidad(new PreOrden<>(v));
		System.out.println("\nRecorrido en Inorden");
		raiz.recorridoEnProfundidad(new InOrden<>(v));
		System.out.println("\nRecorrido en PostOrden");
		raiz.recorridoEnProfundidad(new PostOrden<>(v));
	}

}
