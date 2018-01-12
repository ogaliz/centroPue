/** Classe que emmagatzema informació d'un client **/
import java.util.Vector;
import java.util.Iterator;
public final class Client
{

	private	String nom;
	private	String cognoms;
	private	String DNI;
	private	String adresa;
	private	String telefon;
	private	String poblacio;

		/** Atribut que emmagatzema tots els serveis realitzats a un client **/
	private	java.util.Vector lserveis;

		/**
		 * Constructor amb sis paràmetres que inicialitzen les propietats de Client
		 *
		 * @param nm  Nom del client.
		 * @param cog  Cognoms del client.
		 * @param dni  DNI del client
		 * @param adre  Adreça del client.
		 * @param tel  Telèfon del client.
		 * @param pob  Població del client
    	 **/
    	 public Client(String nm, String cog, String dni, String adre, String pob, String tel)
		{
			nom=nm;
			cognoms=cog;
			DNI=dni;
			adresa=adre;
			telefon=tel;
			poblacio=pob;
			lserveis=new java.util.Vector();
		}

		/** Accessor de lectura del nom del client
		@return  Retorna el nom del client **/
		public String getNom()
		{
			return nom;
		}

		/** Accessor de lectura dels cognoms del client
		@return  Retorna els cognoms del client **/
		public String getCognoms()
		{
			return cognoms;
		}

		/** Accessor de lectura del DNI del client
		@return  Retorna el DNI del client **/
		public String getDNI()
		{
			return DNI;
		}

		/** Accessor de lectura de l'adreça del client
		@return  Retorna l'adreça del client **/
		public String getAdresa()
		{
			return adresa;
		}

		/** Accessor de lectura del telèfon del client
		@return  Retorna el telèfon del client **/
		public String getTelefon()
		{
			return telefon;
		}

		/** Accessor de lectura de la població del client
		@return  Retorna la població del client **/
		public String getPoblacio()
		{
			return poblacio;
		}

		/** Accessor de lectura de la llista de serveis
		@return  Retorna la llista de serveis del client **/
		private Vector getLserveis()
		{
			return lserveis;
		}

		/** Accessor d'escriptura del nom del client **/
		public void setNom(String n)
		{
			nom=n;
		}

		/** Accessor d'escriptura dels cognoms del client**/
		public void setCognoms(String c)
		{
			cognoms=c;
		}

		/** Accessor d'escriptura del DNI del client **/
		public void setDNI(String d)
		{
			DNI=d;
		}

		/** Accessor d'escriptura de l'adreça del client **/
		public void setAdresa(String a)
		{
			adresa=a;
		}

		/** Accessor d'escriptura del telèfon del client **/
		public void setTelefon(String t)
		{
			telefon=t;
		}

		/** Accessor d'escriptura de la població del client **/
		public void setPoblacio(String p)
		{
			poblacio=p;
		}


		/** Comprova si el sistema es va vendre al client
		*@param codisis  Codi del sistema a buscar
		*@return cert si el sistema es va vendre al client; fals altrament**/
		private boolean comprovarVenda(SistemaSeguretat sist)
		{
			Servei ser;
			boolean trobat=false;
			java.util.Iterator i=getLserveis().iterator();

			while ( (!trobat) && (i.hasNext()) )
			{
				ser=(Servei)i.next();
				if ((ser instanceof Venda) && (ser.getSistema().equals(sist)))
					trobat=true;
			}
			return trobat;
		}

		/** Comprova si el codi de servei està repetit dins de la
		* llista de serveis del client
		*@param ser  servei
		*@return cert si el servei està repetit; fals altrament**/
		private boolean existeixServei(Servei ser)
		{
			int i = getLserveis().indexOf(ser);
			return (i>=0);
		}

		/** Afegeix un servei a la llista de serveis del client
		 Cal comprovar que el servei no estigui repetit
		 En el cas d'una reparació, cal comprovar abans que el sistema
		 a reparar hagi estat venut abans al mateix client.
		 @param s  Servei a afegir
		**/
		public void afegirServei(Servei s)
		{
			if (!existeixServei(s))
			{
				if (s instanceof Reparacio)
				{
				   	if (comprovarVenda(s.getSistema()))
				   		lserveis.add(s);
				   	else
				   	{
						System.out.println("ERROR en afegir el servei "+s.getCodi() + " al client " + getDNI());
				   		System.out.println("No es pot reparar un sistema de seguretat que no ha estat venut abans\n");
					}
				}
				else
					lserveis.add(s);
			}
			else
			{
				System.out.println("El numero de servei "+s.getCodi()+" no pot estar repetit dins del client " +getDNI() + "\n");
			}
		}

		/** Mètode que comprova si dos clients són iguals.
		* Redefineix el mètode equals de la classe Object

		* @param cli un altre objecte de la classe Client
    	* @return  cert, si ambdós clients tenen el mateix DNI i són no nul;
    	           fals, altrament
    	**/
   		public boolean equals(Object cli)
		{
			/* Comprovem que el paràmetre i el DNI del client no siguin null */
			if ( (cli == null) || (getDNI() == null) )  return  false;

			/* Comprovem que el paràmetre sigui una instància de Client */
			if ( ! (cli instanceof Client) )  return  false;

      		/* Comprovem que els DNI's són iguals */

      		return  getDNI().equals( ((Client)cli).getDNI() );
		}

		/** Redefinició del mètode toString de la classe Object
		* @return  Retorna un string amb tota la informació del client **/
		public String toString()
		{
			String s;
			Servei ser;

			s="Nom: "+getNom()+"\nCognoms: "+getCognoms()+"\nDNI: "+getDNI()+"\nAdresa: "+getAdresa()+"\nTelefon: "+getTelefon()+"\nPoblacio: "+getPoblacio()+"\n";
			s=s+"\nSERVEIS REALITZATS AL CLIENT\n\n";
			s=s+"SERVEI\t\t\tSISTEMA\tDATA     \tPREU\n";
			s=s+"-------------------------------------------------------------------------------------------------\n";
			for (java.util.Iterator i=getLserveis().iterator(); i.hasNext();)
				s=s+i.next().toString()+"\n";
			return s;
		}
}
