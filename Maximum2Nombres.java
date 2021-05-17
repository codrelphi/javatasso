/* objectif: trouver le maximum de deux nombres
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 13.05.2021
 *
 */

import java.util.Scanner;
import java.util.Locale;


public class Maximum2Nombres {

	public static void main(String[] args) {
		
		float val1, val2;
		Scanner lectureClavier = new Scanner(System.in);
		lectureClavier.useLocale(Locale.US);

		System.out.print("Entrez le 1er nombre: ");
		val1 = lectureClavier.nextFloat();
		System.out.print("Entrez le 2ème nombre: ");
		val2 = lectureClavier.nextFloat();

		if (val1 > val2) System.out.println("Maximum de " + val1 + " et " + val2 + " est: " + val1);
		else if (val1 == val2) System.out.println(val1 + " est égal à " + val2);
		else System.out.println("Maximum de " + val1 + " et " + val2 + " est: " + val2);

	}
}
