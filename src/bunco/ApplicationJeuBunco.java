/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche, Olivier G�vremont, Am�lie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher
Date cr��: 2015-03-15
Date dern. modif. 2015-03-17
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-15 Version initiale 
2015-03-17 Ajout des fonctions de base.
 *******************************************************/


package bunco;

import javax.swing.JOptionPane;

import frameworkJeuDeDes.*;

/**
 * @author Oliver
 *
 */
public class ApplicationJeuBunco {

	public static void main(String[] args) {
		Jeu jeu = Fabrique.creerJeuBunco(Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre de joueurs.")));
		
		System.out.println("Commencer une partie de bunco");
		
		for (int i = 1; i < (jeu.getNbTours() + 1); i++) {//jouer tous les tours
			jeu.jouerTour(i);
		}
		
		jeu.calculerVainqueurs();
	}
}
