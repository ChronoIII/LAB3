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
2015-03-10 Ajout des fonctions de base.
 *******************************************************/

package frameworkJeuDeDes;

/**
 * @author Samuel
 *
 */
public class Iterateur<T> {
	private int position;
	private T[] items;

	public Iterateur(T[] aItems) throws EmptyCollectionException {
		items = aItems;
		position = 0;
		if (aItems.length == 0) {
			throw new EmptyCollectionException();
		}
	}

	/**
	 * 
	 * @return le prochain De
	 */
	public T next() {
		if (position == items.length) {
			position = 0;// si on a dépassé la fin du tableau, on recommence
		}
		T next = items[position];
		position++;
		return next;
	}

	/**
	 * 
	 * @return true s'il y a un prochain item avant la fin de la liste
	 */
	public boolean hasNext() {
		return (position < items.length);
	}

	/**
	 * 
	 * @return l'item courant
	 */
	public T currentItem() {
		return items[position];
	}
	
	public int currentItemPosition() {
		return position;
	}
}
