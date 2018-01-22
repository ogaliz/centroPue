package funcionescortas;

import java.util.Scanner;

public class recorrerArray {
	
	//constructor por defecto
	public recorrerArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static void recorre(int[]matriz) {
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<matriz.length; i++) {
			
			System.out.println("La posicion "+(i+1)+" del array es: "+matriz[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		int []mi_array = {3, 5, 6, 7, 8};
		
		recorre(mi_array);
		
		String[] items= {"Vestido", "Pantalon", "Camisa"};
		
		for(String muestrame: items) {
			
			if(muestrame=="Pantalon") {
				break;
			}
			System.out.print(muestrame+"  ");
		}
		
			
	}//cierre del main

}//cierre del class
