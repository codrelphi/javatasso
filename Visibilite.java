/* objectif: tester la visibilité des variables
 * auteur: Chancerel Codjovi
 * date: 26.05.2021
 *
 */


public class Visibilite {

	public static void main (String[] args) {	
		int valeur = 2;
		System.out.println("valeur = " + valeur + " avant modifier() ");
		modifier();
		System.out.println("valeur = " + valeur + " après modifier() ");
	}

	public static void modifier() {
		int valeur = 3;
		System.out.println("valeur = " + valeur + " dans modifier() ");
	}
}
