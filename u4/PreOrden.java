package u4;

public class PreOrden<E> extends AbstractPrePostVisitor<E> {
    private Visitor<E> visitor;

    public PreOrden(Visitor <E> visitor) {
        this.visitor = visitor;
    }

    public void preVisit(E e) {
        visitor.visit(e);
    }
}
