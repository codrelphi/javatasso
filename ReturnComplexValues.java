/* objectif: tester de retourner une valeur complexe i.e Chancerel, Codjovi, M, 28, Bénin
 * auteur: Chancerel Codjovi
 * date: 25.05.2021
 *
 */


public class ReturnComplexValues {

	public static void main (String[] args) {
	
		String msg = ReturnComplexValues.jesuis("Chancerel", "Codjovi", "Bénin", 'M', (byte) 28);
		System.out.println(msg);
	}


	public static String jesuis(String prenom, String nom, String pays, char sexe, byte age) {
		
		Identification id = new Identification(nom, prenom, sexe, age, pays);
		return id.leReturn();
	}


}


class Identification {

	private String nom, prenom, pays;
	private char sexe;
	private byte age;

	public Identification(String nom, String prenom, char sexe, byte age, String pays) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.pays = pays;
	}

	public String leReturn() {
		return prenom + "," + nom + "," + sexe + "," + age + "," + pays;
	}
}
