package test;

import org.junit.Test;

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Iterateur;
import junit.framework.TestCase;
/*
 * Teste les fonctions de Iterateur
 */
public class TestIterateur extends TestCase {
	private CollectionDes collectionTest = new CollectionDes();
	private String[] tabTest = new String[] { "1", "2", "3", "4", "5", "6" };
	private De deTest1 = new De(tabTest);
	private De deTest2 = new De(tabTest);

	@Test
	public void testIterateur() {
		collectionTest.ajouterDe(deTest1);
		assertNotNull(collectionTest.createIterator());
	}

	@Test
	public void testNext() {
		collectionTest.ajouterDe(deTest1);
		collectionTest.ajouterDe(deTest2);
		Iterateur iterateurTest = collectionTest.createIterator();
		iterateurTest.next();
		assertEquals(iterateurTest.next(), deTest2);
	}

	@Test
	public void testHasNext() {
		collectionTest.ajouterDe(deTest1);
		Iterateur iterateurTest = collectionTest.createIterator();
		iterateurTest.next();
		assertFalse(iterateurTest.hasNext());
	}

	@Test
	public void testCurrentItem() {
		collectionTest.ajouterDe(deTest1);
		Iterateur iterateurTest = collectionTest.createIterator();
		assertNotNull(iterateurTest.currentItem());
	}

	@Test
	public void testCurrentItemPosition() {
		collectionTest.ajouterDe(deTest1);
		Iterateur iterateurTest = collectionTest.createIterator();
		assertEquals(iterateurTest.currentItemPosition(), 0);
	}

}
