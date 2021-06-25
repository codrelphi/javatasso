/* objectif: simuler une calculette en se basant sur des paramètres de lignes de commandes
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 25.06.2021
 *
 */

import java.util.Scanner;

public class Calculette {

	public static void main(String [] args) {
		
		int x, y;
		char op;
		double resultat;
		Scanner lectureClavier;


		if (args.length > 0) {
			// il y a des arguments
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[2]);
			op = args[1].charAt(0);
			System.out.println("\n" + op);
		}
		else {
			// pas d'arguments
			lectureClavier = new Scanner(System.in);
			System.out.print(" Valeur de x : ");
			x = lectureClavier.nextInt();
			System.out.print(" Valeur de y : ");
			y = lectureClavier.nextInt();
			System.out.print(" Opérateur : ");
			op = lectureClavier.next().charAt(0);
		}
		
		resultat = Calculette.operation(x, y, op);
		if ((int) resultat == -1000) System.out.println("INFO: Cette opération n'est pas possible !");
		else System.out.println(" " + x + " " + op + " " + y + " = " + resultat); 

	}
	
	public static double operation(int x, int y, char op) {

		final int VALUE = -1000;		
		double resultat = VALUE;

		switch (op) {

			case '+':
				resultat = x + y;
				break;
			case '-':
				resultat = x - y;
				break;
			case '*':
				resultat = x * y;
				break;
			case '/':
				if (y == 0) break;
				resultat = (double) x / y;
				break;
			default:
				System.out.println("INFO: Cette opération n'est pas possible !");
		}
		
		return resultat;

	}
}
