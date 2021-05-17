/* objectif: obtenir le nombre de jour d'un mois donné
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.05.2021
 * update: 15.05.2021
 *
 */

import java.util.Scanner;
 
public class JourParMoisAvecException {

	public static void main (String[] args) {
		
		byte mois, nbJours = 0;
		short annee;
		Scanner lectureClavier = new Scanner(System.in);
		
		try {

			System.out.print("Entrez le mois: ");
			mois = lectureClavier.nextByte();
			verificationDuMois(mois);

			System.out.print("Entrez l'année: ");
			annee = lectureClavier.nextShort();

			jourParMois(mois, annee);
		} 
		catch (InfToZeroException e) {
			System.out.println("Erreur: " + e.getMessage());
		}
		catch (SupToTwelveException e) {
			System.out.println("Erreur: " + e.getMessage());
		}
		annee = (short) 33000;

	}

	static void verificationDuMois(int mois) 
			throws InfToZeroException, SupToTwelveException
	{
		if (mois <= 0) throw new InfToZeroException(mois + " est inférieur ou égal à 0.");
                if (mois > 12) throw new SupToTwelveException(mois + " est supérieur à 12.");

	}

	static void jourParMois(byte mois, short annee) {
		byte nbJours = 0;
		switch (mois) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				nbJours = 31;
				break;
			case 4: case 6: case 9: 
			case 11:
				nbJours = 30;
				break;
			case 2:
				if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) nbJours = 29;
				else nbJours = 28;
				break;
			default:
				System.out.println("Erreur: le mois est incorrect !");
		}
		System.out.println("Le mois " + mois + " de l'année " + annee);
		System.out.println("  possède " + nbJours + " jours.");
	}
}

class InfToZeroException extends Exception {

	public InfToZeroException() { super();}
	public InfToZeroException(String message) {
		super(message);
	}
}

class SupToTwelveException extends Exception {
	public SupToTwelveException() { super(); }
	public SupToTwelveException(String message) { super(message); }
}
