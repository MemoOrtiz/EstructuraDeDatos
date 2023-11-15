package unidad4_arbolesbinarios;

public interface PrePostVisitor<E> {
	void preVisit(E e);
	void inVisit(E e);
	void postVisit(E e);
	boolean isDone();
}
