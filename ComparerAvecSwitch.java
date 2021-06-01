/* objectif: utiliser switch dans la comparaison
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.06.2021
 *
 */


import java.util.Scanner;


public class ComparerAvecSwitch {

	public static void main (String[] args) {

		String quelleCouleur = "";
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Quelle couleur choisissez-vous (rouge, vert, orange, bleu, violet, jaune) ? : ");
		quelleCouleur = lectureClavier.nextLine();
		switch (quelleCouleur) {
			case "vert" : 
				System.out.println("Vous devez mélanger du bleu avec du jaune ");
				break;
			case "violet" : 
				System.out.println("Vous devez mélanger du bleu avec du rouge ");
				break;
			case "orange" :
				System.out.println("Vous devez mélanger du rouge avec du jaune ");
				break;
			default:
				System.out.println("C'est une couleur primaire !");
		}

	}
}
