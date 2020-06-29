package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.testeUnitare.categorii.CategoriePret;

public class TestGetPretBilet {

	@Test
	@Category(CategoriePret.class)
	public void testGetPretBiletBounderyInferior() {
		Avion a = new Avion(100f, "Boeing", 105);
		assertEquals(100, a.getPretBilet(1), 0.1);
	}
	
	@Test
	public void testGetPretBiletRight() {
		Avion a = new Avion(100f, "Boeing", 105);
		assertEquals(200, a.getPretBilet(149), 0.1);
	}
	
	@Test
	public void testGetPretBiletRight2() {
		Avion a = new Avion(100f, "Boeing", 105);
		assertEquals(300, a.getPretBilet(151), 0.1);
	}
}
