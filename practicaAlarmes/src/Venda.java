/** Classe derivada de Servei que representa la venda d'un Sistema de
seguretat **/
/** @see  Servei **/
public final class Venda extends Servei
{
	/** Constructor amb tres par�metres
	* @param cd  Codi identificador del servei
	* @param dt  Data del servei
	* @param s  Sistema de seguretat
	**/
	Venda(String cd, String dt, SistemaSeguretat s)
	{
		super(cd, dt, s);
	}

	/** Implementaci� del m�tode abstracte.
	El preu de la venda d'un sistema de seguretat �s el preu
	del sistema de seguretat

	@return  preu d'una venda**/
	public double calcularPreu()
	{
		double p=sistema.getPreu();
		return (p*(1.0+7.0/100.0));
	}

	/** Redefinici� del m�tode toString de la classe Object
		* @return  Retorna un string amb tota la informaci� de la venda **/
	public String toString()
	{
		return("Codi VENDA: " + getCodi() + "\t\t" + sistema.getCodi() + "\t" + getData() + "\t" + this.calcularPreu());
	}
}