package pruebas;

public class ManejoDeCadenas {

	public static void main(String[] args) {

		String custName = "Steve Smith";
		String firstName;
		int spaceIdx;

		// Get the index of the space character (" ") in custName.
		//nos devuelve un int con la posicion de un caracter que le pasemos.
		 spaceIdx = custName.indexOf(' ');


		// Use the substring method parse out the first name and print it.
		
		firstName = custName.substring(0, spaceIdx);		
		
		System.out.println("El entero de la posicion del espacio es: "+spaceIdx+
				" y el nombre de pila del usuario es: "+firstName+".");

	}//cierre del main

}//cierre del class
