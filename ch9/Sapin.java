/* objectif: représenter un sapin de Noël
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 28.06.2021
 *
 */



import java.util.Scanner;


public class Sapin {

	public static void main(String [] args) {

		int [][] sapin;
		int nbLignes;
		int nbColonnes;
		Scanner lectureClavier = new Scanner(System.in);

		do {
			System.out.print("Quel est le nombre de lignes ? : ");
			nbLignes = lectureClavier.nextInt();
		} while(nbLignes <= 0);

		nbColonnes = 2 * nbLignes -1;
		sapin = new int[nbLignes][nbColonnes];
		int milieu = sapin[0].length / 2;
		System.out.println("Milieu : " + milieu);

		// initialisation du tableau
		for (var i = 0; i < sapin.length; i++) {
			for (var j = -i; j <= i; j++) {
				sapin[i][milieu + j] = (int) (5 * Math.random() + 1);
			}
		}

		// affichage
		for (var i = 0; i < sapin.length; i++) {
			for (var j = 0; j < sapin[0].length; j++) {
				switch(sapin[i][j]) {
					case 0:
						System.out.print(" ");
						break;
					case 2: System.out.print("%");
						break;
					default:
						System.out.print(".");
				}
			}
			System.out.println();
		}
	
	}

}
