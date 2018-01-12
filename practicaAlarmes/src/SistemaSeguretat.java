/** Classe que emmagatzema informaci� d'un Sistema de Seguretat **/
import java.util.Iterator;
import java.util.Vector;
public final class SistemaSeguretat
{
	private	double preu_llum=300.0;
	private	double preu_sirena=500.0;
		/** Atribut que ens dir� si el sistema de seguretat ja ha estat venut o no **/
	private	boolean venut;
	private	String codi;
	private	double preu_central;
	private	java.util.Vector lsensors;

		/**
		 * Constructor amb dos par�metres.
		 *
		 * @param c  Codi alfanum�ric del Sistema de Seguretat.
		 * @param pr Preu de la central.
		 **/

		public SistemaSeguretat(String c, double pr)
		{
			codi=c;
			preu_central=pr;
			lsensors=new java.util.Vector();
			venut=false;
		}

		/** Accessor de lectura del codi del Sistema de Seguretat
		@return  Retorna el codi del Sistema **/
		public String getCodi()
		{
			return codi;
		}

		/** Accessor de lectura del preu de la central del Sistema de Seguretat
		@return  Retorna el preu del Sistema **/
		public double getPreuCentral()
		{
			return preu_central;
		}

		/** Accessor d'escriptura del codi del Sistema **/
		public void setCodi(String c)
		{
			codi=c;
		}

		/** Accessor d'escriptura del preu de la central del Sistema**/
		public void setPreuCentral(double p)
		{
			preu_central=p;
		}

		/** Informa de si el Sistema de Seguretat s'ha venut o no
		@return  true si el Sistema ja ha estat venut; fals altrament  **/
		public boolean jaVenut()
		{
			return venut;
		}

		/** Accessor de lectura de la llista de sensors del sistema
		@return  llista de sensors del Sistema **/
		private Vector getLsensors()
		{
			return lsensors;
		}


		/** M�tode que indica que el sistema de seguretat es ven **/
		public void vendreSistema()
		{
			venut=true;
		}

		/** M�tode que retorna el preu d'un sistema de seguretat
		Es t� en compte el preu dels seus sensors.
		@return  Preu del Sistema de seguretat sense els sensors **/

		public double getPreu()
		{
			double preu=preu_llum+preu_sirena+getPreuCentral();
			for (java.util.Iterator i=getLsensors().iterator();i.hasNext();)
				preu=preu+((Sensor)i.next()).getPreu();
			return preu;
		}

		/** Comprova si el sensor est� repetit dins de la
		* llista de sensors del Sistema de Seguretat
		*@param sen  Sensor a buscar
		*@return cert si el codi est� repetit; fals altrament**/
		public boolean existeixSensor(Sensor sen)
		{
			int i = getLsensors().indexOf(sen);
			return (i>=0);
		}

		/** M�tode que afegeix un sensor a la llista de sensors
		Cal controlar que el sensor no existeixi ja a la llista

		@param sen  Sensor a afegir**/
		public void afegirSensor(Sensor sen)
		{
			if (!existeixSensor(sen))
				lsensors.add(sen);
			else
		   	{
				System.out.println("ERROR en afegir el sensor "+sen.getCodi() + " al Sistema de Seguretat " + getCodi());
		   		System.out.println("El sensor ja existeix al Sistema\n Sensor no afegit");
			}
		}

		/** M�tode que comprova si dos Sistemes de Seguretat s�n iguals.
		* Redefineix el m�tode equals de la classe Object

		* @param ss un altre objecte de la classe SistemaSeguretat
    	* @return  cert, si ambd�s sistemes tenen el mateix codi i s�n no nul;
    	           fals, altrament
    	**/

   		public boolean equals(Object ss)
		{
			/* Comprovem que el par�metre i el codi del sistema no siguin null */
			if ( (ss == null) || (getCodi() == null) )  return  false;

			/* Comprovem que el par�metre sigui una inst�ncia de SistemaSeguretat */
			if ( ! (ss instanceof SistemaSeguretat) )  return  false;

			/* Comprovem que els codis s�n iguals */

			return  getCodi().equals( ((SistemaSeguretat)ss).getCodi());
		}

		/** Redefinici� del m�tode toString de la classe Object
		 @return  Retorna un string amb tota la informaci� del Sistema de Seguretat */
		public String toString()
		{
			String res="Sistema Seguretat Codi: "+getCodi()+"\nPreu de la central: "+getPreuCentral()+"\nSENSORS\n------------------------------------------------\n";
			Sensor s;
			double preu=preu_llum+preu_sirena+getPreuCentral();
			for (java.util.Iterator i=lsensors.iterator();i.hasNext();)
			{
				s=(Sensor)i.next();
				res=res+"\t"+s.toString();
				preu=preu+s.getPreu();
			}
			return res+"Preu: "+preu+"\n\n\n";
		}
}