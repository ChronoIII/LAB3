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
public class De implements Comparable {

	private String[] faces;
	
	public De(String[] faces) {
		this.faces = faces;
	}
	
	public String rouler() {
		String face = "";
		return face;
	}
	
	public String face(int numFace) {
		return faces[numFace];
	}
	
	public Comparable biggerScore(Comparable de) {
		return de;
	}
	
	public Comparable smallerScore(Comparable de) {
		return de;
	}
	
	public boolean hasSameScore(Comparable de) {
		return true;
	}
}
