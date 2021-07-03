/* objectif: tester les strems et les expressions lambdas
 * auteur: Chancerel Codjovi
 * date: 03.07.2021
 *
 */

//import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class TestStreamAndLambda {

	public static void main(String [] args) {

		/*HashMap<Integer, String> auteurs = new HashMap<Integer, String>();
		auteurs.put(1, "Victor Hugo");
		auteurs.put(2, "Jean-Jacques Rousseau");
		auteurs.put(3, "Cheikh Hamidou Kane");
		auteurs.put(4, "Hamadou Hampaté Ba");
		auteurs.put(5, "Jean Pliya");

		System.out.println("Parcours du dictionnaire <for> : \n");
		//auteurs.stream().forEach(auteur -> auteur);
		Collection c = auteurs.values();
		for (var auteur : c)
			System.out.println(auteur);

		System.out.println("Parcours du dictionnaire <Stream> et <Lambda> : ");
		auteurs.stream().filter(auteur -> auteur).forEach();*/

		/* quelques méthodes de transformations:
		 * des opérations finales doivent forcément être appliquées
		 * map(): pour faire des transformations à la volée
		 * filtered(): pour filtrer en fonction de critères donnés en paramètres
		 * sorted(): pour trier en fonction de critères donnés en paramètres
		 *
		 */

		/* certaines opérations finales:
		 * min(), max(): pour trouver le min ou le max
		 * forEach() pour parcourir le flux
		 * findAny(), findFirst(): pour trouver un élémenti
		 */

		ArrayList<String> auteurs = new ArrayList<String>();
		auteurs.add("Victor Hugo");
		auteurs.add("Jean-Jacques Rousseau");
		auteurs.add("Cheikh Hamidou Kane");
		auteurs.add("Hamadou Hampaté Ba");
		auteurs.add("Jean Pliya");
		auteurs.add("Robert Greene");

		System.out.println("Liste des auteurs commençant par H: ");
		auteurs.stream()
			.map(auteur -> auteur.split(" ")[1])
			.filter(nom -> nom.startsWith("H"))
			.sorted()
			.forEach(auteur -> System.out.println(auteur));

		System.out.print("Recherche le 1er auteur débutant par 'J' : ");
		var element = auteurs.stream()
			.filter(auteur -> auteur.startsWith("J"))
			.findFirst()
			.get();
		System.out.print(element);
		System.out.println();

		System.out.println("Tous les auteurs débutant par 'J' : ");
		auteurs.stream()
			.filter(auteur -> auteur.startsWith("J"))
			.forEach(x -> System.out.println(x));
		
		System.out.println("Tous les auteurs débuant par <J> : ");
		var elements = new ArrayList<String>();
		auteurs.stream()
			.filter(auteur -> auteur.startsWith("J"))
			.forEach(x -> elements.add(x));
		System.out.println(elements);


	}

}
