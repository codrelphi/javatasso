/* objectf: utiliser les méthodes String de comparaison de mots
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.06.2021
 *
 */


public class Comparer {

	public static void main (String[] args) {
		String prvb1 = "Le mieux est l'ennemi du bien";
		String prvb2 = "Le mieux est l'Ennemi du bien";

		System.out.println("1 : " + prvb1);
		System.out.println("2 : " + prvb2);

		System.out.println("Comparons les 10 premiers caractères : ");
		System.out.print("En tenant compte des majuscules : ");
		if (prvb1.regionMatches(false, 0, prvb2, 0, 10)) 
			System.out.println("Les 10 premiers cars sont identiques");
		else
			System.out.println("Il y a des différences sur les 10 premiers caractères");

		System.out.println("Sans tenir compte des majuscules : ");
		if (prvb1.regionMatches(18, prvb2, 18, 6)) 
			System.out.println("Les cars de 18 à 23 sont identiques");
		else
			System.out.println("Il y a des différences");

		if (prvb1.compareTo(prvb2) == 0)
			System.out.println("Les deux chaines sont identiques");
		else {
			if (prvb1.compareTo(prvb2) < 0) 
				System.out.print(prvb1 + " est avant " + prvb2);
			else 
				System.out.print(prvb1 + " est après " + prvb2);
			System.out.println(" dans le dictionnaire");
		}


	}
}
