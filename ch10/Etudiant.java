/* objectif: représenter un objet Etudiant
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 25.06.2021
 * update: 02.07.2021
 *
 */

import java.util.Scanner;


public class Etudiant {

	private String nom, prenom;
	private double [] notes;
	private double moyenne;

	public Etudiant() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez le nom : ");
		nom = lectureClavier.next();
		System.out.print("Entrez le prénom : ");
		prenom = lectureClavier.next();
		System.out.print(" Combien de notes pour l'étudiant ");
		System.out.print(prenom + " " + nom + " : ");
		var nombre = lectureClavier.nextByte();
		notes = new double[nombre];
		for (var i = 0; i < notes.length; i++) {
			System.out.print(" Entrez la note n°" + (i+1) + " : ");
			notes[i] = lectureClavier.nextInt();
		}
		moyenne = calculMoyenne();
	}

	public double calculMoyenne() {
		double somme = 0.0;
		for (double note : notes) somme += note;
		return somme / notes.length;
	}

	// équivalent de quelleMoyenne() {...}
	public double getMoyenne() {
		return moyenne;
	}

	public void afficherUnEtudiant() {

		System.out.print(" Les notes de " + prenom + " " + nom + " sont : ");
		for (var note : notes) 
			System.out.print(" " + note);
		System.out.println();
		System.out.println(" sa moyenne vaut : " + this.moyenne);

	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}


}
