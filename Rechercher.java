/* objectif: utiliser quelques méthodes (de recherche) de la classe String
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.06.2021
 *
 */


import java.util.Scanner;


public class Rechercher {

	public static void main (String[] args) {
		
		String phrase = "Mieux vaut tard que jamais";
		String soumo = "";
		int place;

		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Vous avez dit : " + phrase);
		soumo = phrase.substring(11, 15); // "tard"
		System.out.println("De 11 à 15, la sous chaîne est : " + soumo);
		for (int i=0; i<5; i++) 
			System.out.println("en " + i + " il y a " + phrase.charAt(i));
		/* en 0 il y a 'M'
		 * en 1 il y a 'i'
		 * en 2 il y a 'e'
		 * en 3 il y a 'u'
		 * en 4 il y a 'x'
		 */
		System.out.print("Entrez un mot : ");
		soumo = lectureClavier.next();

		if (phrase.endsWith(soumo))
			System.out.println("La phrase se termine avec : " + soumo);
		else
			System.out.println("la phrase ne se termine pas avec : " + soumo);

		place = phrase.indexOf(soumo);
		if (place == -1)
			System.out.println("Ce mot n'existe pas dans : " + phrase);
		else 
			System.out.println(soumo + " est à la position " + place);


	}

}
