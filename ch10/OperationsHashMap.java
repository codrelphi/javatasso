/* objectif: tester les nopérations sur les HashMap
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 30.06.2021
 *
 */


import java.util.HashMap;

public class OperationsHashMap {

	public static void main(String [] args) {

		/* quelques opérations:
		 * put(cle, objet): met une association cle-objet dans le dictionnaire
		 * get(cle): retourne l'objet associé à la cle indiquée
		 * remove(cle): supprime une association en se basant sur la cle indiquée
		 * size(): donne la taille du dictionnaire
		 * clear(): vide le dictionnaire
		 */

		HashMap<Integer, String> dict = new HashMap<Integer, String>();
		System.out.println("Dictionnaire : " + dict);
		dict.put(1, "Victor Hugo");
		dict.put(2, "Platon");
		dict.put(3, "Jean-Jacques Rousseau");
		dict.put(4, "Jean Pliya");
		dict.put(5, "Olympe Bhêly Quenum");
		System.out.println("Dictionnaire (Taille: " + dict.size() + ") : " + dict);
		System.out.println("A la cle <2>, on a : " + dict.get(2));
		System.out.println("Suppression <2> : " + dict.remove(2));
		//System.out.println("Modification <3> : " + dict.set(3, "Jean Jacques R."));
		System.out.println("Dictionnaire : " + dict);
		dict.clear();
		System.out.println("Dictionnaire : " + dict);


	}

}
