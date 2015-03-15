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
	private IStrategie strategie;
	private CollectionJoueurs listJoueurs;
	private CollectionDes listDes;

	public Jeu(IStrategie aStrategie, CollectionJoueurs aListJoueurs,
			CollectionDes aListDes) {
		strategie = aStrategie;
		nbTours = strategie.getNombreTours();
		listJoueurs = aListJoueurs;
		listDes = aListDes;
	}
	public void jouerTour(){
		//passer tous les joueurs et calculer leurs points
		
	}
	public void calculerVainqueur(){
		//passer � travers tous les joueurs avec l'it�rateur
		//trouver le joueur avec le meilleur score
		//� l'aide de la strat�gie
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
