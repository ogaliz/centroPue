import java.io.*;
import java.util.Iterator;
class fase4
{
	public void carregarClients(Principal p, String nomf)
	{
		Client cl;
		BufferedReader in;
		String n,c,d,cr,po,t;
      	try
      	{
			in = new BufferedReader( new FileReader(nomf) );
			while ( (n = in.readLine()) != null )
			{
				if (!n.equals(""))
				{
					c = in.readLine();
					d = in.readLine();
					cr = in.readLine();
					po = in.readLine();
					t = in.readLine();
					cl=new Client(n,c,d,cr,po,t);
					p.afegirClient(cl);
				}
			}
			in.close();
		}
		catch(IOException ex)
		{
		     System.err.println("Problema amb el fitxer " + nomf);
		     System.exit(1);
      	}
	}

	public void carregarSistemes(Principal p, String nomf)
	{
		SistemaSeguretat ss;
		BufferedReader in;
		String co,pr;
		double preu;
      	try
      	{
			in = new BufferedReader( new FileReader(nomf) );
			while ( (co = in.readLine()) != null )
			{
				if (!co.equals(""))
				{
					pr = in.readLine();
					preu=new Double(pr).doubleValue();
					ss=new SistemaSeguretat(co,preu);
					p.afegirSistema(ss);
				}
			}
			in.close();
		}
		catch(IOException ex)
		{
		     System.err.println("Problema amb el fitxer " + nomf);
		     System.exit(1);
      	}
	}
	public void carregarServeis(Principal p, String nomf)
	{
		BufferedReader in;
		String codiser, dni, data, tipusser, sist, smin, codisen;
		int minuts;
		SistemaSeguretat ssg;
		try
		{
			in = new BufferedReader( new FileReader(nomf) );
			while ( ( codiser = in.readLine()) != null )
			{
				if (!codiser.equals(""))
				{
					dni = in.readLine();
					tipusser = in.readLine();
					data=in.readLine();
					sist=in.readLine();
					ssg=p.buscarSistema(sist);
					if (ssg==null)
					{
						ssg=new SistemaSeguretat(sist,0);
					}
					if (tipusser.equals("VENDA"))
					{
						Venda v=new Venda(codiser, data, ssg);
						p.assignarServei(v, dni);
					}
					else /* Es tracta d'una reparació */
					{
						smin=in.readLine();
						minuts=new Integer(smin).intValue();
						Reparacio r=new Reparacio(codiser, data, ssg, minuts);
						codisen=in.readLine();
						while (!codisen.equals(""))
						{
							p.repararSensor(r, codisen);
							codisen=in.readLine();
						}
						p.assignarServei(r,dni);
					}
				}
			}
		}
		catch(IOException ex)
		{
		     System.err.println("Problema amb el fitxer " + nomf);
		     System.exit(1);
      	}
	}


	public void carregarSensors(Principal p, String nomf)
	{
		BufferedReader in;
		String codisen, tipussen, stempe, spreu, sradi, sist;
		double preu, radi;
		int tempe;
		try
		{
			in = new BufferedReader( new FileReader(nomf) );
			while ( ( codisen = in.readLine()) != null )
			{
				if (!codisen.equals(""))
				{
					tipussen = in.readLine();
					spreu=in.readLine();
					preu=new Double(spreu).doubleValue();
					if (tipussen.equals("TACTIL"))
					{
						Tactil stactil=new Tactil(codisen, preu);
						p.afegirSensor(stactil);
					}
					else
					{
						if (tipussen.equals("HIBRID"))
						{
							stempe=in.readLine();
							sradi=in.readLine();
							tempe=new Integer(stempe).intValue();
							radi=new Double(sradi).doubleValue();
							Hibrid shibrid=new Hibrid(codisen, preu, tempe, radi);
							p.afegirSensor(shibrid);
						}
						else
						{
							if (tipussen.equals("VOLUMETRIC"))
							{
								sradi=in.readLine();
								radi=new Double(sradi).doubleValue();
								Volumetric svolum=new Volumetric(codisen, preu, radi);
								p.afegirSensor(svolum);
							}
							else
							{
								stempe=in.readLine();
								tempe=new Integer(stempe).intValue();
								Infraroig sinfra=new Infraroig(codisen ,preu, tempe);
								p.afegirSensor(sinfra);
							}
						}
					}
					sist=in.readLine();
					if (!sist.equals("null"))
						p.assignarSensor(sist, codisen);
				}
			}
		}
		catch(IOException ex)
		{
		     System.err.println("Problema amb el fitxer " + nomf);
		     System.exit(1);
	   	}
	}


	public static void main(String[] args) throws Exception
	{
		Principal p;
		fase4 f;
		f=new fase4();
		p=new Principal();
		f.carregarClients(p, "clients.txt");
		f.carregarSistemes(p, "sistemes.txt");
		f.carregarSensors(p, "sensors.txt");
		f.carregarServeis(p, "serveis.txt");
		p.llistarClients();
	}
}