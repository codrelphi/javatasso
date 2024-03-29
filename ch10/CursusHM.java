/* objectif: implémenter le Cursus en utilisant un HashMap
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.07.2021
 *
 */


import java.util.HashMap;
import java.util.Collection;
//import java.util.Iterator;


public class CursusHM {

	private HashMap<String, Etudiant> listeClassee;

	public CursusHM() {
		listeClassee = new HashMap<String, Etudiant>();
	}

	private String creerUneClee(Etudiant e) {
		var tmp = e.getPrenom().charAt(0) + e.getNom();
		return tmp.toUpperCase();
	}

	private String creerUneClee(String prenom, String nom) {
		var tmp = prenom.charAt(0) + nom;
		return tmp.toUpperCase();
	}

	public void ajouterUnEtudiant() {
		var nouveau = new Etudiant();
		var clee = creerUneClee(nouveau);

		if (listeClassee.get(clee) == null)
			listeClassee.put(clee, nouveau);
		else 
			System.out.println("Cet étudiant a déja été saisi !");
	}

	public void rechercherUnEtudiant(String p, String n) {

		var clee = creerUneClee(p, n);
		var tmpEtudiant = listeClassee.get(clee);

		if (tmpEtudiant != null) 
			tmpEtudiant.afficherUnEtudiant();
		else
			System.out.println(p + " " + n + " est inconnu !");

	}

	public void supprimerUnEtudiant(String p, String n) {

		var clee = creerUneClee(p, n);
		var tmpEtudiant = listeClassee.get(clee);
		if (tmpEtudiant != null) {
			listeClassee.remove(clee);
			System.out.println(p + " " + n + " a été bien supprimé !");
		}
		else 
			System.out.println(p + " " + n + " est inconnu !");
	}

	public void afficherLesEtudiants() {

		if (listeClassee.size() != 0) {

			Collection<Etudiant> c = listeClassee.values();
			/* Parcours en utilisant un Iterator
			 * for (Iterator i = c.iterator(); i.hasNext();) {
				Etudiant e = i.next();
				e.afficherUnEtudiant();
			}
			*/

			for (var i : c) 
				i.afficherUnEtudiant();
		}
		else 
			System.out.println("Il n'y a pas d'étudiants dans cette liste !");
	}

}
