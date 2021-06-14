/* objectif: simuler l'identité d'une personne
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 14.06.2021
 *
 */


import java.util.Scanner;


public class Identite {

	private String prenom;
	private String nom;
	private char sexe;
	private byte age;
	private String pays;

	public Identite() {
		prenom = "John";
		nom = "Doé";
		sexe = 'M';
		age = 18;
		pays = "Maroc";
	}

	public Identite(String p, String n) {
		this();
		prenom = p;
		nom = n;
	}

	public Identite(String p, String n, char s) {
		this(p, n);
		sexe = s;
	}

	public Identite(String p, String n, char s, byte a) {
		this(p, n, s);
		age = a;
	}

	public Identite(String p, String n, char s, byte a, String pa) {
		this(p, n, s, a);
		pays = pa;
	}

	public void afficher() {
		System.out.println(" Prénom : " + this.prenom);
		System.out.println(" Nom    : " + this.nom);
		System.out.println(" Sexe   : " + this.sexe);
		System.out.println(" Age    : " + this.age);
		System.out.println(" Pays   : " + this.pays);
		System.out.println(" \n-----------------------------------------------\n");
	}

}
