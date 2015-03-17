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
2015-03-11 Ajout des fonctions de base.
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Samuel
 *
 */
public class CollectionDes implements Agregat<De> {

	private De[] listDes;

	/**
	 * Ajoute un dé à la collection
	 * 
	 * @param de
	 */
	public void ajouterDe(De de) {
		De[] listTemp = listDes;
		if (listDes == null) {
			listDes = new De[1];
		} else {
			listDes = new De[listDes.length + 1];
			for (int i = 0; i < listTemp.length; i++) {
				listDes[i] = listTemp[i];
			}
		}

		listDes[listDes.length - 1] = de;
	}

	/**
	 * Substitue un dé par un autre
	 * 
	 * @param de
	 * @param pos
	 */
	public void ReplaceDe(De de, int pos) {
		listDes[pos] = de;
	}

	/**
	 * Crée un itérateur
	 */
	public Iterateur<De> createIterator() {
		try {
			return new Iterateur<De>(listDes);
		} catch (EmptyCollectionException e) {
			return null;
		}
	}

	/**
	 *
	 * @param pos
	 * @return un dé à la position demandée
	 */
	public De getDe(int pos) {
		if (pos >= listDes.length) {
			return null;
		} else {
			return listDes[pos];
		}
	}

	/**
	 * Détruit le dé à la position demandée
	 * 
	 * @param pos
	 */
	public void destroyDe(int pos) {
		De[] listTemp = listDes;
		listDes = new De[listDes.length - 1];

		for (int i = 0; i < pos; i++) {
			listDes[i] = listTemp[i];
		}

		for (int i = pos + 1; i < listTemp.length; i++) {
			listDes[i] = listTemp[i];
		}
	}

	public int length() {
		return listDes.length;
	}
}
