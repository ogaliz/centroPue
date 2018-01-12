/** Classe que hereta de Sensor tots els m�todes i atributs.
T� un atribut que indica la temperatura m�nima **/
public class Infraroig extends Sensor
{
	protected
		int temperatura;
	/** Constructor amb tres par�metres
	@param cd  Codi del sensor
	@param pr  preu del sensor
	@param t  temperatura m�nima **/
	public Infraroig(String cd, double pr, int t)
	{
		super(cd,pr);
		temperatura=t;
	}

	/** Accessor de lectura de la temperatura m�nima
	@return Temperatura m�nima que fa disparar el sensor**/
	public int getTemperatura()
	{
		return temperatura;
	}

	/** Accessor d'escriptura de la temperatura m�nima**/
	public void setTemperatura(int t)
	{
		temperatura=t;
	}

	/** Redefinici� del m�tode toString de la classe Object
	* @return  Retorna un string amb tota la informaci� del sensor **/
	public String toString()
	{
		return("SENSOR INFRAROIG\n"+super.toString()+"\tTemperatura: "+getTemperatura()+"\n\n");
	}
}