package unidad4_arbolesbinarios;

public abstract class AbstractPrePostVisitor<E> implements PrePostVisitor<E	> {
	public void preVisit(E e) {
		//nada
	}
	
	public void inVisit(E e) {
		//nada
	}
	
	public void postVisit(E e) {
		//nada
	}
	
	public boolean isDone() {
		return false;
	}
}
