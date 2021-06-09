/* objectif: contôler l'accès aux données
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 09.06.2021
 *
 */

import java.util.Scanner;

public class CercleControle {

	public static void main (String[] args) {
		private int x, y, r; // position du centre et rayon

		public void creer() {
			Scanner lectureClavier = new Scanner(System.in);
			System.out.print(" Position en x : ");
			x = lectureClavier.nextInt();
			System.out.print(" Position en y : ");
			y = lectureClavier.nextInt();
			do {
				System.out.print(" Rayon              :");
				r = lectureClavier.nextInt();
			} while (r<0 || r>600);
		}

		public void afficher() { //Affichage des données de la classe
			System.out.println(" Centre en " + x + ", " + y);
			System.out.println(" Rayon : " + r);
		}

		public void agrandir(int nr) {
			if (r + nr < 0) r = 0;
			else if (r + nr > 600) r = 600;
			else r += nr;
		}

	}
}
