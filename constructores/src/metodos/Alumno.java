package metodos;

import java.math.BigDecimal;

public class Alumno {

	public static void main(String[] args) {
		
		String frase = "Hola mundo Java";
		
		int prueba = frase.codePointAt(0);
		
		String anade = "esto va al final";
	
		System.out.println(frase.concat(anade));
		
		System.out.println("esto es una prueba "+prueba);
		
		int numero = Integer.MAX_VALUE;
		System.out.println("El valor maximo de tipo int es: "+ numero);
		
		byte edad = 127; 
		
		byte suma = (byte)(edad+3);
		
		System.out.println("el total de la suma es "+suma);
		
		BigDecimal miNumero = new BigDecimal("0.035");
		
		BigDecimal suma1 = miNumero.add(miNumero);
		
		System.out.println("Utilizando clase BigDecimal "+suma1);
		
		
		
		
		
		
	}//cierre del main

}//cierre del class
