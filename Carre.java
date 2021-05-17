/* objectif: calculer le périmètre d'un carré. formule: p = 4 * coté
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 11.05.2021
 *
 */
import java.util.Scanner;

public class Carre {

	public static void main(String[] args) {
		double unCote, lePerimetre;

		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Valeur du coté: ");
		unCote = lectureClavier.nextDouble();
		lePerimetre = 4 * unCote;
		System.out.println("Le périmètre du carré de côté " + unCote + " est: " + lePerimetre);
	}
}
