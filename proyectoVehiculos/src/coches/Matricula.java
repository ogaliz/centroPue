package coches;

public class Matricula {

	//attr===========
	int codProvincia;
	int numerosMatr; 
	String letrasAdicionales;

	//metodo construcotr===============
	public Matricula(int codProvincia, int numerosMatr, String letrasAdicionales) {
		this.codProvincia = codProvincia;
		this.numerosMatr = numerosMatr;
		this.letrasAdicionales = letrasAdicionales;
	}

	//metodos geter================
	public int getCodProvincia() {
		return codProvincia;
	}
	public int getNumerosMatr() {
		return numerosMatr;
	}
	public String getLetrasAdicionales() {
		return letrasAdicionales;
	}
	
	//metodos seter========================
	public void setCodProvincia(int codProvincia) {
		this.codProvincia = codProvincia;
	}
	public void setNumerosMatr(int numerosMatr) {
		this.numerosMatr = numerosMatr;
	}
	public void setLetrasAdicionales(String letrasAdicionales) {
		this.letrasAdicionales = letrasAdicionales;
	}
	
	//otros metodos==============================

	@Override
	public String toString() {
		return "Matricula{" + codProvincia + "-" + numerosMatr + "-" + letrasAdicionales + "}\n";
	}
}
