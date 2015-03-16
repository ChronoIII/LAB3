package Bunco;

import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Jeu;

public class BuncoStrategie implements IStrategie {
	public static final int NB_TOURS = 6;
	public static final int NB_DES = 3;
	
	private int tour = 1;
	private int similaire;
	private boolean pointNonTour;
	private boolean bunco;
	private int somme=0;

	@Override
	public String calculerLeVainqueur(Jeu jeu) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void calculerScoreTour(Jeu jeu) {
		// TODO Auto-generated method stub
		//utiliser
		//(de1.compareTo(de2)==0) ou quelque chose du genre pour bunco

		jeu.getListDes().createIterator();

		

		do{
			similaire =0;
			pointNonTour = false;
			bunco = true;


			for (int i =0; i<NB_DES; i++){
				jeu.getListDes().getDe(i).rouler();}

			if (Integer.parseInt(jeu.getListDes().getDe(0).getFaceObtenue())==tour){

				similaire++;

			}
			if (Integer.parseInt(jeu.getListDes().getDe(1).getFaceObtenue())==tour){

				similaire++;

			}
			if (Integer.parseInt(jeu.getListDes().getDe(2).getFaceObtenue())==tour){

				similaire++;

			}
			if (similaire == 3){

				bunco = true;

			}

			if (Integer.parseInt(jeu.getListDes().getDe(0).getFaceObtenue())!=tour&&Integer.parseInt(jeu.getListDes().getDe(0).getFaceObtenue()) == Integer.parseInt(jeu.getListDes().getDe(1).getFaceObtenue())&&Integer.parseInt(jeu.getListDes().getDe(1).getFaceObtenue())==Integer.parseInt(jeu.getListDes().getDe(2).getFaceObtenue())){
				
				pointNonTour=true;

			}
			
			tour++;
			
		}while(tour <=6 && similaire !=0 &&!bunco);
		
		//calculer point
		
		if (similaire == 1){
			somme = somme +1;	
		}
		else if (similaire == 2){
			somme = somme +2;	
		}
		else if (bunco){
			somme = somme +21;	
		}else if (pointNonTour){
			somme = somme +5;	
		}
		
		//joueur.setPointage(somme);

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
