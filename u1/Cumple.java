package u1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cumple {

	public static void main(String[] args) throws IOException {
		DiaAnyo hoy;
		DiaAnyo cumpleanios;
		int d, m;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca la fecha de hoy, dia ");
		d = Integer.parseInt(entrada.readLine());
		System.out.println("Introduzca el numero de mes: ");
		m = Integer.parseInt(entrada.readLine());
		
		hoy = new DiaAnyo(d,m);
		
		System.out.println("Introduzca su fecha de nacimiento");
		d = Integer.parseInt(entrada.readLine());
		System.out.println("Introduzca el numero de mes: ");
		m = Integer.parseInt(entrada.readLine());
		cumpleanios = new DiaAnyo(d,m);
		
		System.out.println(" La fecha de hoy es ");
		hoy.visualizar();
		System.out.println(" Su fecha de nacimiento es ");
		cumpleanios.visualizar();
		
		if (hoy.igual(cumpleanios)) {
			System.out.println("¡Feliz cumpleaños ! ");
		}else {
			System.out.println("¡ Feliz dia !");
		}
	}
}
