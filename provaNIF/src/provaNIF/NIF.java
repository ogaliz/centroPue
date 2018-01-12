package provaNIF;

import java.io.*;

public class NIF extends DNI {
	private char nif;
	private static String num_nif;

	public NIF() {
		num_nif = new String("TRWAGMYFPDXBNJZSQVHLCKET");
	}

	/**
	 * Calcula la lletra corresponent al DNI guardat, i modifica l'atribut lletra
	 * convenientment.
	 */
	public void calcularLletra() {
		Integer i = new Integer(getDNI());
		int valor = (i.intValue() / 23);
		int valor2 = valor * 23;
		int valor3 = i.intValue() - valor2;
		nif = num_nif.charAt(valor3);
	}

	/**
	 * Redefinici� del m�tode de forma que cada cop que es modifiqui el valor del
	 * DNI es calculi de manera autom�tica la lletra del NIF.
	 * 
	 * @param valor
	 *            del nou dni
	 * 
	 */
	public void setDNI(String dni) {
		super.setDNI(dni);
		calcularLletra();
	}

	public char getNIF() {
		return nif;
	}

	/**
	 * M�tode que retorna la representaci� en forma de string del NIF. En aquest
	 * cas, la representaci� en forma de string coincideix amb l'atribut DNI+NIF.
	 * 
	 * @return a string NIF
	 */
	public String toString() {
		return ("" + getDNI() + "" + getNIF());
	}

	/**
	 * M�tode que es correspon al punt d'entrada per a l'execuci� d'un programa
	 * Java. En aquest cas el m�tode llegeix de l'entrada est�ndard una cadena de
	 * car�cters, crea un NIF amb aquesta cadena com a DNI, i escriu la
	 * representaci� del NIF per la sortida est�ndard.
	 */

	public static void main(String[] args) throws Exception {
		NIF n = new NIF();
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		System.out.print("Introdueix el dni (enter per acabar): ");
		s = in.readLine();
		while (s.length() > 0) {
			n.setDNI(s);
			System.out.println("El nif es: " + n.toString());
			System.out.print("Introdueix el dni (enter per acabar): ");
			s = in.readLine();
		}

	}//cierre del main 

}
