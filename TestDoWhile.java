/* objectif: tester la boucle do...while
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 17.05.2021
 *
 */

import java.util.Scanner;

public class TestDoWhile {

	public static void main (String[] args) {

		byte compteur;
		Scanner lectureClavier = new Scanner(System.in);

		System.out.print("Valeur du compteur: ");
		compteur = lectureClavier.nextByte();

		do {
			System.out.println("Ooh: " + compteur);
			compteur--;
		} while (compteur >= 0);
	}
}

