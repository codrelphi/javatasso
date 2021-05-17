import java.util.Scanner;

public class Premier {

	public static void main(String[] args) {
		double a;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez une valeur: ");
		a = lectureClavier.nextDouble();
		System.out.println("Vous avez entré: " + a);
	}
}
