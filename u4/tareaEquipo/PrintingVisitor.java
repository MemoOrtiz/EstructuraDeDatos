package u4.tareaEquipo;

public class PrintingVisitor<E> implements Visitor<E> {
	private boolean done = false;
	
	public void visit(E e) {
		System.out.print(e + ", ");
		done = true;
	}
	
	public boolean isDone() {
		return done;
	}
}
