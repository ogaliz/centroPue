/** Classe que hereta de Sensor tots els m�todes i atributs.
T� un atribut que indica el radi d'acci� **/
public class Volumetric extends Sensor
{
	private
		double radi;
	/** Constructor amb tres par�metres
	@param cd  Codi del sensor
	@param pr  preu del sensor
	@param r  radi d'acci� **/
	public Volumetric(String cd, double pr, double r)
	{
		super(cd,pr);
		radi=r;
	}

	/** Sobrec�rrega del constructor per a evitar conflictes en l'her�ncia m�ltiple
	@param r  Radi d'acci�**/
	public Volumetric(double r)
	{
		super();
		radi=r;
	}

	/** Accessor d'escriptura del radi d'acci� del sensor**/
	public void setRadi(double r)
	{
		radi=r;
	}

	/** Accessor de lectura del radi d'acci� del sensor
	@return radi d'acci� del sensor**/
	public double getRadi()
	{
		return radi;
	}


	/** Redefinici� del m�tode toString de la classe Object
	* @return  Retorna un string amb tota la informaci� del sensor **/
	public String toString()
	{
		return("SENSOR VOLUMETRIC\n"+super.toString()+"\tRadi d'accio: "+getRadi()+"\n\n");
	}
}