/* objectif: pour gérer le cursus en se basant sur la généricité
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 02.07.2021
 *
 */

import java.util.Scanner;

public class GestionCursusHM {

	public static void main(String [] args) {

		byte choix = 0;
		CursusHM chm = new CursusHM();
		String prenom, nom;
		Scanner lectureClavier = new Scanner(System.in);

		do {
			System.out.println("1. Ajoute un etudiant");
			System.out.println("2. Supprime un etudiant");
			System.out.println("3. Affiche la liste des etudiants");
			System.out.println("4. Affiche un etudiant");
			System.out.println("5. Sortir");
			System.out.println();
			System.out.print("Votre choix : ");
			choix = lectureClavier.nextByte();
			System.out.println();
			switch (choix) {
				case 1:
					chm.ajouterUnEtudiant();
					break;
				case 2:
					System.out.print(" Prénom de l'étudiant : ");
					prenom = lectureClavier.next();
					System.out.print(" Nom de l'étudiant : ");
					nom = lectureClavier.next();
					chm.supprimerUnEtudiant(prenom, nom);
					break;
				case 3:
					chm.afficherLesEtudiants();
					break;
				case 4:
					System.out.print(" Prénom de l'étudiant : ");
					prenom = lectureClavier.next();
					System.out.print(" Nom de l'étudiant : ");
					nom = lectureClavier.next();
					chm.rechercherUnEtudiant(prenom, nom);
					break;
				case 5: 
					System.exit(0);
					break;
				default: System.out.println("Cette option n'existe pas !");

			}
			System.out.println();

		} while (choix != 5);

	}

}
