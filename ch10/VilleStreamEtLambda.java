/* objectif: essayer Stream et lambda expression
 * auteur: Chancerel Codjovi
 * date: 05.07.2021
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class VilleStreamEtLambda {

	static short nbVillesSup6 = 0;
	static short nbVillesInf6 = 0;

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
		System.out.println("Villes (Taille: " + taille + "): " + villes);
		System.out.println();
		Collections.sort(villes);
		System.out.println("Ville triée: " + villes);

		villes.stream()
			.map(ville -> ville.toUpperCase())
			.forEach(ville -> {
				if(ville.length() > 6) {
					System.out.println("Ville: " + ville);
					nbVillesSup6++;
				}
				else {
					System.out.println("Ville: " + "trop petite !");
					nbVillesInf6++;
				}
			});
		
		System.out.println();
		System.out.println("Le nombre de ville (Taille > 6) est : " + nbVillesSup6);
		System.out.println("Le nombre de ville (Taille <=6) est : " + nbVillesInf6);


	}

}
