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
2015-03-10 Ajout des fonctions de base.
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Samuel
 *
 */
public class Joueur implements Comparable {
	private int pointage;
	private String[] facesObtenues;

	public Joueur() {
		pointage = 0;
	}
	
	private void roulerDes() {
		
	}
	
	public void jouer() {
		
	}
	
	public Comparable biggerScore(Comparable joueur) {
		return joueur;
	}
	public Comparable smallerScore(Comparable joueur) {
		return joueur;
	}
	public boolean hasSameScore(Comparable joueur) {
		return true;
	}
	
	public int getPointage() {
		return pointage;
	}

	public void setPointage(int pointage) {
		this.pointage = pointage;
	}

	public String[] getFacesObtenues() {
		return facesObtenues;
	}

	public void setFacesObtenues(String[] facesObtenues) {
		this.facesObtenues = facesObtenues;
	}

	

	

}
