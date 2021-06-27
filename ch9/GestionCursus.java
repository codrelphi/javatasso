/* objectif: pour gérer le cursus des étudiants
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 26.06.2021
 *
 */


public class GestionCursus {

	public static void main(String [] args) {
		
		Cursus c = new Cursus();

		System.out.println("------------- Recapitulatif ----------");
		c.afficherLesEtudiants();
		System.out.println("------------- Classement -------------");
		c.classerParMoyenne();
		c.afficherLesEtudiants();
	}

}
