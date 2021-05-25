/* objectif: tester de retourner une valeur complexe i.e Chancerel, Codjovi, M, 28, Bénin
 * auteur: Chancerel Codjovi
 * date: 25.05.2021
 *
 */


public class ReturnComplexValues {

	public static void main (String[] args) {
	
		Identification id = new Identification("Codjovi", "Chancerel", 'M', (byte) 28, "Bénin");
		System.out.println(id.toString());
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

	public String toString() {
		return prenom + "," + nom + "," + sexe + "," + age + "," + pays;
	}
}
