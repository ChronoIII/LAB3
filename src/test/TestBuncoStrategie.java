/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
Étudiant(e)s: Samuel Laroche, Olivier Gévremont, Amélie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Chargé de cours : Francis Cardinal
Chargé de laboratoire : Patrice Boucher
Date créé: 2015-2015-03-16
Date dern. modif. 2015-03-16
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-16 Version initiale 
 *******************************************************/
package test;

import org.junit.Test;

import bunco.BuncoStrategie;
import frameworkJeuDeDes.Fabrique;
import frameworkJeuDeDes.Jeu;
import junit.framework.TestCase;
/*
 * Teste les fonctions de BuncoStrategie
 */
public class TestBuncoStrategie extends TestCase {
	private BuncoStrategie stratTest = new BuncoStrategie();

	@Test
	public void testCalculerLeVainqueurs() {
		assertNotNull(stratTest.calculerLeVainqueurs(Fabrique.creerJeuBunco(3)));
	}

	@Test
	public void testCalculerScoreTour() {
		Jeu jeuTest = Fabrique.creerJeuBunco(3);

		int scoreTemp = jeuTest.getListJoueurs().getJoueur(0).getPointage();
		int i = 1;
		while (scoreTemp == jeuTest.getListJoueurs().getJoueur(0).getPointage()) {
			jeuTest.jouerTour(i);
			i++;
		}

		stratTest.calculerScoreTour(jeuTest);

		assertNotSame(scoreTemp, jeuTest.getListJoueurs().getJoueur(0)
				.getPointage());
	}

	@Test
	public void testGetNombreTours() {
		Jeu jeuTest = Fabrique.creerJeuBunco(3);
		jeuTest.jouerTour(1);
		assertEquals(jeuTest.getNbTours(), stratTest.getNombreTours());
	}

	@Test
	public void testGetNombreDes() {
		assertNotNull(stratTest.getNombreDes());
	}

}
