/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher
Date cr��: 2015-2015-03-08
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
public class CollectionJoueurs implements Agregat<Joueur> {

	private Joueur[] listJoueurs;

	/**
	 * Ajoute un joueur � la collection
	 * 
	 * @param joueur
	 */
	public void ajouterJoueur(Joueur joueur) {
		Joueur[] listTemp = listJoueurs;
		if (listJoueurs == null) {
			listJoueurs = new Joueur[1];
		} else {
			listJoueurs = new Joueur[listJoueurs.length + 1];
			for (int i = 0; i < listTemp.length; i++) {
				listJoueurs[i] = listTemp[i];
			}
		}

		listJoueurs[listJoueurs.length - 1] = joueur;
	}

	/**
	 * Sustitue un joueur par un autre
	 * 
	 * @param joueur
	 * @param pos
	 */
	public void ReplaceJoueur(Joueur joueur, int pos) {
		listJoueurs[pos] = joueur;
	}

	/**
	 * Cr�e un it�rateur
	 */
	public Iterateur<Joueur> createIterator() {
		try {
			return new Iterateur<Joueur>(listJoueurs);
		} catch (EmptyCollectionException e) {
			return null;
		}
	}

	/**
	 * 
	 * @param pos
	 * @return Le joueur � la position demand�e
	 */
	public Joueur getJoueur(int pos) {
		return listJoueurs[pos];
	}

	/**
	 * D�truit un joueur
	 * 
	 * @param pos
	 */
	public void destroyJoueur(int pos) {
		Joueur[] listTemp = listJoueurs;
		listJoueurs = new Joueur[listJoueurs.length - 1];

		for (int i = 0; i < pos; i++) {
			listJoueurs[i] = listTemp[i];
		}

		for (int i = pos + 1; i < listTemp.length; i++) {
			listJoueurs[i] = listTemp[i];
		}
	}
}
