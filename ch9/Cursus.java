/* objectif: représenter la classe Cursus
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 26.06.2021
 *
 */

import java.util.Scanner;

public class Cursus {

	private Etudiant [] liste;

	public Cursus() {
		var lectureClavier = new Scanner(System.in);
		System.out.print("Nombre d'étudiants : ");
		var nbEtudiants = lectureClavier.nextInt();
		liste = new Etudiant[nbEtudiants];
		for (var i = 0; i < liste.length; i++) liste[i] = new Etudiant();

	}

	public void afficherLesEtudiants() {
		for (var e : liste) e.afficherUnEtudiant();
	}

	public void classerParMoyenne() {
		// classer les étudiants en fonction de leur moyenne, ordre: ASC
	}


}
