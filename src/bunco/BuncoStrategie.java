package bunco;

import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Jeu;

public class BuncoStrategie implements IStrategie {
	public static final int NB_TOURS = 6;
	public static final int NB_DES = 3;

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
