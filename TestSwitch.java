/* objectif: utiliser switch 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.05.2021
 *
 */

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		
		String reponse;
		Scanner lectureClavier = new Scanner(System.in);

		System.out.print("Voulez-vous continuer ? (Oui/Non): ");
		reponse = lectureClavier.nextLine();
		reponse = reponse.toLowerCase();

		switch (reponse) { 
			case "oui":
				System.out.println("Vous avez choisi 'Oui'! Cool!");
				break;
			case " ":
			case "non":
				System.out.println("Vous avez choisi 'Non'! Pas grave!");
				break;
			default:
				System.out.println("Vous n'avez choisi ni 'Oui' ni 'Non' !");
		}

		if (reponse.length() <= 3) ;
		else System.out.println("La taille de la réponse est trop grande !");
	}

}
