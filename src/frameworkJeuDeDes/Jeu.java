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
public class Jeu {
	private int tour;
	private int nbTours;
	private CollectionJoueurs listJoueurs;
	private CollectionDes listDes;

	public Jeu() {

	}

	public int getTour() {
		return tour;
	}

	public void setTour(int tour) {
		this.tour = tour;
	}

	public int getNbTours() {
		return nbTours;
	}

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}

	public CollectionJoueurs getListJoueurs() {
		return listJoueurs;
	}

	public void setListJoueurs(CollectionJoueurs listJoueurs) {
		this.listJoueurs = listJoueurs;
	}

	public CollectionDes getListDes() {
		return listDes;
	}

	public void setListDes(CollectionDes listDes) {
		this.listDes = listDes;
	}
}
