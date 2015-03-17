/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche, Olivier G�vremont, Am�lie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher 
Date cr��: 2015-03-08
Date dern. modif. 2015-03-08
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-08 Version initiale 
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Oliver
 *
 */
public interface IStrategie {
	/**
	 * 
	 * @return le nombre de d�s n�cessaires
	 */
	public int getNombreDes();

	/**
	 * 
	 * @return le nombre de tours du jeu
	 */
	public int getNombreTours();

	/**
	 * 
	 * @param jeu
	 * @return le nom du vainqueur
	 */
	public String calculerLeVainqueur(Jeu jeu);

	/**
	 * Calcule le score du jeu
	 * 
	 * @param jeu
	 */
	public void calculerScoreTour(Jeu jeu);
}
