/* objectif: utiliser l'objet Cercle pour rfaire des cercles
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 11.06.2021
 *
 */

public class FaireDesCercles2 {

	public static void main (String[] args) {

		Cercle A = new Cercle();
		A.afficher();
		Cercle B = new Cercle(10, 10);
		B.afficher();
		Cercle C = new Cercle(10, 10, -30);
		C.afficher();
	}
}
