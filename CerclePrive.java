/* objectif: définir l'objet Cercle (caractéristiques et comportements)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 04.06.2021
 *
 */

import java.util.Scanner;

public class CerclePrive {

	private int x, y; // position au centre du cercle
	private int r; // rayon du cercle
	public static int nombre; // nombre de cercle 

	public void creer() {
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.print(" Position en y : ");
		y = lectureClavier.nextInt();
		System.out.print(" Rayon : ");
		r = lectureClavier.nextInt();
		nombre++;
	}

	public void afficher() {
		System.out.println("Cercle centré en " + x + ", " + y);
		System.out.println(" de rayon : " + r);
	}

	public double perimetre() {
		return 2 * Math.PI * r;
	}

	public void deplacer(int nx, int ny) {
		x = nx;
		y = ny;
	}

	public void agrandir(int nr) {
		r += nr;
	}
	
	public void echanger(Cercle autre) {
		int tmp;

		tmp = x;
		x = autre.x;
		autre.x = tmp;

		tmp = y;
		y = autre.y;
		autre.y = tmp;
	}
}
