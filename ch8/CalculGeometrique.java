/* objectif: interface pour les opérations de calcul 
 * auteur: Chancerel Codjovi (aka codrelphi)
 * date: 22.06.2021
 *
 */


interface CalculGeometrique {

	default public double surface() {
		return -1;
	}

	default public double perimetre() {
		return -1;
	}
}
