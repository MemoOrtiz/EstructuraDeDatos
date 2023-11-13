package u4;

public class PrintingVisitor<E> implements Visitor<E> {
    private boolean done= false;
    public void visit(E e) {
        System.out.println(e+", ");
        done = true;
    }

    public boolean isDone() {
        return done;
    }
}
