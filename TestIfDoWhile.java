/* objectif: tester certaines caractéristiques de if...else et de do...while
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 15.05.2021
 *
 */


public class TestIfDoWhile {

	public static void main (String[] args) {
		
		byte compteur = 100;
		while (compteur >= 0) {
			--compteur;
			if (compteur < 0) break;
			if (compteur % 2 == 0) continue;
			else System.out.println("Yes - " + compteur);
		}
		if (compteur < 0) System.out.println("Arrêt: compteur est inférieur à zéro !");
	}
}
