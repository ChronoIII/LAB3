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

import frameworkJeuDeDes.Fabrique;
import junit.framework.TestCase;
/*
 * Teste les fonctions de Fabrique
 */
public class TestFabrique extends TestCase {
	private String[] tabTest = new String[] { "1", "2", "3", "4", "5", "6" };

	@Test
	public void testCreerJeuBunco() {
		assertNotNull(Fabrique.creerJeuBunco(3));
	}

	@Test
	public void testCreerJoueurs() {
		assertNotNull(Fabrique.creerJoueurs(3));
	}

	@Test
	public void testCreerJoueur() {
		assertNotNull(Fabrique.creerJoueur());
	}

	@Test
	public void testCreerDesClassiques() {
		assertNotNull(Fabrique.creerDesClassiques(6));
	}

	@Test
	public void testCreerDeClassique() {
		assertNotNull(Fabrique.creerDeClassique());
	}

	@Test
	public void testCreerDe() {
		assertNotNull(Fabrique.creerDe(tabTest));
	}

}
