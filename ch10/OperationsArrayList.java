/* objectif: utiliser quelques méthodes d'un ArrayList
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 28.06.2021
 *
 */

import java.util.ArrayList;

public class OperationsArrayList {

	public static void main(String [] args) {

		/*
		 * quelques opérations : 
		 * add(objet): ajoute l'ovjet en fin de la liste
		 * add(indice, objet): ajoute l'objet à l'indice indiqué
		 * addAll(indice, collection): ajoute la collection à l'indice indiqué dans la liste
		 * get(indice): retourne l'objet à l'indice indiqué
		 * remove(indice): supprime l'objet à l'indice indiqué
		 * removeRange(i, j): supprime les objets ayantb pour indice [i, j[
		 * indexOf(objet): retourne le premier index de l'objet dans la liste, sinon -1
		 * lastIndexOf(objet): retourne le dernier index de l'objet, sinon -1
		 * size(): taille de la liste
		 * set(indice, objet): modifie l'objet à l'indice indiqué
		 * clear(): vide la liste
		 */

		int capaciteListe = 10;
		ArrayList<String> liste = new ArrayList<String>(capaciteListe);
		ArrayList<String> autres = new ArrayList<String>();
		autres.add("pamplemouse");
		autres.add("raisin");
		autres.add("fraise");
		System.out.println("Liste : " + liste);
		liste.add("banane");
		liste.add("avion");
		System.out.println("Liste : " + liste);
		liste.add(1, "mangue");
		liste.add(1, "pistache");
		liste.add(2, "citron");
		liste.add(2, "melon");
		liste.add("pomme");
		liste.add("goyave");
		liste.add(3, "mangue");
		liste.add("mangue");
		liste.add("orange");
		liste.addAll(1, autres);
		System.out.println("Liste : " + liste);
		System.out.println("A l'indice " + 2 + " on a : " + liste.get(2));
		liste.remove(2);
		System.out.println("Liste : " + liste);
		//liste.removeRange(0, 2);
		System.out.println("Index de <mangue> : " + liste.indexOf("mangue"));
		System.out.println("Dernier index de <mangue> : " + liste.lastIndexOf("mangue"));
		System.out.println("Index de <ananas> : " + liste.indexOf("ananas"));
		System.out.println("Liste (Taille = " + liste.size() + ") : " + liste);
		liste.set(11, "ananas");
		System.out.println("Liste : " + liste);
		liste.clear();
		System.out.println("Liste : " + liste);

	}

}
