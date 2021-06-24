/* objectif: classe pour la forme géométrique
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 * update: 23.06.2021
 *
 */

import java.util.Scanner;

public class Forme implements CalculGeometrique {

	protected int x, y, couleur;
	private Scanner lectureClavier = new Scanner(System.in);

	public Forme() {
		System.out.print(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.print(" Position en y : ");
		y = lectureClavier.nextInt();
		System.out.print(" Couleur de la forme : ");
		couleur = lectureClavier.nextInt();
	}
	
	public Forme (int nx, int ny) {
		x = nx;
		y = ny;
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

	/*public double surface() {
		return -1;
	}

	public double perimetre() {
		return -1;
	}*/

}
