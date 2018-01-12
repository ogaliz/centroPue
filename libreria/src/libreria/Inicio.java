package libreria;

class Libro{
	
	public static int libros_totales;
	
	//variables miembro 
		private String titulo;
		private String autor;
		private String editorial;

	//constructores 
		public Libro() {
			
		}
		public Libro(String titulo, String autor, String editorial) {
			this.titulo= titulo;
			this.autor= autor;
			this.editorial= editorial;	
		}
		
	//geters y seters
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		
		public void lee_libro() {
			
			System.out.println("Te has leido el libro");
		}
		
		public void muestra_libro() {
			
			System.out.println("El libro leido es "+getTitulo()+" cuyo autor es "
					+getAutor()+" y con editorial "+getEditorial()+".");
			
		}

	
}//cierre class libro


public class Inicio {

	public Inicio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Libro filo = new Libro();
		Libro quimica = new Libro("Los materiales", "Marta Stewart", "Manhattan");
		
		filo.lee_libro();
		
		filo.setAutor("Dave Lee");
		filo.setEditorial("Altaya");
		filo.setTitulo("La monta�a");
		
		filo.muestra_libro();
		
		quimica.muestra_libro();
	
	}//cierre del main

}//cierre del class
