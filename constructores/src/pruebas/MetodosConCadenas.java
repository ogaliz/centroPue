package pruebas;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class MetodosConCadenas {

	public static void main(String[] args) {
		
		String lafrase = "Esto es una prueba para aplicar";
		
		char laLetra = lafrase.charAt(10);
		
		System.out.println(lafrase.indexOf('p'));
		
		System.out.println("esto es la letra en la posicion siete "+laLetra);
		
		System.out.format("La frase de nuestro %s ejemplo es ", laLetra);
		
		
		
		

	}//cierre del main

}
