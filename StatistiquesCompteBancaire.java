/* objectif: calculer les statistiques d'utilisation de carte bleu, chèque et du virement bancaire.
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 12.05.2021
 *
 */

import java.util.Scanner;


public class StatistiquesCompteBancaire {

	public static void main(String[] args) {
		int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0;
		float prctCB, prctCh, prctVi;
		Scanner lectureClavier = new Scanner(System.in);
		
		System.out.print("Nombre de paiements par Carte Bleue: ");
		nbCB = lectureClavier.nextInt();
		System.out.print("Nombre de Chèques emis: ");
		nbCheque = lectureClavier.nextInt();
		System.out.print("Nombre de Virements automatiques: ");
		nbVirement = lectureClavier.nextInt();
		
		nbDebit = nbCB + nbCheque + nbVirement;
		prctCB = (float) nbCB / nbDebit * 100;
		prctCh = (float) nbCheque / nbDebit * 100;
		prctVi = (float) nbVirement / nbDebit * 100;
		System.out.println("Vous avez emis " + nbDebit + " ordres de débit");
		System.out.println("dont " + prctCB + "% par Carte Bleue");
		System.out.println("     " + prctCh + "% par Chèque");
		System.out.println("     " + prctVi + "% par Virement");
	}
}
