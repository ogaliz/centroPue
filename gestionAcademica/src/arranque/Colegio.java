package arranque;

import contenido.*;

public class Colegio {

	public Colegio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Alumno Pedro = new Alumno("Pedro", "34554795H");
		Pedro.setNombre("Marta");
		
		System.out.println("El colegio tiene solo un alumno, que es: "+Pedro.getNombre());
		
		Asignatura mates = new Asignatura();
		Asignatura filo = new Asignatura();
		
		System.out.println(Asignatura.getCantidadAsignaturas());
		
		String[] asignaturas
		
		

	}//cierre del main

}//cierre de colegio
