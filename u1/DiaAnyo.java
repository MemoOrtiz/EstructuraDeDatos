package u1;

public class DiaAnyo {
private int dia;
private int mes;

	public DiaAnyo(int dia, int mes) {
	super();
	this.dia = dia;
	this.mes = mes;
}
	public boolean igual(DiaAnyo d) {
		if(dia == d.dia && mes == d.mes){
			return true;
		}else {
			return false;
		}
	}
	
	public void visualizar () {
		System.out.println(" Mes = "+ mes + "\n Dia = " + dia);
	}
}
