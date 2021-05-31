/* objectif: lorsqu'on a plusieur résultats.
 * Nb: un return ne peut retourner qu'un et un seul résultat (ex: return a;)
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 31.05.2021
 *
 */

import java.util.Scanner;

public class PlusieursResultats {

	public static void main (String[] args) {
		int a, b;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Valeur de a: ");
		a = lectureClavier.nextInt();
		System.out.print("Valeur de b: ");
		b = lectureClavier.nextInt();
		System.out.println("a = " + a + " b = " + b + " avant l'échange ");
		echanger(a, b);
		System.out.println("a = " + a + " b = " + b + " après l'échange ");

	}

	public static void echanger(int x, int y) 
	{
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x + " y = " + y + " dans echanger() ");
	}
}
