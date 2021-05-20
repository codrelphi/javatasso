/* objectif: tester quelques particularités de for
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 20.05.2021
 *
 */


import java.util.Scanner;


public class TestForParticularity {

	public static void main (String[] args) {

		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez une valeur: ");
		byte valeur = lectureClavier.nextByte();

		//for (;;) System.out.println("Hello"); // ca compile
		
		for (byte i=0; i<=valeur; i++); // ca compile
	}
}
