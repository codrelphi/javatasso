/* objectif: programme utilisation la fonction perimetre
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 21.05.2021
 * update: 25.05.2021
 *
 */

import java.util.Scanner;
import java.util.Locale;

public class FonctionPerimetre {

	public static void main (String[] args) {
		
		float rayon, perimetre;
		Scanner lectureClavier = new Scanner(System.in);
		lectureClavier.useLocale(Locale.ENGLISH);

		System.out.print("Valeur du rayon: ");
		rayon = lectureClavier.nextFloat();
		perimetre = FonctionPerimetre.perimetre(rayon);

		System.out.println("Le périmètre du cercle de rayon " + rayon + " est: " + perimetre);

	}

	public static float perimetre(float rayon) {
		return 2 * (float) Math.PI * rayon;
	}
}
