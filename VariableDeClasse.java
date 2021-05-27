/* objectif: tester l'utilité de la variable de classe
 * auteur: Chancerel Codjovi
 * date: 27.05.2021
 *
 */



public class VariableDeClasse {

	static byte valeur;

	public static void main (String[] args) {
		valeur = 2;
		System.out.println("valeur = " + valeur + " avant modifier()");
		modifier();
		System.out.println("valeur = " + valeur + " après modifier()");

	}

	static void modifier() {
		valeur = 3;
		System.out.println("valeur = " + valeur + " dans modifier()");
	}
}
