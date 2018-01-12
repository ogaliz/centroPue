/** Classe que hereta de Sensor tots els mètodes i atributs.
Té un atribut que indica el radi d'acció **/
public class Volumetric extends Sensor
{
	private
		double radi;
	/** Constructor amb tres paràmetres
	@param cd  Codi del sensor
	@param pr  preu del sensor
	@param r  radi d'acció **/
	public Volumetric(String cd, double pr, double r)
	{
		super(cd,pr);
		radi=r;
	}

	/** Sobrecàrrega del constructor per a evitar conflictes en l'herència múltiple
	@param r  Radi d'acció**/
	public Volumetric(double r)
	{
		super();
		radi=r;
	}

	/** Accessor d'escriptura del radi d'acció del sensor**/
	public void setRadi(double r)
	{
		radi=r;
	}

	/** Accessor de lectura del radi d'acció del sensor
	@return radi d'acció del sensor**/
	public double getRadi()
	{
		return radi;
	}


	/** Redefinició del mètode toString de la classe Object
	* @return  Retorna un string amb tota la informació del sensor **/
	public String toString()
	{
		return("SENSOR VOLUMETRIC\n"+super.toString()+"\tRadi d'accio: "+getRadi()+"\n\n");
	}
}