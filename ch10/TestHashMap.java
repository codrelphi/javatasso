/* objectif: tester quelques méthodes de HashMap
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 01.07.2021
 *
 */


import java.util.HashMap;


public class TestHashMap {

	public static void main(String [] args) {

		/* quelques méthodes de HashMap:
		 * put(cle, objet): pour ajouter un objet
		 * get(cle): retourne l'objet associé à la cle
		 * remove(cle): supprime l'association
		 * size(): retourne la taille du dictionnaire
		 * clear(): vide le dictionnaire
		 *
		 */

		HashMap<Integer, String> nombres = new HashMap<Integer, String>();

		nombres.put(1, "premier");
		nombres.put(2, "deuxième");
		nombres.put(3, "troisième");
		nombres.put(5, "cinquième");
		nombres.put(6, "sixième");
		nombres.put(4, "quatrième");

		System.out.println("Dictionnaire (Taille: " + nombres.size() + ") : " + nombres);
		System.out.println("Le 2ième élément est : " + nombres.get(2));
		nombres.remove(2);
		System.out.println("Dictionnaire (Taille: " + nombres.size() + ") : " + nombres);
		nombres.clear();
		System.out.println("Dictionnaire (Taille: " + nombres.size() + ") : " + nombres);
	

	}

}
