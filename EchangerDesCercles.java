/* objectif: pour échanger le centre de deux cercles
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 03.06.2021
 *
 */

public class EchangerDesCercles {

	public static void main (String[] args) {
		
		Cercle A = new Cercle();
		A.creer();
		System.out.println("Le cercle A : ");
		A.afficher();

		Cercle B = new Cercle();
		B.creer();
		System.out.println("Le cercle B : ");
		B.afficher();

		B.echanger(A);
		System.out.println("Après échange, ");
		System.out.println("Le cercle A : ");
		A.afficher();
		System.out.println("Le cercle B : ");
		B.afficher();

	}
}
