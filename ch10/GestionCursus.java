/* objectif: gérer le cursus 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 21.06.2021
 *
 */

import java.util.Scanner;

public class GestionCursus {

	public static void main(String [] args) {
		
		byte choix;
		Scanner lectureClavier = new Scanner(System.in);
		Cursus c = new Cursus();

		do {
			System.out.println("1. Ajoute un étudiant");
			System.out.println("2. Affiche la liste des élèves");
			System.out.println("3. Pour sortir");
			System.out.print("Votre choix : ");
			choix = lectureClavier.nextByte();
			switch (choix) {
				case 1:
					c.ajouterUnEtudiant();
					break;
				case 2:
					c.afficherLesEtudiants();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Cette option n'existe pas !");
			}
		} while(choix != 3);

	}

}
