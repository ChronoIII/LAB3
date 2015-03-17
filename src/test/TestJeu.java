package test;

import org.junit.Test;

import frameworkJeuDeDes.CollectionDes;
import frameworkJeuDeDes.CollectionJoueurs;
import frameworkJeuDeDes.IStrategie;
import frameworkJeuDeDes.Jeu;
import junit.framework.TestCase;

public class TestJeu extends TestCase {
	private IStrategie strategie;
	private CollectionJoueurs listJoueurs;
	private CollectionDes listDes;

	@Test
	public void testJeu() {
		Jeu jeuTest=new Jeu(strategie, listJoueurs, listDes);
		assertNotNull(jeuTest);
	}

	@Test
	public void testJouerTour() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculerVainqueur() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTour() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTour() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNbTours() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNbTours() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListJoueurs() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetListJoueurs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListDes() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetListDes() {
		fail("Not yet implemented");
	}

}
