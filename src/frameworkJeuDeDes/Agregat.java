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
public interface Agregat<T> {
	
	/**
	 * 
	 * @return Un it�rateur du type demand�
	 */
	public Iterateur<T> createIterator();
}
