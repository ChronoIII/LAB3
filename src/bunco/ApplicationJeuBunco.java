package bunco;

import javax.swing.JOptionPane;

import frameworkJeuDeDes.*;

public class ApplicationJeuBunco {

	public static void main(String[] args) {
		Jeu jeu = Fabrique.creerJeuBunco(Integer.parseInt(JOptionPane
				.showInputDialog("Entrez le nombre de joueurs.")));
		for(int i=0;i<jeu.getNbTours();i++){//jouer tous les tours
			jeu.jouerTour();
		}
		jeu.calculerVainqueur();//ou whatever
	}

}
