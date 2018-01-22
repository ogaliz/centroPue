package coches;

public class Principal {

	public static void main(String[] args) {
		
		
	Vehiculo jaguar = new Vehiculo();
	
	jaguar.consumo= 15f;
	
	System.out.println("La autonomia de su coche es de: "+jaguar.calculaAutonomia(65f)*100+"Kms."); 
		
		
		
		
		
		

	}//cierre del main

}//cierre del class
