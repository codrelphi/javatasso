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
	
	private int ouEstLePlusPetit(int debut) {

		int indiceDuMin = debut;
		for (var j = debut+1; j < liste.length; j++) {
			if (liste[j].getMoyenne() < liste[indiceDuMin].getMoyenne()){
				indiceDuMin = j;
			}
		}

		return indiceDuMin;
	}

	public void classerParMoyenne() {
		// classer les étudiants en fonction de leur moyenne, ordre: ASC
		int indiceDuPlusPetit;
		Etudiant tmp;
		for (var i = 0; i < liste.length; i++) {
			indiceDuPlusPetit = ouEstLePlusPetit(i);
			tmp = liste[i];
			liste[i] = liste[indiceDuPlusPetit];
			liste[indiceDuPlusPetit] = tmp;
		}
	}


}
