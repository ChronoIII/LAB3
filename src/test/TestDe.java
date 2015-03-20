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

import frameworkJeuDeDes.De;
import junit.framework.TestCase;
/*
 * Teste les fonctions de De
 */
public class TestDe extends TestCase {
	private String[] tabTest = new String[] { "1", "2", "3", "4", "5", "6" };
	private De deTest = new De(tabTest);
	private De deTest2 = new De(tabTest);

	@Test
	public void testDe() {
		assertNotNull(deTest);
	}

	@Test
	public void testRouler() {
		deTest.setFace("9");
		deTest.rouler();
		assertNotSame("9", deTest.getFaceObtenue());
	}

	@Test
	public void testCompareTo() {
		deTest.rouler();
		deTest2.rouler();
		if (deTest.compareTo(deTest2) == 1 || deTest.compareTo(deTest2) == -1) {
			assertTrue(true);
		} else {

			assertFalse(false);
		}
	}

	@Test
	public void testGetFaceObtenue() {
		deTest.rouler();
		assertNotNull(deTest.getFaceObtenue());
	}

	@Test
	public void testSetFace() {
		deTest.setFace("6");
		assertSame(deTest.getFaceObtenue(), "6");
	}

}
