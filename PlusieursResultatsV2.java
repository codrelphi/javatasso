/* objectif: utilisation de var
 * info: var ne peut pas être utilisé comme type du paramètre de la fonction
 * info: var ne peut pas être utilisé comme type de retour
 * info: lorsque var est utilisée, la variable doit être obligatoirement initialisée
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 31.05.2021
 *
 */


import java.util.Scanner;


public class PlusieursResultatsV2 {

	public static void main (String[] args ) {
		
		var lectureClavier = new Scanner(System.in);
		System.out.print("Valeur de a: ");
		var a = lectureClavier.nextInt();
		System.out.print("Valeur de b: ");
		var b = lectureClavier.nextInt();

		System.out.println("a=" + a + " b=" + b + " avant l'échange");
		echanger(a, b);
		System.out.println("a=" + a + " b=" + b + " après l'échange");
	}

	public static void echanger(int x, int y) {
		var tmp = x;
		x = y;
		y = tmp;
	}

}
