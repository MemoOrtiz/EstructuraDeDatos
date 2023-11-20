package u4.tareaEquipo;

public interface Visitor<E> {
	void visit(E e);
	boolean isDone();
}
