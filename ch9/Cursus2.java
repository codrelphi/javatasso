/* objectif: représenter un cursus (solution initiale)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 25.06.2021
 * update: 26.06.2021
 *
 */

import java.util.Scanner;


public class Cursus2 {

	public static void main(String [] args) {

		Etudiant [] liste;
		int nombre;
		Scanner lectureClavier = new Scanner(System.in);
		do {
			System.out.print("Le nombre d'étudiants : ");
			nombre = lectureClavier.nextInt();
		} while (nombre <= 0);
		liste = new Etudiant[nombre];
		for (var i = 0; i < nombre; i++) {
			liste[i] = new Etudiant();
		}
		System.out.println("---------------- Recapitulatif -----------------");
		for (var etudiant : liste) {
			etudiant.afficherUnEtudiant();
		}
		System.out.println("---------------- Classement --------------------");
		for (int i = 0; i < liste.length; i++) {
			for (int j = i+1; j < liste.length; j++) {
				if (liste[i].getMoyenne() > liste[j].getMoyenne()) {
					var tmp = liste[i];
					liste[i] = liste[j];
					liste[j] = tmp;
				}
			}
		}

		Cursus.afficherLesEtudiants(liste);

	}

	public static void afficherLesEtudiants(Etudiant [] liste) {
		for (var e : liste) {
			e.afficherUnEtudiant();
		}
	}

}
