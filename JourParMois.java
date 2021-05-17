/* objectif: déterminer le nombre de jour par mois
 * auteur: Chancerel Codjovi
 * date: 14.05.2021
 *
 */

import java.util.Scanner;


public class JourParMois {

	public static void main (String[] args) {
		
		byte mois, nbJours = 0;
		short annee;
		Scanner lectureClavier = new Scanner(System.in);

		System.out.print("Quel est le mois ?: ");
		mois = lectureClavier.nextByte();
		System.out.print("Quelle est l'année ?: ");
		annee = lectureClavier.nextShort();

		switch (mois) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				nbJours = 31;
				break;
			case 4: case 6: case 9:
			case 11:
				nbJours = 30;
				break;
			case 2:
				if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 ==0) {
					nbJours = 29;
				} else nbJours = 28;
				break;
			default:
				System.out.println("Erreur: Impossible, ce mois n'existe pas !");
				System.exit(0);

		}

		System.out.print("Le mois " + mois + " de l'année " + annee);
		System.out.println(" a " + nbJours + " jours.");

	}
}
