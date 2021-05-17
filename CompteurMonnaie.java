/* objectif: simuler un compteur de monnaie. café à la clée
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 17.05.2021
 *
 */

import java.util.Scanner;


public class CompteurMonnaie {

	public static void main (String[] args) {
		int piece, nbPiece5C = 0, nbPiece10C = 0, nbPiece20C = 0, nbTotalPiece = 0;

		Scanner lectureClavier = new Scanner(System.in);

		System.out.println("J'accepte pièces de 5, 10 et 20 cents !");
		System.out.println("Je rends la monnaie.");
		do {
			System.out.println("_____________________________________________");
			System.out.print("Valeur de la pièce entrée: ");
			piece = lectureClavier.nextInt();
			switch (piece) {
				case 5:
					nbPiece5C += 1;
					break;
				case 10:
					nbPiece10C += 1;
					break;
				case 20:
					nbPiece20C += 1;
					break;
				default:
					piece = 0;
					System.out.println("Pièce impossible !");
			}
			
			nbTotalPiece += piece;
			System.out.println("Vous avez entré: ");
			System.out.println("   " + nbPiece5C + " pièce(s) de 5 cents");
			System.out.println("   " + nbPiece10C + " pièce(s) de 10 cents");
			System.out.println("   " + nbPiece20C + " pièce(s) de 20 cents");
			System.out.println("Soit au total : " + nbTotalPiece + " cents");

		} while (nbTotalPiece < 45);

		System.out.println("Je vous verse 1 café");
		System.out.println("et vous rends : " + (nbTotalPiece - 45) + " cents");

	}

}
