/* objectif: utiliser la classe Identite
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.06.2021
 *
 */


public class TesterIdentite {

	public static void main (String[] args) {

		Identite A = new Identite();
		A.afficher();
		Identite B = new Identite("Chancerel", "Codjovi");
		B.afficher();
		Identite C = new Identite("Chancerel", "Codjovi", 'M');
		C.afficher();
		Identite D = new Identite("Chancerel", "Codjovi", 'M', (byte) 29);
		D.afficher();
		Identite E = new Identite("Chancerel", "Codjovi", 'M', (byte) 29, "Bénin");
		E.afficher();
		
	}
}
