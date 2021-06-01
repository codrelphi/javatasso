/* objectif: utiliser les méthodes de transformation de chaine de caractères
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.06.2021
 *
 */


public class TransformationDeFormat {

	public static void main (String[] args) {
		String mot = "hello";
		
		System.out.println("En minuscule : " + mot + " => " + mot.toLowerCase());
		System.out.println("En majuscule : " + mot + " => " + mot.toUpperCase());
		System.out.println("concat() : " + mot.concat("world"));
		System.out.println("Taille : " + mot.length());
		System.out.println("Replace : " + mot.replace('l', '*'));
	}
}
