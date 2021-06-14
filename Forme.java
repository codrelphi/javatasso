/* objectif: définir une forme géométrique
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.06.2021
 *
 */


import java.util.Scanner;


public class Forme {

	protected int x, y;
	private int couleur;

	public Forme() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.print(" Position en y : ");
		y = lectureClavier.nextInt();
		System.out.print(" Couleur de la forme : ");
		couleur = lectureClavier.nextInt();
	}

	public void afficher() {
		System.out.println(" Position en " + x + ", " + y);
		System.out.println(" Couleur : " + couleur);
	}

	public void deplacer(int nx, int ny) {
		x = nx;
		y = ny;
	}

}
