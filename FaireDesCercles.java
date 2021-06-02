/* objectif: utiliser l'objet Cercle pour faire des cercles
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 02.06.2021
 *
 */

import java.util.Scanner;

public class FaireDesCercles {

	public static void main (String[] args) {
		
		Cercle A = new Cercle();
		Scanner lectureClavier = new Scanner(System.in);
		A.afficher();
		System.out.print(" Entrez la positin en x : ");
		A.x = lectureClavier.nextInt();
		System.out.print(" Entrez la position en y : ");
		A.y = lectureClavier.nextInt();
		System.out.print(" Entrez le rayon : ");
		A.r = lectureClavier.nextInt();
		A.afficher();

		double p = A.perimetre();
		System.out.println(" Votre cercle a pour périmètre : " + p);
		A.deplacer(5, 2);
		System.out.println(" Après déplacement : ");
		A.afficher();
		A.agrandir(10);
		System.out.println(" Après agrandissement : ");
		A.afficher();

	}

}
