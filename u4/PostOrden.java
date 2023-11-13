package u4;

public class PostOrden<E> extends AbstractPrePostVisitor<E> {
    private Visitor <E> visitor;

    public PostOrden (Visitor<E> visitor) {
        this.visitor= visitor;
    }

    public void postVisit(E e) {
        visitor.visit(e);
    }
}
