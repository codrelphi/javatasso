/* objectifs: compter le nombre de cercles créés
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 03.06.2021
 *
 */

public class CompterDesCercles {

	public static void main (String[] args) {

		Cercle A = new Cercle();
		A.creer();
		System.out.println("Nombre de cercles : " + Cercle.nombre);

		Cercle B = new Cercle();
		B.creer();
		System.out.println("Nombre de cercles : " + Cercle.nombre);
	}
}
