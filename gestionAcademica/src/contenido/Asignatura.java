package contenido;

public class Asignatura {
	
	//variables miembro===============================================
	public String nombre;
	public String codigo;
	public static String[] asignaturas= new String[30];
	public static int cantidadAsignaturas; 
	
	//constructores de objeto==========================================
	public Asignatura(){
		
		cantidadAsignaturas++; 
		
	}
	
	public Asignatura(String nombre, String codigo) {
		
		cantidadAsignaturas++;
		this.nombre = nombre;
		this.codigo = codigo;

	}

	//metodos seter y geter================================================
	
	public static int getCantidadAsignaturas() {   //Devuelve numero total de asignaturas

		return cantidadAsignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static void dameNombresAsignaturas() {
		
		for(int i=0; i<cantidadAsignaturas; i++) {
			
			
			
		}
		
	public anadeAlumno() {
		
		
	}
		
	}//cierre del metodo de los nombres
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}//cierre del class de la asignatura
