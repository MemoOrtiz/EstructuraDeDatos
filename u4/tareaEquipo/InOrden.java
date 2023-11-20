package u4.tareaEquipo;

public class InOrden<E> extends AbstractPrePostVisitor<E> {
	private Visitor<E> visitor;
	
	public InOrden(Visitor<E> visitor) {
		this.visitor = visitor;
	}
	
	public void inVisit(E e) {
		visitor.visit(e);
	}
}
