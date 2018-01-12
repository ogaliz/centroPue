/** Classe abstracta que recull atributs i mètodes comuns als dos
tipus de servei que un client pot sol·licitar: venda i reparació de
Sistemes de Seguretat. La classe no es pot instanciar directament, cal estendre-la per a
implementar els mètodes abstractes, d'acord amb l'especialitat de cada subclasse.**/

public abstract class Servei
{
	/** Atribut per al codi de servei **/
	    protected String codi;
	/** Data en què es va realitzar el servei en format dd/mm/aa **/
		protected String data;
	/** Sistema de seguretat que es va vendre o reparar **/
		protected SistemaSeguretat sistema;

	/** Constructor amb tres paràmetres
	* @param cd  Codi identificador del servei
	* @param dt  Data del servei
	* @param s  Sistema de seguretat
	**/
	public Servei(String cd, String dt, SistemaSeguretat s)
	{
		codi=cd;
		data=dt;
		sistema=s;
	}

	/** Accessor de lectura de la data del servei
	@return  Retorna la data del servei **/
	public String getData()
	{
		return data;
	}

	/** Accessor de lectura del codi del servei
	@return  Retorna el codi del servei **/
	public String getCodi()
	{
		return codi;
	}

	/** Accessor de lectura del sistema de seguretat del servei
	@return  Retorna el sistema de seguretat servei **/
	public SistemaSeguretat getSistema()
	{
		return sistema;
	}

	/** Accessor d'escriptura de la data del servei**/
	public void setData(String d)
	{
		data=d;
	}

	/** Accessor d'escriptura del codi del servei**/
	public void setCodi(String c)
	{
		codi=c;
	}

	/** Accessor d'escriptura del sistema de seguretat del servei**/
	public void setSistema(SistemaSeguretat sist)
	{
		sistema=sist;
	}

	public boolean equals(Object cli)
	{
		/* Comprovem que el paràmetre i el DNI del client no siguin null */
		if ( (cli == null) || (getCodi() == null) )  return  false;
		/* Comprovem que el paràmetre sigui una instància de Client */
		if ( ! (cli instanceof Servei) )  return  false;
	   	/* Comprovem que els DNI's són iguals */

	   	return  getCodi().equals( ((Servei)cli).getCodi() );
	}

	/** Mètode abstracte que calcula el preu d'un servei
	S'implementa de manera diferent en les classes derivades

	@return  Preu del servei
	**/
	public abstract double calcularPreu();
}