/* objectif: lire un entier sans utiliser la classe Scanner
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 17.05.2021
 *
 */

import java.io.IOException;

public class LireUnEntier {

	public static void main (String[] args) throws IOException {

		int valeurLue = 0;
		char charLu = '\0'; //le caractère null
		String temp = "";

		System.out.print("Entrez la valeur: ");
		while (charLu != '\n') {
			charLu = (char) System.in.read();
			if (charLu != '\n' && charLu != '\r') temp = temp + charLu;
		}
		valeurLue = Integer.parseInt(temp);
		System.out.println("La valeur entrée est: " + valeurLue);
	}
}
