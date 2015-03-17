package Bunco;

import javax.swing.JOptionPane;

import frameworkJeuDeDes.*;

public class ApplicationJeuBunco {

	public static void main(String[] args) {
		Jeu jeu = Fabrique.creerJeuBunco(Integer.parseInt(JOptionPane
				.showInputDialog("Entrez le nombre de joueurs.")));
		System.out.println("Commencer une parti de bunco");
		for (int i = 1; i < (jeu.getNbTours() + 1); i++) {//jouer tous les tours
			jeu.jouerTour(i);
		}
		
		//jeu.calculerVainqueur();//ou whatever
	}
}
