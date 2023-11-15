package unidad4_arbolesbinarios;

public interface Visitor<E> {
	void visit(E e);
	boolean isDone();
}
