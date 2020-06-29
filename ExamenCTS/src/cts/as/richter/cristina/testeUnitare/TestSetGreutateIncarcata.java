package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.testeUnitare.categorii.CategoriePret;
import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieAvionFaraGreutate;

public class TestSetGreutateIncarcata {

	@Test
	@Category(CategoriePret.class)
	public void testSetGreutateIncarcataBoundaryInferior() {
		Avion a = new Avion(100f, "Gulfstream", 100);
		a.setGreutateIncarcata(0);
		assertEquals(0, a.getGreutateaIncarcata(), 0.01);
	}
	
	@Test
	public void testSetGreutateIncarcataBoundarySuperior() {
		Avion a = new Avion(100f, "Gulfstream", 100);
		a.setGreutateIncarcata(100);
		assertEquals(100, a.getGreutateaIncarcata(), 0.01);
	}
	
	@Test(expected=ExceptieAvionFaraGreutate.class)
	public void testSetGreutateIncarcataErrorCondition() {
		Avion a = new Avion(-1, "Gulfstream", 100);
		a.setGreutateIncarcata(-1);
	}
}
