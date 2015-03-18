package test;

import org.junit.Test;

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Joueur;
import junit.framework.TestCase;

public class TestJoueur extends TestCase {
	private String[] tabTest = new String[] { "1", "2", "3", "4", "5", "6" };
	private CollectionDes collectionTest = new CollectionDes();
	private De deTest = new De(tabTest);
	private Joueur joueurTest = new Joueur();
	private Joueur joueurTest2 = new Joueur();

	@Test
	public void testJoueur() {
		Joueur joueurTest = new Joueur();
		assertEquals(joueurTest.getPointage(), 0);
	}

	@Test
	public void testJouer() {
		String[] facesTest = new String[3];
		for (int i = 0; i < 3; i++) {
			collectionTest.ajouterDe(deTest);
			joueurTest.jouer(collectionTest);
		}
		for (int i = 0; i < 3; i++) {
			facesTest[i] = collectionTest.getDe(i).getFaceObtenue();
		}
		assertNotSame(joueurTest.getFacesObtenues(), facesTest);
	}

	@Test
	public void testCompareTo() {
		int comparer1 = 0;
		int comparer2 = 0;
		joueurTest.ajouterPointage(1);
		joueurTest2.ajouterPointage(2);
		joueurTest.compareTo(joueurTest2);
		if (comparer1 != comparer2) {
			if (joueurTest.compareTo(joueurTest2)
					+ joueurTest2.compareTo(joueurTest) == 0) {
				assertTrue(true);
			}
		}
	}

	@Test
	public void testGetPointage() {
		assertNotNull(joueurTest.getPointage());
	}

	@Test
	public void testGetFacesObtenues() {
		collectionTest.ajouterDe(deTest);
		joueurTest.jouer(collectionTest);
		assertNotNull(joueurTest.getFacesObtenues());
	}

}
