package u4;

public interface Visitor<E> {
    void visit(E e);
    boolean isDone();
}
