/* tester la fonction System.in.read()
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 12.05.2021
 *
 */

import java.io.IOException;

public class SystemInRead {

	public static void main(String[] args) {
		char[] charArray = new char[10];

		System.out.print("Entrez le mot: ");

		try {
			for (int i=0; i<charArray.length; i++) {
				charArray[i] = (char) System.in.read();
			}
		} catch(IOException e) {
			System.out.print("Erreur lors de l'entrée d'un caractère !");
		}
		String mot = "";
		for (char c : charArray) mot += c;
		System.out.println("Vous avez entré: " + mot);
	}
}
