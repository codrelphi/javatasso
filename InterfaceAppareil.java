/* objectif: décrire une interface
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 *
 */


interface InterfaceAppareil {

	public void allumer();
	public void eteindre();

	default public void hello(String word) {
		System.out.println("Hello World <" + word + ">");
	}

	static public void tell() {
		System.out.println("OOhhhhhhhhhh !");
	}

	private void shell() {
		System.out.println("Je suis une méthode privée !");
	}

}
