/* objectif: essayer Stream et lambda expression
 * auteur: Chancerel Codjovi
 * date: 05.07.2021
 * update: 06.07.2021
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VilleStreamEtLambda {

	static short nbVillesSup6 = 0;
	static short nbVillesInf6 = 0;
	static short nbVillesDebutantParCaractere = 0;

	public static void main(String [] args) {

		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Casablanca");
		villes.add("Rabat");
		villes.add("Agadir");
		villes.add("Izgane");
		villes.add("Marrakech");
		villes.add("Settat");
		villes.add("Kouribga");
		villes.add("Kénitra");
		villes.add("Mohammedia");
		villes.add("Fès");
		villes.add("Ifrane");
		villes.add("Meknès");
		villes.add("Benguérir");
		var taille = villes.size();
		System.out.println("Villes (Taille: " + taille + "): " + villes + "\n");
		Collections.sort(villes);
		System.out.println("Ville triée: " + villes + "\n");

		villes.stream()
			.map(ville -> ville.toUpperCase())
			.forEach(ville -> {
				if(ville.length() > 6) {
					System.out.println("Ville : " + ville);
					nbVillesSup6++;
				}
				else {
					System.out.println("Ville : " + "trop petite !");
					nbVillesInf6++;
				}
			});
		
		System.out.println();
		System.out.println("Le nombre de ville (Taille > 6) est : " + nbVillesSup6);
		System.out.println("Le nombre de ville (Taille <= 6) est : " + nbVillesInf6);

		// on veut déterminer le nombre de ville débutant par un caractère donné
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez un caractère: ");
		var caractere = lectureClavier.next().charAt(0);
		System.out.println("Le caractère entré est : " + caractere + "\n");
		villes.stream()
			.filter(ville -> ville.startsWith(String.valueOf(
							Character.toUpperCase(caractere))))
			.forEach(ville -> {
				nbVillesDebutantParCaractere++;
				System.out.println(" " + ville);
			});
		System.out.println("\n Le nombre de villes débutant par " + 
				caractere + " est : " + nbVillesDebutantParCaractere);
		/*
		 * Améliorations:
		 * - Faire un Menu (pour sélectionner l'action à réaliser
		 * - Faire les opérations basique du CRUD pour une ville
		 * - Afficher la liste de toutes les villes
		 * - Afficher les villes en fonction de la taille (ex: ville 
		 *   	de plus de 7 lettresdonnée par l'user
		 * - Rechercher les villes débutant par un caractère entré par l'user
		 *
		 */

	}

}
