/* objectif: définir l'objet Cercle (caractéristiques et comportements)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 02.06.2021
 * update: 03.06.2021
 * update: 11.06.2021
 *
 */

import java.util.Scanner;

public class Cercle {

	private int x, y; // position au centre du cercle
	private int r; // rayon du cercle
	public static int nombre; // nombre de cercle 
	public static final short TailleEcran = 600;

	private Scanner lectureClavier = new Scanner(System.in);
	
	// ce code n'est pas un contructeur mais une méthode
	// elle n'est pas appelée par l'opérateur new
	public void Cercle() {
		x = 1;
		y = 1;
		r = 1;
	}
	
	// public void creer() est transformé en constructeur
	// public Cercle()
	public Cercle() {
		System.out.print(" Position en x : ");
		x = lectureClavier.nextInt();
		System.out.print(" Position en y : ");
		y = lectureClavier.nextInt();
		r = rayonVerifier();
		nombre++;
	}

	public Cercle(int centreX, int centreY) {
		x = centreX;
		y = centreY;
	}

	public Cercle(int centreX, int centreY, int rayon) {
		this(centreX, centreY);
		r = rayonVerifier(rayon);
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

	private int rayonVerifier() {
		int tmp;
		do {
			System.out.print(" Rayon : ");
			tmp = lectureClavier.nextInt();
		} while (tmp < 0 || tmp > TailleEcran);
		return tmp;
	}

	private int rayonVerifier(int tmp) {
		if (tmp < 0) return 0;
		else if (tmp > TailleEcran) return TailleEcran;
		else return tmp;
	}
}
