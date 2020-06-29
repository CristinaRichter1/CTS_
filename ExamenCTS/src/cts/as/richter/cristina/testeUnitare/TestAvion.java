package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.testeUnitare.categorii.CategoriePret;

public class TestAvion {

	@Test
	@Category(CategoriePret.class)
	public void testAvionExistence() {
		Avion a = new Avion(111f, "Boeing", 100);
		assertNotNull(a);
	}

	@Test
	public void testAvionRange() {
		Avion a = new Avion(100f, "Gulfstream", 100);
		assertEquals(100, a.getCapacitate(), 0.01);
	}
}
