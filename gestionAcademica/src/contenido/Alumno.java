package contenido;

public class Alumno {

	//variables miembro
	public String nombreAlumno;
	public String dni;
	
	
	//Respecto a los alumnos, interesa saber el nombre y el dni.
	public Alumno(String nombre, String dni) {
		
		this.nombreAlumno = nombre;
		this.dni = dni; 
		
	}


	public String getNombre() {
		return nombreAlumno;
	}


	public String getDni() {
		return dni;
	}


	public void setNombre(String nombre) {
		this.nombreAlumno = nombre;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public static void anadeAlumno(String alumno) {
		
		
	}
	
	

}//cierre del class Alumno
