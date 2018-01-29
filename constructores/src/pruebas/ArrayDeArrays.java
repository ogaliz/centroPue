package pruebas;

import java.util.Vector;

public class ArrayDeArrays {

	public ArrayDeArrays() {
		
	}

	public static void main(String[] args) {
		
		String []misNumeros = {"curro", "paco", "ana"};
		String []misLetras = {"seis", "siete", "cuatro"};
		
		Vector<String[]> miLista = new Vector<String[]>();
		
		miLista.add(misNumeros);
		miLista.add(misLetras);
		
		
		for(int i=0; i<miLista.size(); i++) {
			
			for(String muestra: miLista.elementAt(i)) {
				
				System.out.print(muestra+"  ");
			}
			
			System.out.println("  ");
		}
	
	}//cierre del main

}//cierre del class
