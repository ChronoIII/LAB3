/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-03-08
Date dern. modif. 2015-03-08
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-08 Version initiale 
2015-03-11 Ajout des fonctions de base.
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Samuel
 *
 */
public class De implements Comparable<De> {

	private String[] faces;
	private String faceObtenue;

	public De(String[] faces) {
		this.faces = faces;
	}

	/**
	 * Génère une valeur aléatoire parmi les faces du dé
	 * 
	 * @return
	 */
	public String rouler() {
		faceObtenue = faces[(int) Math.round(Math.random() * faces.length)];
		return faceObtenue;
	}

	/**
	 * 
	 * @param aDe
	 * @return 0 si faceObtenues sont égales, 1 si aDe>this, -1 si aDe<this
	 */
	public int compareTo(De aDe) {
		int comparer = 0;
		try {
			if (Double.parseDouble(this.getFaceObtenue()) < Double
					.parseDouble(aDe.getFaceObtenue())) {
				comparer = 1;
			}
			if (Double.parseDouble(this.getFaceObtenue()) > Double
					.parseDouble(aDe.getFaceObtenue())) {
				comparer = -1;
			}
		} catch (NumberFormatException nfe) {
			System.out
					.println("Vous devez créer une classe héritant de De et redéfinissant compareTo()");
			System.exit(1);
		}
		return comparer;
	}

	/**
	 * @return la dernière face obtenue
	 */
	public String getFaceObtenue() {
		return faceObtenue;
	}

	// public String face(int numFace) {
	// return faces[numFace];
	// }
}
