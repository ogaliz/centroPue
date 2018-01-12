import java.util.Vector;
import java.util.Iterator;
/** Classe que controla la llista de clients i la llista de Sistemes de Seguretat **/
public class Principal
{
    /** Llista que contindrà els clients **/
	private java.util.Vector lclients;

	/** Llista que contindrà els sistemes de seguretat **/
	private java.util.Vector lsistemes;

	/** Llista que contindrà els sensors **/
	private java.util.Vector lsensors;

	public Principal()
	{
		lclients=new java.util.Vector();
		lsistemes=new java.util.Vector();
		lsensors=new java.util.Vector();
	}

	// accessor per accedir a l'atribut lsistemes
	private Vector getLsistemes()
	{
		return lsistemes;
	}

	// accessor per accedir a l'atribut lclients
	private Vector getLclients()
	{
		return lclients;
	}

	// accessor per accedir a l'atribut lsnesors
	private Vector getLsensors()
	{
		return lsensors;
	}

	/** Mètode que busca un client dins de la llista de clients
	*
	* @param cli client a buscar
	* @return null si el client no existeix dins de la llista o si la llista està buida; altrament retorna
			  el client **/
	public Client buscarClient(Client cli)
	{
		int i = getLclients().indexOf(cli);
		if (i>=0) return cli;
		else return null;
	}

	/** Mètode que busca un client dins de la llista de clients donat el DNI
	*
	* @param dni  DNI del client a buscar
	* @return null si el client no existeix dins de la llista o si la llista està buida; altrament retorna
			  el client trobat dins de la llista**/
	public Client buscarClient(String dni)
	{
		java.util.Iterator i;
		Client c=null;
		boolean trobat;
		if (!getLclients().isEmpty())
		{
			i=getLclients().iterator();
			trobat=false;
			while (i.hasNext() && ( !trobat ))
			{
				c=(Client)i.next();
				if (c.getDNI().equals(dni))
					trobat=true;
			}
			if (!trobat)
				c=null;
		}
		return c;
	}

	/** Mètode que afegeix un client a la llista. En cas que ja existeixi un
	* client amb el mateix DNI, no l'afegirà
	* @param c  Client a afegir
	**/

	public void afegirClient(Client c)
	{
		if (buscarClient(c.getDNI())==null)
			lclients.add(c);
		else
		{
			System.out.println("El client amb DNI " + c.getDNI() + " ja existeix. No afegit\n");
		}
	}

	/** Mètode que llista tota la informació dels clients de la llista.
	**/
	public void llistarClients()
	{
		for (java.util.Iterator i=getLclients().iterator(); i.hasNext();)
			System.out.println(i.next().toString());
	}

	/** Mètode que busca un Sistema de Seguretat dins de la llista de Sistema de Seguretats
	*
	* @param sist Sistema de Seguretat a buscar
	* @return null si el Sistema de Seguretat no existeix dins de la llista o si la llista està buida: altrament retorna
			  el Sistema de Seguretat **/
	public SistemaSeguretat buscarSistema(SistemaSeguretat sist)
	{
		int i = getLsistemes().indexOf(sist);
		if (i>=0) return sist;
		else return null;
	}

	/** Mètode que busca un Sistema de Seguretat dins de la llista de Sistema de Seguretats donat el codi
	*
	* @param codi  codi del Sistema de Seguretat a buscar
	* @return null si el Sistema de Seguretat no existeix dins de la llista o si la llista està buida: altrament retorna
			  el Sistema de Seguretat trobat dins de la llista**/
	public SistemaSeguretat buscarSistema(String codi)
	{
		java.util.Iterator i;
		SistemaSeguretat s=null;
		boolean trobat;
		if (!getLsistemes().isEmpty())
		{
			i=lsistemes.iterator();
			trobat=false;
			while (i.hasNext() && ( !trobat ))
			{
				s=(SistemaSeguretat)i.next();
				if (s.getCodi().equals(codi) )
					trobat=true;
			}
			if (!trobat)
				s=null;
		}
		return s;
	}

	/** Mètode que afegeix un Sistema de Seguretat a la llista. En cas que ja existeixi un
	* Sistema de Seguretat amb el mateix codi, no l'afegirà
	* @param s  Sistema de Seguretat a afegir
	**/

	public void afegirSistema(SistemaSeguretat s)
	{
		if (buscarSistema(s)==null)
			lsistemes.add(s);
		else
		{
			System.out.println("El Sistema de Seguretat amb codi " + s.getCodi() + " ja existeix. No afegit\n");
		}
	}

	/** Mètode que llista tota la informació dels Sistemes de Seguretat de la llista.
	**/
	public void llistarSistemes()
	{
		for (java.util.Iterator i=getLsistemes().iterator(); i.hasNext();)
			System.out.println(i.next().toString());
	}


	/** Mètode que busca un sensor dins de la llista de sensors
	*
	* @param sen Sensor a buscar
	* @return null si el Sensor no existeix dins de la llista o si la llista està buida: altrament retorna
			  el Sensor **/
	public Sensor buscarSensor(Sensor sen)
	{
		int i = getLsensors().indexOf(sen);
		if (i>=0) return sen;
		else return null;
	}

