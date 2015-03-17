package Bunco;

import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Joueur;
import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Iterateur;
import frameworkJeuDeDes.Jeu;

public class BuncoStrategie implements IStrategie {
	public static final int NB_TOURS = 6;
	public static final int NB_DES = 3;
	
	private int tour = 1;
	private int similaire;
	private boolean pointNonTour;
	private boolean bunco;
	private int somme = 0;

	@Override
	public String calculerLeVainqueur(Jeu jeu) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void calculerScoreTour(Jeu jeu) {
		//(de1.compareTo(de2)==0) ou quelque chose du genre pour bunco

		tour = jeu.getTour();
		Iterateur<Joueur> i = jeu.getListJoueurs().createIterator();

		while(i.hasNext()){
			System.out.println();
			System.out.println("Joueur : " + i.currentItemPosition());
			do {
				somme = 0;
				similaire = 0;
				pointNonTour = false;
				bunco = false;
				
				//jeu.getListJoueurs().getJoueur(j).jouer(jeu.getListDes());
				i.currentItem().jouer(jeu.getListDes());
				
				System.out.println(i.currentItem().getFacesObtenues()[0] + " " + i.currentItem().getFacesObtenues()[1] + " " + i.currentItem().getFacesObtenues()[2]);
	
				//Comparaison entre les 3 dés et le tour
				if (Integer.parseInt(i.currentItem().getFacesObtenues()[0]) == tour) {
					similaire++;
				}
				
				if (Integer.parseInt(i.currentItem().getFacesObtenues()[1]) == tour) {
					similaire++;
				}
				
				if (Integer.parseInt(i.currentItem().getFacesObtenues()[2]) == tour) {
					similaire++;
				}
				
				//vérification de bunco
				if (similaire == 3) {
					bunco = true;
				}
				
				//vérification 3 dés parail, mais qui ne correspond pas au tour
				if (Integer.parseInt(i.currentItem().getFacesObtenues()[0]) != tour && Integer.parseInt(i.currentItem().getFacesObtenues()[0]) == Integer.parseInt(i.currentItem().getFacesObtenues()[1]) && Integer.parseInt(i.currentItem().getFacesObtenues()[1]) == Integer.parseInt(i.currentItem().getFacesObtenues()[2])) {				
					pointNonTour=true;
				}
				
				//calculer point
				if (similaire == 1) {
					somme = somme +1;	
				} else if (similaire == 2) {
					somme = somme +2;	
				} else if (bunco) {
					somme = somme +21;	
				} else if (pointNonTour) {
					somme = somme +5;	
				}
				
				i.currentItem().ajouterPointage(somme);
			}while(similaire != 0 && !bunco);
			
			System.out.println("pointage :" + i.currentItem().getPointage());
			i.next();
		}
	}


	@Override
	public int getNombreTours() {
		return NB_TOURS;
	}

	@Override
	public int getNombreDes() {
		return NB_DES;
	}
}
