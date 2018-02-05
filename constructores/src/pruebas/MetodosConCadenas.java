package pruebas;

import java.util.Scanner;

/**
 * Para evitar el error de IndexOutOfBounds tenemos que diferenciar el numero de carac.
 * que tiene una cadena con el inidce que tienen esos caracteres en la cadena, 
 * cuando utilizamos el metodo length en una cadena, nos devuelve el numero total, por 
 * el contrario, si hacemos referencia a un elemento del array, hay que tener en cuenta 
 * que empiezan por cero, es decir, si pongo "Oscar", tiene cinco letras, pero si hago 
 * referencia al ultimo de los caracteres tendre que utilizar el cuatro, o lo que es lo mismo
 * miNombre.length()-1.
 * */

public class MetodosConCadenas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una frase para invertirla");
		String laFrase = teclado.nextLine();
		
		teclado.close();
		
		System.out.println(laFrase);
		
		for (int i= laFrase.length()-1; i>= 0; i--) {
			
			System.out.print(laFrase.charAt(i));
			
		}
		
	}//cierre del main

}//cierre del class
