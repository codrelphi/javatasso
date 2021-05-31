/* objectif: pour garder le résultat de la modification du contenu d'une variable en sortie de fonction
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 31.05.2021
 *
 */


public class Resultat {

	public static void main (String[] args) {
		int valeur = 2;
		System.out.println("Valeur = " + valeur + " avant tripler() ");
		valeur = tripler(valeur);
		System.out.println("Valeur = " + valeur + " après tripler() ");
	}

	public static int tripler(int v) {
		System.out.println("v = " + v + " dans tripler() ");
		int resultat = 3 * v;
		System.out.println("Resultat = " + resultat + " dans tripler()");
		return resultat;
	}

}
