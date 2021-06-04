/* objectif: utiliser la classe CerclePrive
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 04.06.2021
 *
 */

import java.util.Scanner;

public class FaireDesCerclesPrives {

	public static void main (String[] args) {
		
		Scanner lectureClavier = new Scanner(System.in);
		CerclePrive A = new CerclePrive();
		A.afficher();
		System.out.println(" Entrez le rayon : " + A);
		A.r = lectureClavier.nextInt();
		System.out.println(" Le cercle est de rayon : " + A.r);
		

	}
}
