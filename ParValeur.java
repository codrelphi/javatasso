/* objectif: simuler le passage de paramètre par valeur
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 28.05.2021
 *
 */


public class ParValeur {

	public static void main (String[] args) {
		
		int valeur = 2;
		System.out.println("Valeur = " + valeur + " avant tripler() ");
		tripler(valeur);
		System.out.println("Valeur = " + valeur + " après tripler() ");
	}

	public static void tripler(int valeur) {
		System.out.println("Valeur = " + valeur + " dans tripler() ");
		valeur = 3 * valeur;
		System.out.println("Valeur = " + valeur + " dans tripler() ");
	}

}
