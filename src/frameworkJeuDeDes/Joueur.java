/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche, Olivier Gévremont, Amélie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-03-08
Date dern. modif. 2015-03-17 
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-08 Version initiale 
2015-03-10 Ajout des fonctions de base.
2015-03-17 les fonctions de la méthode joueur
2015-03-17 setPointage -> ajouterpoints
2015-03-17 supprimer rouler
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Samuel
 *
 */
public class Joueur implements Comparable<Joueur> {

	private String nom;
	private int pointage;
	private String[] facesObtenues;

	private static int nextJoueurCree = 1;

	public Joueur() {
		pointage = 0;
		nom = "Joueur " + nextJoueurCree;
		nextJoueurCree++;
	}

	public void jouer(CollectionDes des) {
		facesObtenues = new String[des.length()];
		Iterateur<De> i = des.createIterator();
		while(i.hasNext()){
			facesObtenues[i.currentItemPosition()] = i.currentItem().rouler();
			i.next();
		}
	}

	/**
	 * @param aJoueur
	 * @return 0 si pointage sont égaux, 1 si aJoueur>this, -1 si aJoueur<this
	 */
	public int compareTo(Joueur aJoueur) {
		int comparer = 0;
		if (this.getPointage() < aJoueur.getPointage()) {
			comparer = 1;
		}
		if (this.getPointage() > aJoueur.getPointage()) {
			comparer = -1;
		}
		return comparer;
	}

	public int getPointage() {
		return pointage;
	}

	public void ajouterPoints(int pointage) {
		this.pointage = this.pointage + pointage;
	}

	public String[] getFacesObtenues() {
		return facesObtenues;
	}

	public String getNom(){
		return nom;
	}
}
