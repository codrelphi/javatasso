/* objectif: utilisation des classes implémentants l'interface
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 *
 */


public class MainTVProg {

	public static void main (String args[]) {
		
		TVSamsung tvs = new TVSamsung();
		tvs.allumer();
		tvs.eteindre();
		RadioSharp rs = new RadioSharp();
		rs.allumer();
		rs.eteindre();
	}
}
