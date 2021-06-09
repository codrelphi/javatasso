/* objectif: pour utiliser la classe CercleControle
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 09.06.2021
 *
 */

import java.util.Scanner;

public class FaireDesCerclesControles {

	public static void main (String[] args) {
		
		Scanner lectureClavier = new Scanner(System.in);
		CercleControle A = new CercleControle();
		A.creer();
		A.afficher();
		System.out.print(" Entrez une valeur d'agrandissement : ");
		int plus = lectureClavier.nextInt();
		A.agrandir(plus);
		System.out.println("Après agrandissement : ");
		A.afficher();
	}

}
