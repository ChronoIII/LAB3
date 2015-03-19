/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche, Olivier Gévremont, Amélie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-03-15
Date dern. modif. 2015-03-15
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-15 Version initiale 
2015-03-15 fonctionnement de base
 *******************************************************/

package frameworkJeuDeDes;

import bunco.BuncoStrategie;

/**
 * @author Oliver
 *
 */
public class Fabrique {
	
	/**
	 * 
	 * @param aCJ
	 * @param aCD
	 * @param aStrat
	 * @return un jeu fait sur mesure
	 */
	public static Jeu creerJeu(CollectionJoueurs aCJ, CollectionDes aCD,
			IStrategie aStrat) {
		return new Jeu(aStrat, aCJ, aCD);
	}

	/**
	 * Initialise un jeu Bunco+
	 * 
	 * @param nbJoueurs
	 * @return
	 */
	public static Jeu creerJeuBunco(int nbJoueurs) {
		BuncoStrategie bs = new BuncoStrategie();
		return new Jeu(bs, Fabrique.creerJoueurs(nbJoueurs),
				Fabrique.creerDesClassiques(bs.getNombreDes()));
	}

	/**
	 * 
	 * @param nbJoueurs
	 * @return une collection de joueurs
	 */
	public static CollectionJoueurs creerJoueurs(int nbJoueurs) {
		CollectionJoueurs listJoueurs = new CollectionJoueurs();
		for (int i = 0; i < nbJoueurs; i++) {
			listJoueurs.ajouterJoueur(Fabrique.creerJoueur());
		}
		return listJoueurs;
	}

	/**
	 * 
	 * @return un joueur
	 */
	public static Joueur creerJoueur() {
		return new Joueur();
	}

	/**
	 * 
	 * @param nbDes
	 * @return une collection de dés
	 */
	public static CollectionDes creerDesClassiques(int nbDes) {
		CollectionDes des = new CollectionDes();
		for (int i = 0; i < nbDes; i++) {
			des.ajouterDe(Fabrique.creerDeClassique());
		}
		return des;
	}

	/**
	 * 
	 * @return un dé à 6 faces numérotées de 1 à 6
	 */
	public static De creerDeClassique() {
		String[] faces = { "1", "2", "3", "4", "5", "6" };
		return Fabrique.creerDe(faces);
	}

	/**
	 * Crée un dé avec, comme faces, le tableau en paramètre
	 * 
	 * @param faces
	 * @return
	 */
	public static De creerDe(String[] faces) {
		return new De(faces);
	}
}
