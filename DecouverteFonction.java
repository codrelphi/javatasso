/* ojectif: première découverte des fonctions
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 21.05.2021
 *
 */


public class DecouverteFonction {

	public static void main (String[] args) {
	
		int a = 8, b = 16;
		System.out.println(a + " + " + b + " = " + premiereFonction(a, b));
		System.out.println("affichage de " + a + " donne: " + premiereFonction(a, a));
	}
	
	static int premiereFonction(int a, int b) {
		return a + b;
	}

	static String premiereFonction(int b, double a) {
		return "C'est " + b + " hein !";
		//return a;
	}
}
