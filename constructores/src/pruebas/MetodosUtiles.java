package pruebas;

public class MetodosUtiles {

	public MetodosUtiles() {
		// TODO Auto-generated constructor stub
	}
	
	public static void CalculaMedia() {
		
		double[] miArray={2, 4, 6, 6, 3, 8, 1, 8, 4, 7};
		double total=0;
		
		for(int i=0; i<miArray.length; i++) {
			
			total+= miArray[i];
			
		}
		
		System.out.println("La media del array es: "+total/miArray.length);
		
	}//cierre del calcularMedia

	public static void main(String[] args) {
				
		MetodosUtiles.CalculaMedia();

	}//cierre del main
	
}//cierre del classs MetodosUtiles
