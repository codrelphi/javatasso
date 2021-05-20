/* objectif: déterminer le code point (code unicode) d'un caractère
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 20.05.2021
 *
 */

import java.util.Scanner;

public class QuelUnicode {

	public static void main (String[] args) {
		
		int i;
		char leChar, aChercher;
		Scanner lectureClavier = new Scanner(System.in);

		System.out.print("Entrez le caractère: ");
		leChar = lectureClavier.next().charAt(0);
		for (i=0; i<=127; i++) {
			aChercher = (char) i;
			if (leChar == aChercher) {
				System.out.println("Le code unicode de " + leChar);
				System.out.println("est \\u00" + Integer.toString(i, 16));
			}
		}
	}
}
