/* objectif: utilisation de tableau (collection éléments fixe)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 24.06.2021
 *
 */


import java.util.Scanner;

public class Notes {

	public static void main (String[] args) {
		
		Scanner lectureClavier = new Scanner(System.in);

		double [] notes;
		int nbNotes;

		System.out.print("Combien de notes voulez-vous saisir ? ");
		nbNotes = lectureClavier.nextInt();
		notes = new double[nbNotes];
		//System.out.println("Taille du tableau : " + notes.length);
		for (int i = 0; i < notes.length; i++) {
			System.out.print("Entrez la note n° " + (i+1) + " : ");
			notes[i] = lectureClavier.nextDouble();
		}

		double [] notes_1 = {10, 12.5, 5, 8.5, 16, 0, 13, 7};

		System.out.println(" # Boucle for classique "); 
		// on tient compte du compteur de boucle

		for (int i = 0; i < notes_1.length; i++) {
			System.out.println("notes_1["+i+"] vaut " + notes_1[i]);
		}

		System.out.println(" # Boucle for condensé ");
		// la valeur du compteur de boucle est implicite pour le programmeur
		
		for (double note : notes_1) {
			System.out.println(" " + note);
		}

		System.out.println(" # Boucle for condensé avec 'var' ");
		// utilisation de var (inférence du type)
		
		for (var note : notes_1) {
			System.out.println(" " + note);
		}
	}

}
