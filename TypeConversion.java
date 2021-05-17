/* tester la conversion de type en java (cast)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 12.05.2021
 *
 */

public class TypeConversion {

	public static void main(String[] args) {
		int premier = 5, second = 3, coefficient = 2;
		double résultat1, résultat2;
		résultat1 = (double) coefficient * premier / second; //3.33333
		résultat2 = (double) (coefficient * premier / second); //3.0
		System.out.println(résultat1);
		System.out.println(résultat2);
	}
}
