/* objectif: simuler une machine à café
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 17.05.2021
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class MachineACafe {

	public static void main (String[] args) {
		
		byte piece = 0, totalPieces = 0;
		byte pieceDe5 = 0, pieceDe10 = 0, pieceDe20 = 0;
		Scanner lectureClavier = new Scanner(System.in);

		do {
			System.out.println("Prix du café: 45 cents");
			System.out.println("Pièces acceptées: 5, 10 et 20 cents");
			System.out.println("Votre solde: " + totalPieces);
			System.out.print("Entrez une pièce: ");
			piece = lectureClavier.nextByte();
			switch (piece) {
				case 5: 
					pieceDe5 += 1;
					break;
				case 10:
					pieceDe10 += 1;
					break;
				case 20:
					pieceDe20 += 1;
					break;
				default:
					piece = 0;
					System.out.println("Erreur: Je n'accepte que les pièces de 5, 10 et 20 cents.");
			}

			totalPieces += piece;

			System.out.println("Vous avez engagé " + totalPieces + " cents dont");
			System.out.println("     " + pieceDe5 + " pièces de 5");
			System.out.println("     " + pieceDe10 + " pièces de 10");
			System.out.println("     " + pieceDe20 + " pièces de 20");
			System.out.println("---------------------------------------------");
		
		} while (totalPieces < 45);

		if (totalPieces >= 45) {
			System.out.println("Bien. Prenez votre café !");
			System.out.println("Monnaies rendues: " + (totalPieces - 45) + " cents !");
		}

	}

}
