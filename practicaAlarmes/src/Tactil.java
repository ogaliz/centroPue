/** Classe que hereta de Sensor tots els m�todes i atributs.
No afegeix cap atribut ni comportament especial*/
public final class Tactil extends Sensor
{
		/** Constructor amb dos par�metres
		@param cd  Codi del sensor
		@param pr  preu del sensor **/
		public Tactil(String cd, double pr)
		{
			super(cd,pr);
		}

		/** Redefinici� del m�tode toString de la classe Object
		* @return  Retorna un string amb tota la informaci� del sensor **/
		public String toString()
		{
			return("SENSOR TACTIL\n"+super.toString()+"\n");
		}
}