package unidad4_arbolesbinarios;

public class ArbolBinarioDeBusqueda<E> extends ArbolBinario<E> {
	private ArbolBinarioDeBusqueda<E> getABBizq(){
		return (ArbolBinarioDeBusqueda<E>)getIzq();
	}
	
	private ArbolBinarioDeBusqueda<E> getABBder(){
		return (ArbolBinarioDeBusqueda<E>)getDer();
	}
	
	public Comparable<E> encontrar(Comparable<E> obj){
		if(isVacio()) {
			return null;
		}
		int diff = obj.compareTo((E)getRaiz());
		if(diff == 0) {
			return (Comparable<E>)((E)getRaiz());
		}else if(diff < 0) {
			return getABBizq().encontrar(obj);
		}else {
			return getABBder().encontrar(obj);
		}
	}
	
	public Comparable<E> encontrarMenor(){
		if(isVacio()) {
			return null;
		}else if(getABBizq().isVacio()) {
			return (Comparable<E>)((E)getRaiz());
		}else {
			return getABBizq().encontrarMenor();
		}
	}
	
	public Comparable<E> encontrarMayor(){
		if(isVacio()) {
			return null;
		}else if(getABBder().isVacio()) {
			return (Comparable<E>)((E)getRaiz());
		}else {
			return getABBder().encontrarMayor();
		}
	}
	
	public void insertar(Comparable<E> obj) {
		if(isVacio()) {
			raiz = (E)obj;
			izq = new ArbolBinarioDeBusqueda<>();
			der = new ArbolBinarioDeBusqueda<>();
		}else {
			int diff = obj.compareTo((E)getRaiz());
			if(diff == 0) {
				throw new IllegalArgumentException("Raiz duplicada");
			}
			if(diff < 0) {
				getABBizq().insertar(obj);
			}else {
				getABBder().insertar(obj);
			}
		}
	}
	
	public void eliminar(Comparable<E> obj) {
		if(isVacio()) {
			throw new IllegalArgumentException("objeto no encontrado");
		}
		int diff = obj.compareTo((E)raiz);
		if(diff == 0) {
			if(!getABBizq().isVacio()) {
				Comparable<E> mayor = getABBizq().encontrarMayor();
				raiz = (E)mayor;
				getABBizq().eliminar(mayor);
			}else if(!getABBder().isVacio()) {
				Comparable<E> menor = getABBder().encontrarMenor();
				raiz=(E)menor;
				getABBder().eliminar(menor);
			}else {
				removerRaiz();
			}
		}else if(diff < 0) {
			getABBizq().eliminar(obj);
		}else {
			getABBder().eliminar(obj);
		}
	}

	public E removerRaiz() {
		if(!isHoja()) {
			throw new IllegalArgumentException("El nodo raiz: " + raiz + " no es hoja");
		}
		E result = raiz;
		vaciar();
		return result;
	}
}
