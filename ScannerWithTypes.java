/* objectif: utiliser la classe Scanner avec plusieurs types
 * auteur: Chancerel Codjovi
 * date: 13.05.2021
 *
 */

import java.util.Scanner;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScannerWithTypes {

	public static void main(String[] args) {
		byte byteLu;
		short shortLu;
		int intLu;
		long longLu;
		float floatLu;
		double doubleLu;
		char charLu;
		String motLu;
		String phraseLue;

		Scanner lectureClavier = new Scanner(System.in);
		lectureClavier.useLocale(Locale.US);

		System.out.print("Entrez un byte: ");
		byteLu = lectureClavier.nextByte();
		System.out.print("Entrez un short: ");
		shortLu = lectureClavier.nextShort();
		System.out.print("Entrez un int: ");
		intLu = lectureClavier.nextInt();
		System.out.print("Entrez un float: ");
		floatLu = lectureClavier.nextFloat();
		System.out.print("Entrez un double: ");
		doubleLu = lectureClavier.nextDouble();
		System.out.print("Entrez un mot: ");
		motLu = lectureClavier.next();
		lectureClavier.nextLine();
		System.out.print("Entrez une phrase: ");
		phraseLue = lectureClavier.nextLine();
		//lectureClavier.nextLine();
		System.out.print("Entrez un char: ");
		charLu = lectureClavier.next().charAt(0);

		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrez une phrase: ");
		try {

			String phraseEntree = clavier.readLine();
			System.out.println("Phrase lue: " + phraseEntree);
		} catch(IOException e) {
			System.out.println("Erreur dans la lecture de la phrase !");
		}
	}

}