	/** Mètode que busca un Sensor dins de la llista de Sensors donat el codi
	*
	* @param codi  codi del Sensor a buscar
	* @return null si el Sensor no existeix dins de la llista o si la llista està buida: altrament retorna
			  el Sistema de Seguretat trobat dins de la llista**/
	public Sensor buscarSensor(String codi)
	{
		java.util.Iterator i;
		Sensor s=null;
		boolean trobat;
		if (!getLsensors().isEmpty())
		{
			i=getLsensors().iterator();
			trobat=false;
			while (i.hasNext() && ( !trobat ))
			{
				s=(Sensor)i.next();
				if (s.getCodi().equals(codi) )
					trobat=true;
			}
			if (!trobat)
				s=null;
		}
		return s;
	}

	/** Mètode que afegeix un Sensor a la llista. En cas que ja existeixi un
	* Sensor amb el mateix codi, no l'afegirà
	* @param s  Sensor a afegir
	**/

	public void afegirSensor(Sensor s)
	{
		if (buscarSensor(s)==null)
			lsensors.add(s);
		else
		{
			System.out.println("El Sensor amb codi " + s.getCodi() + " ja existeix. No afegit\n");
		}
	}

	/** Mètode que llista tota la informació dels Sensors de la llista.
	**/
	public void llistarSensors()
	{
		for (java.util.Iterator i=getLsensors().iterator(); i.hasNext();)
			System.out.println(i.next().toString());
	}


	/** Mètode que mostra un missatge d'error.
	*@param codiser  Codi del servei
	*@param dni  Dni del client
	*@param codisis  Codi del sistema
	*/

	private void mostraError(String codiser, String dni, String codisis)
	{
		System.out.println("ERROR a l'assignar el servei: " + codiser);
		System.out.println("al client: " + dni);
		System.out.println("Sistema: "+codisis);
		System.out.println("Servei no assignat");
	}

	/** Mètode que assigna un servei a un client.
	* Cal garantir que el client i el sistema de seguretat
	* ja existeixen a la base de dades.
	* També cal garantir, en el cas d'una venda, que el sistema de seguretat
	* que es ven no hagi estat venut abans al mateix client o a un altre.
	* En el cas d'una reparació cal que hi hagi sensors a reparar.

	* @param s  servei a assignar
	* @param dni  Dni del client al qual se li vol assignar el servei*/
	public void assignarServei(Servei s, String dni)
	{
		Client c;
		SistemaSeguretat ss;
		String codisis=s.getSistema().getCodi();

		c=buscarClient(dni);
		if (c==null)
		{
			mostraError(s.getCodi(), dni, codisis);
			System.out.println("El client no existeix\n\n");
		}
		else
		{
			ss=buscarSistema(s.getSistema());
			if (ss==null)
			{
				mostraError(s.getCodi(), dni, codisis);
				System.out.println("El sistema no existeix\n\n");
			}
			else
			{
				if (s instanceof Venda)
				{
					if (!ss.jaVenut())
					{
						ss.vendreSistema();
						c.afegirServei(s);
					}
					else
					{
						mostraError(s.getCodi(), dni, codisis);
						System.out.println("El sistema va ser venut anteriorment\n\n");
					}
				}
				else /* Es tracta d'una reparació. Tots els sensors de la reparació han
					estat comprovats i almenys hi ha un sensor*/
				{
					if (((Reparacio)s).hiHaSensors())
						c.afegirServei(s);
				}
			}
		}
	}


	/** Mètode que assigna un sensor a un Sistema de Seguretat
	* Cal garantir que el sensor i el sistema de seguretat
	* ja existeixen a la base de dades.
	* També cal garantir que el sensor no hagi estat assignat
	* a un altre sistema de seguretat.
	*
	* @param codisis  codi del sistema de seguretat.
	* @param codisen  codi del sensor
	**/
	public void assignarSensor(String codisis, String codisen)
	{
		Sensor sens;
		SistemaSeguretat sist;

		sens=buscarSensor(codisen);
		if (sens==null)
		{
			System.out.println("El sensor amb codi " + codisen+" no existeix");
			System.out.println("Sensor no assignat\n");
		}
		else
		{
			sist=buscarSistema(codisis);
			if (sist==null)
			{
				System.out.println("El Sistema de Seguretat amb codi " + codisis +" no existeix");
				System.out.println("Sensor no assignat\n");
			}
			else
			{
				if (sens.getSistema()==null)
				{
					sens.setSistema(codisis);
					sist.afegirSensor(sens);
				}
				else
				{
					System.out.println("El Sensor amb codi " + codisen +" ja esta assignat al sistema "+sens.getSistema());
					System.out.println("Sensor no assignat\n");
				}
			}
		}
	}

	/** Mètode que afegeix la reparació d'un sensor a un servei de tipus reparacio.
	Cal controlar que el sensor que s'assigna existeixi a la base de dades

	@param rep  Reparació on es vol assignar el sensor
	@param codisen  Codi del sensor a reparar **/

	public void repararSensor(Reparacio rep, String codisen)
	{
		Sensor sens;
		sens=buscarSensor(codisen);
		if (sens==null)
		{
			System.out.println("El sensor amb codi " + codisen+" no existeix");
			System.out.println("Sensor no assignat\n");
		}
		else
		{
			rep.repararSensor(sens);
		}
	}
}