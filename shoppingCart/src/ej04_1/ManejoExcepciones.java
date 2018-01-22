package ej04_1;

import java.awt.image.ImagingOpException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class ManejoExcepciones {

	/**
	 * Hay dos tipos de errores en Java:
	 * 		De compilacion, esto es, error de sintaxis nuestro
	 * 		Error de ejecucion, una vez compilado y ejecutado es cuando se genera un error.
	 * Todo objeto error Hereda de la clase THROABLE, estos se dividen en dos grupos:
	 * 		La clase error -> suele ocurrir por un error de hardware, memoria, parte corrupta..
	 * 		La clase exeption -> estas se dividen en dos mas:
	 * 			IOExeption -> estos no son culpa del programador, que alguien haya movido una carpeta y el compilador no la encuentra
	 *   		RuntimeExeption -> errores por parte del programador, como por ejemplo recorrrer un array con mas posiciones de las que se declaro
	 * 
	 * */
	
	public void TraeImagen() {
		
		try {
			iamgen = ImageIO.read(C:\Users\devweb\Pictures); 
		} catch (Exception e) {
			System.out.println("La imagen no se ha encontrado");
		}
		
	}
	
	public static void main(String[] args) {
		
		int mi_array[] = {5, 6, 7, 8, 2};
		
		for(int i=0; i<mi_array.length; i++) {
			
			System.out.println("Tu array es de "+mi_array[i]);
			
		}
		
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ahora tu edad"));
		
		System.out.println("Hola "+nombre+", tu edad es "+edad+".");
		
		
	}//cierre del metodo main

}//cierre del class
