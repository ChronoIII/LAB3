/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche, Olivier G�vremont, Am�lie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher
Date cr��: 2015-03-015
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
		super("On ne peut cr�er un it�rateur avec un tableau vide.");
	}
}
