/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher
Date cr��: 2015-03-08
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
	 * G�n�re une valeur al�atoire parmi les faces du d�
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
	 * @return 0 si faceObtenues sont �gales, 1 si aDe>this, -1 si aDe<this
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
					.println("Vous devez cr�er une classe h�ritant de De et red�finissant compareTo()");
			System.exit(1);
		}
		return comparer;
	}

	/**
	 * @return la derni�re face obtenue
	 */
	public String getFaceObtenue() {
		return faceObtenue;
	}

	// public String face(int numFace) {
	// return faces[numFace];
	// }
}
