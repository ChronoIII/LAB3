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
	 * Ajoute un d� � la collection
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
	 * Substitue un d� par un autre
	 * 
	 * @param de
	 * @param pos
	 */
	public void ReplaceDe(De de, int pos) {
		listDes[pos] = de;
	}

	/**
	 * Cr�e un it�rateur
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
	 * @return un d� � la position demand�e
	 */
	public De getDe(int pos) {
		if (pos >= listDes.length) {
			return null;
		} else {
			return listDes[pos];
		}
	}

	/**
	 * D�truit le d� � la position demand�e
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
