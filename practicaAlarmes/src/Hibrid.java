/** Classe que hereta directament d'Infraroig i, per a simular
l'her�ncia m�ltiple, t� un atribut de la classe Volum�tric **/
public final class Hibrid extends Infraroig
{

		/** Atribut que cont� informaci� per a saber la causa que ha fet saltar el sensor **/
	private	String LED;
		/** Atribut per a simular l'her�ncia m�ltiple **/
	private	Volumetric volum;

	/** Constructor amb quatre par�metres
	@param cd  Codi del sensor
	@param pr  Preu del sensor
	@param temperatura  Temperatura m�nima
	@param radi  Radi d'acci�**/
	public Hibrid(String cd, double pr, int temperatura, double radi)
	{
		super(cd, pr, temperatura);
		volum=new Volumetric(radi);
		LED="NORMAL";
	}

	/** Accessor d'escriptura de l'atribut LED
	@param l	LED **/
	public void setLED(String l)
	{
		LED=l;
	}

	/** Accessor de lectura de l'atribut LED **/
	public String getLED()
	{
		return LED;
	}
	/** Redefinici� del m�tode toString de la classe Object
	* @return  Retorna un string amb tota la informaci� del sensor **/
	public String toString()
	{
		return("SENSOR HIBRID\n"+"\tCodi: "+getCodi()+"\n\tPreu: "+getPreu()+"\n\tTemperatura: " + getTemperatura() +"\n\tRadi d'accio: "+ volum.getRadi()+"\n\tLED: "+getLED()+"\n\n");
	}

}