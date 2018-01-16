package ej04_1;

import java.util.Scanner;

public class Uso_Tallas {

/**
 * Video 48, tipos enumerados. Creamos una clase donde nos aseguremos que solo podemos almacenar
 * un determinado tipo de valores. 
 * Esto es, una variable objeto de tipo Enum.
 * Se debe de declarar siempre fuera del metodo main.
 * Los metodo de la clase Enum son estaticos, esto es, debemos llamarlos utilizando el 
 * nombre de la clase, no permiten crear objetos a partir de ella (utilizando el new).
 * Tambien se permite utilizar metodos geters y seters.
 * 
 * 
 * */
	enum Talla{//ahora van los valores que se pueden almacenar dentro de la clase
		//MINI, MEDIANO, GRANDE, MUY_GRANDE  //--> lo podemos hacer de esta forma, en una simple linea de valores
										   // que puede adoptar nuestro objeto.
		
		//==========Clase Enum utilizando metodos constructores====================
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {  //el metodo constructor no puede ser accedido desde fuera de la clase
			this.abreviatura=abreviatura;
		}
		public String getAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
		
		
	}//cierre de la clase enum.

	public static void main(String[] args) {
		/*Talla s= Talla.MINI;   //esto es una variable objeto.
		Talla m= Talla.MEDIANO;
		Talla l= Talla.GRANDE;
		Talla xl= Talla.MUY_GRANDE;
		*/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		String entradaDatos= teclado.next().toUpperCase();
		
		Talla laTalla= Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla: " +laTalla);
		System.out.println("Abreviatura: "+laTalla.getAbreviatura());
		
		teclado.close();

	}//cierre del main

}//cierre del class
