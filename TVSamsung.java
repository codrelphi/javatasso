/* objectif: utiliser une interface
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 *
 */


import java.util.Scanner;

public class TVSamsung implements InterfaceAppareil {

	private Scanner lectureClavier = new Scanner(System.in);

	public void allumer() {
		System.out.println("TV Samsung en cours d'allumage ...");
		System.out.println("TV Samsung allumé !");

	}

	public void eteindre() {
		char reponse;

		do {
			System.out.print("Voulez-vous éteindre la TV Samsung ? (O/N) : ");
			reponse = lectureClavier.next().charAt(0);
			reponse = Character.toUpperCase(reponse);
			System.out.println("Réponse: " + reponse);

		} while (reponse != 'O' && reponse != 'N');

		if (reponse == 'O') System.out.println(".... TV Samsung bien éteint !");
		else System.out.println("TV Samsung toujours allumée !");

	}
}
