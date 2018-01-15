package poo;

import java.util.Scanner;

public class ProbarTriangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Triangulo tri1 = new Triangulo();
		Triangulo tri2 = new Triangulo();
		Triangulo tri3 = new Triangulo(4.3, 5.1, 1.8);

//=============SET LADOS TRIANGULO 1============================
		
		System.out.println("Dime el lado uno: ");
		tri1.setLado1(teclado.nextDouble());
		
		System.out.println("Dime el lado dos: ");
		tri1.setLado2(teclado.nextDouble());
		
		System.out.println("Dime el lado tres: ");
		tri1.setLado3(teclado.nextDouble());

//=============SET LADOS TRIANGULO 2============================
		
		System.out.println("Dime el lado uno: ");
		tri2.setLado1(teclado.nextDouble());
		
		System.out.println("Dime el lado dos: ");
		tri2.setLado2(teclado.nextDouble());
		
		System.out.println("Dime el lado tres: ");
		tri2.setLado3(teclado.nextDouble());
		
//===========================================================
		
		System.out.println("El perimetro de su triangulo numero uno es: "+tri1.perimetro()+
				" y el de su numero dos es: "+tri2.perimetro()+".");
		
		System.out.println("El perimetro del triangulo 3 es "+tri3.perimetro());
		
		Utiles.imprimir("Se ha terminado el programa, impreso desde metodo estatico");
		
		teclado.close();
				
	}//cierre del main

}//cierre del class
