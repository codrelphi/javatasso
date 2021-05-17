/* objectif: calculer la surface d'un rectangle. surface = longueur * largeur
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 11.05.2021
 *
 */

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		double longueur, largeur, surface;

		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Valeur de la longueur: ");
		longueur = lectureClavier.nextDouble();
		System.out.print("Valeur de la largeur: ");
		largeur = lectureClavier.nextDouble();
		surface = longueur * largeur;
		System.out.println("La surface de longueur " + longueur + " et de largeur " + largeur + " est: " + surface);
	}
}
