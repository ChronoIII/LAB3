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

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.De;
import frameworkJeuDeDes.Iterateur;

/*
 * Teste les fonctions de CollectionDes
 */
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
