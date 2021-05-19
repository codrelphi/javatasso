/* objectif: simuler une table de multiplication 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 19.05.2021
 *
 */


import java.util.Scanner;


public class TableDeMultiplication {

	public static void main (String[] args) {
		
		byte chiffre;
		Scanner lectureClavier = new Scanner(System.in);

		do {
			System.out.print("Entrez le chiffre: ");
			chiffre = lectureClavier.nextByte();
			if (chiffre <0 || chiffre > 127) System.out.println("Erreur: Chiffre incorrect !");
		} while (chiffre < 0 || chiffre > 127);
		System.out.println("Voici la table de multiplication de " + chiffre);
		for (byte i=1; i<=12; i++) {
			System.out.println(chiffre + " x " + i + " = " + (chiffre * i));
		}

	}
}
