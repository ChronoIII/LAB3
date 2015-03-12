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
public class CollectionDes implements Agregat{
	
	De[] listDes;
	
	public void ajouterDe(De de) {
		De[] listTemp = listDes;
		listDes = new De[listDes.length + 1];
		
		for(int i = 0; i < listTemp.length; i++) {
			listDes[i] = listTemp[i];
		}
		
		listDes[listDes.length - 1] = de;
	}
	
	public void ReplaceDe(De de, int pos) {
		listDes[pos] = de;
	}
	
	public void createItarator() {
		
	}
	
	public De getDe(int pos) {
		return listDes[pos];
	}
	
	public void destroyDe(int pos) {
		De[] listTemp = listDes;
		listDes = new De[listDes.length - 1];
		
		for(int i = 0; i < pos; i++) {
			listDes[i] = listTemp[i];
		}
		
		for(int i = pos + 1; i < listTemp.length; i++) {
			listDes[i] = listTemp[i];
		}
	}
}
