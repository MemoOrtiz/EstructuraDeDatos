package u4.tareaEquipo;

public interface PrePostVisitor<E> {
	void preVisit(E e);
	void inVisit(E e);
	void postVisit(E e);
	boolean isDone();
}
