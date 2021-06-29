/* objectif: implémenter le Cursus avec un ArrayList
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 29.06.2021
 *
 */


import java.util.ArrayList;


public class Cursus {

	private ArrayList<Etudiant> liste;

	public Cursus() {
		liste = new ArrayList<Etudiant>();
	}

	public void ajouterUnEtudiant() {
		liste.add(new Etudiant());
	}

	public void afficherLesEtudiants() {
		int nbEtudiants = liste.size();

		if (nbEtudiants > 0) {
			Etudiant tmp;
			for (int i = 0; i < nbEtudiants; i++) {
				tmp = liste.get(i);
				tmp.afficherUnEtudiant();
			}
		}
		else { 
			System.out.println("Il n'y a pas d'étudiants dans cette liste!");
		}
	}

}
