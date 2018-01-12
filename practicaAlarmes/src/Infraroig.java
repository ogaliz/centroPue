/** Classe que hereta de Sensor tots els mètodes i atributs.
Té un atribut que indica la temperatura mínima **/
public class Infraroig extends Sensor
{
	protected
		int temperatura;
	/** Constructor amb tres paràmetres
	@param cd  Codi del sensor
	@param pr  preu del sensor
	@param t  temperatura mínima **/
	public Infraroig(String cd, double pr, int t)
	{
		super(cd,pr);
		temperatura=t;
	}

	/** Accessor de lectura de la temperatura mínima
	@return Temperatura mínima que fa disparar el sensor**/
	public int getTemperatura()
	{
		return temperatura;
	}

	/** Accessor d'escriptura de la temperatura mínima**/
	public void setTemperatura(int t)
	{
		temperatura=t;
	}

	/** Redefinició del mètode toString de la classe Object
	* @return  Retorna un string amb tota la informació del sensor **/
	public String toString()
	{
		return("SENSOR INFRAROIG\n"+super.toString()+"\tTemperatura: "+getTemperatura()+"\n\n");
	}
}