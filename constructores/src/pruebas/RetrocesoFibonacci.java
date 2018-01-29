package pruebas;

import java.util.Scanner;
/**
 * En un retroceso de Fibonacci cada numero es el resultado de la suma de los dos 
 * numeros anteriores a el. Por ejemplo: [1, 1, 2, 3, 5, 8]
 * */
public class RetrocesoFibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica el numero del que quieres obtener la seq:");
		int limite= teclado.nextInt();
		
		int misNumeros[]= new int[limite];
		misNumeros[0]=1;
		misNumeros[1]=1;
		
		for(int i=2; i<misNumeros.length; i++) {
			
			misNumeros[i]= misNumeros[i-1]+misNumeros[i-2];
			if(misNumeros[i]>misNumeros.length) {
				break;
			}
		}
		
		for(int muestra: misNumeros) {
			
				System.out.print(muestra+"  ");
					
		}
			
		teclado.close();

	}//cierre del main

}//cierre del class
