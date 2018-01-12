/** Classe que emmagatzema totes les caracter�stiques comuns
* dels sensors */
public abstract class Sensor
{

		/** Atribut que emmagatzema el codi del sensor **/
	protected	String codi;
		/** Atribut que emmagatzema el preu del sensor **/
	protected	double preu;
		/** Atribut que emmagatzema el sistema de seguretat on es troba
		Si val null �s que no est� assignat a cap sistema **/
	protected	String sistema;

		/** Constructor amb dos par�metres
		@param cd  Codi del sensor
		@param pr  preu del sensor **/
		public Sensor(String cd, double pr)
		{
			codi=cd;
			preu=pr;
			sistema=null;
		}

		/**Sobrec�rrega del constructor per a millorar la simulaci� de l'her�ncia m�ltiple **/
		public Sensor()
		{
			codi="0";
			preu=0;
			sistema=null;
		}

		/** Accessor d'escriptura de l'atribut sistema
		@param sis	Sistema on pertany el sensor**/
		public void setSistema(String sis)
		{
			sistema=sis;
		}

		/** Accessor d'escriptura de l'atribut codi
		@param c	Codi del sensor**/
		public void setCodi(String c)
		{
			codi=c;
		}

		/** Accessor d'escriptura de l'atribut preu
		@param p	Preu del sensor**/
		public void setPreu(double p)
		{
			preu=p;
		}

		/** Accessor de lectura del codi del sensor
		@return codi del sensor**/
		public String getCodi()
		{
			return codi;
		}

		/** Accessor de lectura del preu del sensor
		@return preu del sensor**/
		public double getPreu()
		{
			return preu;
		}

		/** Accessor de lectura del sistema on es troba el sensor
		@return sistema del sensor**/
		public String getSistema()
		{
			return sistema;
		}

		/** M�tode que comprova si dos sensors s�n iguals.
		* Redefineix el m�tode equals de la classe Object

		* @param sen un altre objecte de la classe Sensor
		* @return  cert, si ambd�s sensors tenen el mateix codi i s�n no nul; fals, altrament
    	**/
    	public boolean equals(Object sen)
		{
			/* Comprovem que el par�metre i el codi del sensor no siguin null */
			if ( (sen == null) || (getCodi() == null) )  return  false;

			/* Comprovem que el par�metre sigui una inst�ncia de Client */
			if ( ! (sen instanceof Sensor) )  return  false;

			/* Comprovem que els DNI's s�n iguals */

			return  getCodi().equals( ((Sensor)sen).getCodi() );
		}

		/** Redefinici� del m�tode toString de la classe Object
		* @return  Retorna un string amb tota la informaci� del sensor **/
		public String toString()
		{
			return("\tCodi: "+getCodi()+"\n\tPreu: "+getPreu()+"\n");
		}
}