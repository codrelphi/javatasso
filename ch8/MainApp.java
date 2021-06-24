/* objectif: utilisation des différentes classes et interfaces
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 * update: 23.06.2021
 *
 */


public class MainApp {

	public static void main (String[] args) {

		/*Forme F = new Forme();
		F.afficher();
		System.out.println("Périmètre de la forme F : " + F.perimetre());
		System.out.println("Surface de la Forme F : " + F.surface());*/

		Cercle A = new Cercle(5, 5);
		A.afficher();

		if (A.perimetre() >= 0) System.out.println("Périmètre du Cercle A : " + A.perimetre());
		else System.out.println("Calcul impossible"); 
		System.out.println("Surface du Cercle A : " + A.surface());

		Forme F = new Forme(10, 10);
		F.afficher();
		if (F.perimetre() >= 0) System.out.println("Périmètre de F vaut " + F.perimetre());
		else System.out.println("Calcul impossible");
	}

}
