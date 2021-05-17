/* programme pour calculer la circonférence d'un cercle de rayon quelconque
 * date: 10.05.2021
 * author: Chancerel Codjovi (aka codrelphi)
 */

import java.util.Scanner;

class Cercle {

	public static void main(String[] args) {
		double unRayon, lePerimetre, laSurface;

		Scanner sc = new Scanner(System.in);
		System.out.print("Le rayon: ");
		unRayon = sc.nextDouble();

		//lePerimetre = 2 * Math.PI * unRayon;
		lePerimetre = perimetre(unRayon);
		laSurface = surface(unRayon);
		System.out.println("Le cercle de rayon " + unRayon + " a pour périmètre: " + lePerimetre);
		System.out.println("Le cercle de rayon " + unRayon + " a pour surface: " + laSurface);
	}

	static 	double perimetre (double rayon) {
		return 2 * Math.PI * rayon;
	}
	static double surface (double rayon) {
		return Math.PI * Math.pow(rayon, 2);
	}

}
