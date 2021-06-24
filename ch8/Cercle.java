/* objectif: classe Cercle
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 *
 */


//import java.util.Scanner;

public class Cercle extends Forme {

	private int r;
	//private Scanner lectureClavier = new Scanner(System.in);

	public Cercle(int nx, int ny) {
		super(nx, ny);
		r = 3;
	}

	public double surface() {
		return Math.PI * Math.pow(r, 2);
	}

	public double perimetre() {
		return 2 * Math.PI * r;
	}
}
