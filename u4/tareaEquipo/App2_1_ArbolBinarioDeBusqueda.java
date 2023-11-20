package u4.tareaEquipo;

public class App2_1_ArbolBinarioDeBusqueda {

	public static void main(String[] args) {
		int[] entrada = {8, 3, 1, 20, 10, 5, 4};
		
		Visitor<Integer> v = new PrintingVisitor<>();
		ArbolBinarioDeBusqueda<Integer> abb1 = new ArbolBinarioDeBusqueda<>();
		for(Integer elemento : entrada) {
			abb1.insertar(elemento);
		}
		
		System.out.println("\nContenido del árbol binario de búsqueda");
		abb1.recorridoEnProfundidad(new InOrden<>(v));
		
		System.out.println("\nContenido luego de eliminar el nodo 10");
		abb1.eliminar(10);
		abb1.recorridoEnProfundidad(new InOrden<>(v));

		System.out.println("\nContenido luego de eliminar el nodo 3");
		abb1.eliminar(3);
		abb1.recorridoEnProfundidad(new InOrden<>(v));
	}

}
