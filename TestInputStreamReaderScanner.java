/* objectif: tester la relation entre InputStreamReader et Scanner 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 13.05.2021
 *
 */

import java.util.Scanner;
import java.io.InputStreamReader;
//import java.io.BufferedReader;


public class TestInputStreamReaderScanner {

	public static void main(String[] args) {
		
		//BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		//Scanner lectureClavier = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Scanner lectureClavier = new Scanner(new InputStreamReader(System.in));
		System.out.print("Entrez une phrase: ");
		String phrase = lectureClavier.nextLine();

		System.out.println("La phrase: " + phrase);
	}
}
