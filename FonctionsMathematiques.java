/* objectif: appliquer des fonctions mathématiques
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 20.05.2021
 * update: 21.05.2021
 *
 */


import java.util.Scanner;
import java.util.Locale;

public class FonctionsMathematiques {

	public static void main (String[] args) {
		
		double resultat, a, b;
		Scanner lectureClavier = new Scanner(System.in);
		lectureClavier.useLocale(Locale.US);

		System.out.print("Entrez la 1ère valeur: ");
		a = lectureClavier.nextDouble();
		System.out.print("Entrez la 2ème valeur: ");
		b = lectureClavier.nextDouble();
		resultat = Math.sin(a);
		System.out.println("sin(" + a + ") = " + resultat);
		resultat = Math.cos(a);
		System.out.println("cos(" + a + ") = " + resultat);
		resultat = Math.tan(a);
		System.out.println("tan(" + a + ") = " + resultat);
		resultat = Math.log(a);
		System.out.println("log(" + a + ") = " + resultat);
		resultat = Math.abs(a);
		System.out.println("abs(" + a + ") = " + resultat);
		resultat = Math.pow(a,b);
		System.out.println("pow(" + a + "," + b + ") = " + resultat);
		resultat = Math.sqrt(a);
		System.out.println("sqrt(" + a + ") = " + resultat);
		resultat = Math.floor(a); // arrondi inférieur
		System.out.println("floor(" + a + ") = " + resultat);
		resultat = Math.ceil(a); // arrondi supérieur
		System.out.println("ceil(" + a + ") = " + resultat);
		resultat = Math.max(a,b);
		System.out.println("max(" + a + "," + b + ") = " + resultat);
		resultat = Math.min(a, b);
		System.out.println("min(" + a + "," + b + ") = " + resultat);
		resultat = Math.random();
		System.out.println("random() = " + resultat);
	}
}
