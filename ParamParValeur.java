/* objectif: simuler le passage de paramètre par valeur
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 29.05.2021
 *
 */


public class ParamParValeur {

	public static void main (String[] args) {
		int valeur = 8;

		System.out.println("Valeur = " + valeur + " avant doubler() ");
		doubler(valeur);
		System.out.println("Valeur = " + valeur + " après doubler() ");

	}

	public static void doubler(int valeur) {
		System.out.println("Valeur = " + valeur + " dans doubler() (avant) ");
		valeur = 2 * valeur;
		System.out.println("Valeur = " + valeur + " dans doubler() ");
	}
}
