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

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.CollectionJoueurs;
import frameworkJeuDeDes.Fabrique;
import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Jeu;
import frameworkJeuDeDes.Joueur;
import junit.framework.TestCase;

public class TestJeu extends TestCase {
	private Fabrique fabriqueTest = new Fabrique();
	private Jeu jeuTest = fabriqueTest.creerJeuBunco(3);

	@Test
	public void testGetNbTours() {
		jeuTest.jouerTour(1);
		assertEquals(jeuTest.getNbTours(), 6);
	}

	@Test
	public void testJeu() {
		assertNotNull(jeuTest);
	}

	@Test
	public void testJouerTour() {
		jeuTest.jouerTour(1);
		assertNotNull(jeuTest.getTour());
	}

	@Test
	public void testCalculerVainqueur() {
		jeuTest.calculerVainqueurs();
		assertNotNull(jeuTest.getNomsVainqueurs());
	}

	@Test
	public void testGetTour() {
		jeuTest.jouerTour(1);
		assertEquals(jeuTest.getTour(), 1);
	}

	@Test
	public void testSetTour() {
		jeuTest.jouerTour(1);
		jeuTest.setTour(3);
		assertEquals(jeuTest.getTour(), 3);
	}

	@Test
	public void testSetNbTours() {
		jeuTest.setTour(3);
		assertEquals(jeuTest.getTour(), 3);
	}

	@Test
	public void testGetListJoueurs() {
		assertNotNull(jeuTest.getListJoueurs());
	}

	@Test
	public void testSetListJoueurs() {
		Joueur joueur1 = new Joueur();
		CollectionJoueurs collectionTest = new CollectionJoueurs();
		jeuTest.setListJoueurs(collectionTest);
		assertEquals(jeuTest.getListJoueurs(), collectionTest);
	}

	@Test
	public void testGetListDes() {
		assertNotNull(jeuTest.getListDes());
	}

	@Test
	public void testSetListDes() {
		CollectionDes collectionDeTest = new CollectionDes();
		jeuTest.setListDes(collectionDeTest);
		assertEquals(collectionDeTest, jeuTest.getListDes());

	}

}
