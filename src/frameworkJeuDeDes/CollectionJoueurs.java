/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-2015-03-08
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
public class CollectionJoueurs implements Agregat {

	Joueur[] listJoueur;
	
	public void ajouterJoueur(Joueur joueur) {
		Joueur[] listTemp = listJoueur;
		listJoueur = new Joueur[listJoueur.length + 1];
		
		for(int i = 0; i < listTemp.length; i++) {
			listJoueur[i] = listTemp[i];
		}
		
		listJoueur[listJoueur.length - 1] = joueur;
	}
	
	public void ReplaceJoueur(Joueur joueur, int pos) {
		listJoueur[pos] = joueur;
	}
	
	public void createItarator() {
		
	}
	
	public Joueur getJoueur(int pos) {
		return listJoueur[pos];
	}
	
	public void destroyJoueur(int pos) {
		Joueur[] listTemp = listJoueur;
		listJoueur = new Joueur[listJoueur.length - 1];
		
		for(int i = 0; i < pos; i++) {
			listJoueur[i] = listTemp[i];
		}
		
		for(int i = pos + 1; i < listTemp.length; i++) {
			listJoueur[i] = listTemp[i];
		}
	}
}
