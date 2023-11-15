package unidad4_arbolesbinarios;

public class ArbolBinario<E> {
	//Atributos
	protected E raiz;
	protected ArbolBinario<E> izq;
	protected ArbolBinario<E> der;
	
	/**
	 * Crear un arbol binario con sus tres parametros - nodo interno
	 * @param raiz
	 * @param izq
	 * @param der
	 */
	public ArbolBinario(E raiz, ArbolBinario<E> izq, ArbolBinario<E> der) {
		this.raiz = raiz;
		this.izq = izq;
		this.der = der;
	}
	/**
	 * Crear arbol binario vacío
	 */
	public ArbolBinario() {
		this(null, null, null);  //llama al constructor de tres parámetros
	}
	/**
	 * Crear arbol binario hoja
	 * @param raiz
	 */
	public ArbolBinario(E raiz) {
		this(raiz, new ArbolBinario<>(), new ArbolBinario<>());
	}
	
	public E getRaiz() {
		return raiz;
	}
	
	public ArbolBinario<E> getIzq(){
		return izq;
	}
	
	public ArbolBinario<E> getDer(){
		return der;
	}
	
	public boolean isVacio() {
		return raiz == null && izq == null && der == null;
	}
	
	public void vaciar() {
		raiz = null;
		izq = null;
		der = null;
	}
	
	public boolean isHoja() {
		return izq.isVacio() && der.isVacio();
	}
	
	public void recorridoEnProfundidad(PrePostVisitor<E> visitor) {
		if(!isVacio()) {
			visitor.preVisit(raiz);
			izq.recorridoEnProfundidad(visitor);
			visitor.inVisit(raiz);
			der.recorridoEnProfundidad(visitor);
			visitor.postVisit(raiz);
		}
	}
}
