package funcionescortas;

public class Item {

	public int ID;
	public String descripcion;
	public int quantity;
	public double price;
	
	//constructor
	public Item() {
		
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	


	public static void main(String[] args) {
		
		Item martillo = new Item();
		Item alicates = new Item();
		
		martillo.setDescripcion("Martillo super resistente");
		alicates.setDescripcion("Alicates con mango antideslizante");
		
		martillo = alicates;
		
		System.out.println(martillo.getDescripcion());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//cierre del main

}//cierre del class main
