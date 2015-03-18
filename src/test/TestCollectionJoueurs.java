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
