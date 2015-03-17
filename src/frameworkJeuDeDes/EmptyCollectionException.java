/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche, Olivier Gévremont, Amélie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-03-015
Date dern. modif. 2015-03-015
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-015 Version initiale 
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Oliver
 *
 */
@SuppressWarnings("serial")
public class EmptyCollectionException extends Exception {
	public EmptyCollectionException() {
		super("On ne peut créer un itérateur avec un tableau vide.");
	}
}
