/** Classe derivada de Servei que representa la reparació d'un Sistema de
seguretat **/
/** @see  Servei **/
import java.util.Vector;
import java.util.Iterator;
public final class Reparacio extends Servei
{
	/** Atribut que emmagatzema els sensors que s'han reparat **/
	private java.util.Vector lsensorsRep;

	/** Temps en minuts destinats a la reparacio **/
	private int temps;
	/** Constructor amb quatre paràmetres
	* @param cd  Codi identificador del servei
	* @param dt  Data del servei
	* @param s  Sistema de seguretat
	* @param minuts  Minuts destinats a la reparacio
	**/
	Reparacio(String cd, String dt, SistemaSeguretat s, int minuts)
	{
		super(cd, dt, s);
		temps=minuts;
		lsensorsRep=new java.util.Vector();
	}

	/** Accessor de lectura de la llista de sensors de la reparació
	@return  llista de sensors de la reparació **/
	private Vector getLsensorsRep()
	{
		return lsensorsRep;
	}

	/** Accessor de lectura del temps de la reparació
	@return  Retorna el temps en minuts **/
	private int getTemps()
	{
		return temps;
	}

	/** Implementació del mètode abstracte.
	El preu de la reparació d'un sistema de seguretat és la suma del preu
	dels sensors + 2*minuts emprats+7% d'IVA
	@return  preu de la reparació**/
	public double calcularPreu()
	{
		double res=2.0*(double) getTemps();
		Sensor s;
		for (java.util.Iterator i=getLsensorsRep().iterator();i.hasNext();)
		{
			s=(Sensor)i.next();
			res=res+s.getPreu();
		}
		return res*(1.0+7.0/100.0);
	}

	/** Mètode que afegeix un sensor que ha estat reparat
	No pot ser que s'afegeixi un sensor que no formi part del sistema de seguretat

	@param sen  Codi del sensor reparat
	**/

	public void repararSensor(Sensor sen)
	{
		if (sistema.existeixSensor(sen))
			lsensorsRep.add(sen);
		else
		{
			System.out.println("El sensor amb codi " +sen.getCodi() + " no forma part del sistema "+sistema.getCodi());
			System.out.println("associat a la reparacio " + getCodi());
			System.out.println("Sensor no reparat\n");
		}
	}

	/** Mètode que diu si hi ha sensors reparats.
	Necessari per comprovar que la reparació té algun sensor reparat **/

	public boolean hiHaSensors()
	{
		return !(getLsensorsRep().isEmpty());
	}

	/** Redefinició del mètode toString de la classe Object
	* @return  Retorna un string amb tota la informació de la reparació **/
	public String toString()
	{
		Sensor s;
		String res="Codi REPARACIO: " + getCodi() + "\t" + sistema.getCodi() + "\t" + getData() + "\t" +calcularPreu() + "\nTEMPS: " + getTemps() + " minuts\nSENSORS REPARATS\n----------------------------------------\n" ;
		for (java.util.Iterator i=lsensorsRep.iterator();i.hasNext();)
		{
			s=(Sensor)i.next();
			res=res+"\t"+s.toString();
		}
		return res;
	}

}