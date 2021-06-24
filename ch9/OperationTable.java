/* objectif: faire des oéprations sur les éléments du tableau
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 24.06.2021
 *
 */



public class OperationTable {

	public static void main (String[] args) {
		
		final int TAILLE = 5;

		int [] tab_1 = {1, 2, 3, 4, 5};
		int [] tab_2 = new int[TAILLE];
		int [] tab_3 = new int[TAILLE];

		for (var i = 0; i < TAILLE; i++) tab_2[i] = 2 * tab_1[i];
		for (var i = 0; i < TAILLE; i++) tab_3[i] = 3 * tab_2[i];

		System.out.println("\n # Tableau 1 \n");
		for (var t : tab_1) System.out.println(t);

		System.out.println("\n # Tableau 2 \n");
		for (var t : tab_2) System.out.println(t);

		System.out.println("\n # Tableau 3 \n");
		for (var t : tab_3) System.out.println(t);
		
	}
}
