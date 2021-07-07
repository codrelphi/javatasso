/* objectif: opérations sur un fichier
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 06.07.2021
 *
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Fichier {

	private BufferedReader fR;
	private BufferedWriter fW;
	private char mode;

	public void ouvrir(String nomFichier, String s) 
			throws IOException {
		mode = s.toUpperCase().charAt(0);
		if (mode == 'R' || mode == 'L')
			fR = new BufferedReader(new FileReader(new File(nomFichier)));
		else if (mode == 'W' || mode == 'E') 
			fW = new BufferedWriter(new FileWriter(new File(nomFichier)));
	}

	public void ecrire(int tmp) 
			throws IOException {
		String chaine = "";
		chaine = String.valueOf(tmp);
		if (chaine != null) {
			fw.write(chaine, 0, chaine.length);
			fw.newLine();
		}
	}

	public String lire() 
			throws IOException {
		String chaine = fR.readLine();
		return chaine;

	}

	public void fermer() 
			throws IOException {
		if (mode == 'R' || mode == 'L') fR.close();
		else if (mode == 'W' || mode == 'E') fW.close();

	}

}
