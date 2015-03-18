package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Iterateur;

public class TestCollectionDes extends TestCase {
	private String[] tabTest = new String[] { "1", "2", "3", "4", "5", "6" };
	private De deTest1 = new De(tabTest);
	private De deTest2 = new De(tabTest);
	private CollectionDes collectionTest = new CollectionDes();

	@Test
	public void testAjouterDe() {
		collectionTest.ajouterDe(deTest1);
		assertEquals(collectionTest.getDe(0).getFaceObtenue(),
				deTest1.getFaceObtenue());
	}

	@Test
	public void testReplaceDe() {
		collectionTest.ajouterDe(deTest1);
		collectionTest.ReplaceDe(deTest2, 0);
		assertEquals(collectionTest.getDe(0).getFaceObtenue(),
				deTest2.getFaceObtenue());
	}

	@Test
	public void testGetDe() {
		collectionTest.ajouterDe(deTest1);
		assertEquals(collectionTest.getDe(0), deTest1);
	}

	@Test
	public void testDestroyDe() {
		collectionTest.ajouterDe(deTest1);
		collectionTest.destroyDe(0);
		assertNull(collectionTest.getDe(0));
	}

}
