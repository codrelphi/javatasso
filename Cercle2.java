/* objectif: uiliser le concept d'héritage
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.06.2021
 *
 */

import java.util.Scanner; 

public class Cercle2 extends Forme {

	private int r;
	public static final short TailleEcran = 600;
	private Scanner lectureClavier = new Scanner(System.in);

	public Cercle2() {
		System.out.println(" Rayon            : ");
		r = rayonVerifier();
	}
	
	public int rayonVerifier() {
		int tmp;
		do {
			System.out.print(" Rayon : ");
			tmp = lectureClavier.nextInt();
		} while (tmp < 0 || tmp > TailleEcran);
		return tmp;
	}

	public int rayonVerifier(int tmp) {
		if (tmp < 0) return 0;
		else if (tmp > TailleEcran) return TailleEcran;
		else return tmp;
	}

	public void afficher() {
		super.afficher();
		System.out.println(" Rayon : " + r);
	}

	public double perimetre() {}

	public void agrandir(int nr) {
		r = rayonVerifier(n + nr);
	}
}
