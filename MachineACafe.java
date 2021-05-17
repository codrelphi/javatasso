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
			System.out.print("Entrez une pièce: ");
			try {
				piece = lectureClavier.nextByte();
			} catch (InputMismatchException ime) {
				System.out.println("\nErreur: la valeur entrée n'est pas juste !");
				System.out.println("seules les pièces 5, 10 et 20 cents sont acceptées !");
				System.out.println("Entrez une pièce: ");
				piece = lectureClavier.nextByte();
			}
			if (piece != 5 && piece != 10 && piece != 20) {
				System.out.println("Je n'accepte que les pièces de 5, 10 et 20 cents.");
			}
			else {
				totalPieces += piece;
				if (piece == 5) pieceDe5 += 1;
				if (piece == 10) pieceDe10 += 1;
				if (piece == 20) pieceDe20 += 1;
				System.out.println("Vous avez engagé " + totalPieces + " cents dont");
				System.out.println("     " + pieceDe5 + " pièces de 5");
				System.out.println("     " + pieceDe10 + " pièces de 10");
				System.out.println("     " + pieceDe20 + " pièces de 20");
			}
			System.out.println("---------------------------------------------");
		} while (totalPieces < 45);

		if (totalPieces >= 45) {
			System.out.println("Bien. Prenez votre café !");
			System.out.println("Monnaies rendues: " + (totalPieces - 45) + " cents !");
		}

	}

}
