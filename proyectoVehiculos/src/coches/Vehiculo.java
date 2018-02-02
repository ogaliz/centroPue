package coches;

public class Vehiculo {
	
	//variables miembro
	String marca;
	String model;
	int anoCompra;
	Matricula matricula;
	float consumo;

	//constructor
	public Vehiculo(){
		
	}

	public Vehiculo(String fabricate, String mod, int ano, int prov_matr, int num_matr, String lletres_matr, float consum) {
		this.marca = fabricate;
		this.model = mod;
		this.anoCompra = ano;
		this.matricula = new Matricula(prov_matr, num_matr, lletres_matr);
		this.consumo = consum;


	}//cierre del constructor por defecto
	
	//=======================metodos geter=====================
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public int getAnoCompra() {
		return anoCompra;
	}
	public float getConsumo() {
		return consumo;
	}
	
	//==================metodos seter========================
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setAnoCompra(int anoCompra) {
		this.anoCompra = anoCompra;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	
	//================METODOS==============================================
	
	public float calculaAutonomia(float litres) {
		
		float autonomia = ((litres/consumo)*100);
		
		return autonomia;
	}

	@Override
	public String toString() {
		return "Vehiculo{" + "marca='" + marca + '\'' + ", model='" + model + '\'' + ", anoCompra=" + anoCompra +
				", matricula=" + matricula +
				", consumo=" + consumo +
				'}';
	}
}//cierre del class Vehiculo
