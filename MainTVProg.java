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
		tvs.hello("TV Samsung");
		InterfaceAppareil.tell();

		System.out.println("----------------------------\n");

		RadioSharp rs = new RadioSharp();
		rs.allumer();
		rs.eteindre();
		rs.hello("Radio Sharp");
		InterfaceAppareil.tell();


	}
}
