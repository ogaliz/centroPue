package coches;

public class Principal {

	public static void main(String[] args) {
		
	Matricula matricula1 = new Matricula(23, 3456, "dkh");
		
	Vehiculo jaguar = new Vehiculo();
	
	jaguar.consumo= 15f;
	
	System.out.println("La autonomia de su coche es de: "+jaguar.calculaAutonomia(65f)*100+"Kms.");

		System.out.println(matricula1.toString());

		

	}//cierre del main

}//cierre del class
