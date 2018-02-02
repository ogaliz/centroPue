package ejrcicio1;

public class Vehiculo {
	
	//variables miembro
	String marca;
	String model;
	int anoCompra;
	String matricula;
	float consumo;

	//constructor
	public Vehiculo(){
		
	}

	public Vehiculo(String fabricate, String mod, int ano, String prov_matr, int num_matr, String lletres_matr, float consum) {
		this.marca = fabricate;
		this.model = mod;
		this.anoCompra = ano;
		this.matricula = prov_matr+num_matr+lletres_matr;
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
	public String getMatricula() {
		return matricula;
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
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	
	//================METODOS==============================================
	
	public float calculaAutonomia(float litres) {
		
		float autonomia = ((litres/consumo)*100);
		
		return autonomia;
	}

}//cierre del class Vehiculo
