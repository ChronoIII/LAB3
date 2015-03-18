/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche, Olivier Gévremont, Amélie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-03-15
Date dern. modif. 2015-03-17
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-15 Version initiale 
2015-03-17 fonctionnement de base
2015-03-17 vainqueur
2015-03-18 plusieurs vainqueurs
 *******************************************************/

package bunco;

/**
 * @author Oliver
 *
 */
import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Fabrique;
import frameworkJeuDeDes.Joueur;
import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Iterateur;
import frameworkJeuDeDes.Jeu;

public class BuncoStrategie implements IStrategie {
	public static final int NB_TOURS = 6;
	public static final int NB_DES = 3;
	
	private int tour = 0;
	private int similaire;
	private boolean pointNonTour;
	private boolean bunco;
	private int somme = 0;

	@Override
	public String[] calculerLeVainqueurs(Jeu jeu) {
		Iterateur<Joueur> i = jeu.getListJoueurs().createIterator();
		Joueur meneur = i.currentItem();
		int nbVainqueurs = 0;
		String[] nomsVainqueurs;
		//i.next().setPointage(100);;
		//i.currentItem().setPointage(100);
		
		//i = jeu.getListJoueurs().createIterator();
		//qui ont le score le plus grand?
		while(i.hasNext()) {
			Joueur aComparable = i.next();
			if(meneur.compareTo(aComparable) == 1) {
				meneur = aComparable;
			}
		}
		
		//combien ont le même score?
		i = jeu.getListJoueurs().createIterator();
		while(i.hasNext()) {
			Joueur aComparable = i.next();
			if(meneur.compareTo(aComparable) == 0) {
				nbVainqueurs++;
			}
		}
		
		nomsVainqueurs = new String[nbVainqueurs];
		
		//collecter les vainqueur
		int j = 0;
		i = jeu.getListJoueurs().createIterator();
		while(i.hasNext()) {
			Joueur aComparable = i.next();
			if(meneur.compareTo(aComparable) == 0) {
				nomsVainqueurs[j] = aComparable.getNom();
				j++;
			}
		}
		return nomsVainqueurs;
	}

	@Override
	public void calculerScoreTour(Jeu jeu) {
		tour = jeu.getTour();
		Iterateur<Joueur> i = jeu.getListJoueurs().createIterator();

		while(i.hasNext()) {
			System.out.println();
			System.out.println(i.currentItem().getNom());
			
			do {
				//paramètres de base pour calculer le score du joueur, doit être remis à zéro à chaque roulement de dés
				somme = 0;
				similaire = 0;
				pointNonTour = false;
				bunco = false;
				
				i.currentItem().jouer(jeu.getListDes());//faire joueurle joueur
				
				//afficher les résultats des dés
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
				
				//calculer points
				if (similaire == 1) {
					somme = somme +1;	
				} else if (similaire == 2) {
					somme = somme +2;	
				} else if (bunco) {
					somme = somme +21;	
				} else if (pointNonTour) {
					somme = somme +5;	
				}
				
				i.currentItem().ajouterPoints(somme);//ajouter le pointage au joueur
			} while(similaire != 0 && !bunco);
			
			System.out.println("pointage :" + i.currentItem().getPointage());
			i.next();//passer à l'autre joueur
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
