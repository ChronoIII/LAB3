/******************************************************
Cours:   LOG121
Session: H2015
Groupe: 03
Projet: Laboratoire #3
�tudiant(e)s: Samuel Laroche, Olivier G�vremont, Am�lie Nguyen, Alexemdre Daigle-Sam yeng
              
              
Charg� de cours : Francis Cardinal
Charg� de laboratoire : Patrice Boucher
Date cr��: 2015-2015-03-16
Date dern. modif. 2015-03-16
 *******************************************************
Historique des modifications
 *******************************************************
2015-03-16 Version initiale 
 *******************************************************/

package test;

import org.junit.Test;

import frameworkJeuDeDes.CollectionJoueurs;
import frameworkJeuDeDes.Iterateur;
import frameworkJeuDeDes.Joueur;
import junit.framework.TestCase;

public class TestCollectionJoueurs extends TestCase {
	private CollectionJoueurs collectionTest = new CollectionJoueurs();
	private Joueur joueurTest = new Joueur();
	private Joueur joueurTest2 = new Joueur();

	@Test
	public void testAjouterJoueur() {
		collectionTest.ajouterJoueur(joueurTest);
		assertEquals(joueurTest, collectionTest.getJoueur(0));
	}

	@Test
	public void testReplaceJoueur() {
		collectionTest.ajouterJoueur(joueurTest);
		collectionTest.ReplaceJoueur(joueurTest2, 0);
		assertNotSame(joueurTest, collectionTest.getJoueur(0));
	}

	@Test
	public void testCreateIterator() {
		collectionTest.ajouterJoueur(joueurTest);
		assertNotNull(collectionTest.createIterator());

	}

	@Test
	public void testGetJoueur() {
		collectionTest.ajouterJoueur(joueurTest);
		assertEquals(joueurTest, collectionTest.getJoueur(0));
	}

	@Test
	public void testDestroyJoueur() {
		collectionTest.ajouterJoueur(joueurTest);
		collectionTest.destroyJoueur(0);
		assertNull(collectionTest.getJoueur(0));
	}

}
