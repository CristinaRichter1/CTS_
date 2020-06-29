package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Produs;
import teste.categorii.CategorieTesteVarsta;

public class testeSetPret {

	@Test
	@Category(CategorieTesteVarsta.class)
	public void testSetPretRangeRight() {
		Produs p = new Produs();
		p.setPret(100d, 1);
		assertEquals(100d, p.getPret().doubleValue(), 0.1);
	}
	
	@Test
	public void testSetPretRangeBoundaryInferior() {
		Produs p = new Produs("Produs1", 10d);
		//Produs p = new Produs();
		p.setPret(2d, 2);
		assertEquals(1d, p.getPret().doubleValue(), 0.1);
	}
	
	@Test
	public void testSetPretRangeRightDefault() {
		Produs p = new Produs();
		p.setPret(1000d, -1);
		assertEquals(1000d, p.getPret().doubleValue(), 0.1);
	}

	@Test
	public void testSetPretRangeBoundarySuperior() {
		Produs p = new Produs();
		p.setPret(1000d, 2);
		assertEquals(500d, p.getPret().doubleValue(), 0.1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetPretRangeValoareNegativa() {
		Produs p = new Produs();
		p.setPret(-20d, 2);
		assertEquals(500d, p.getPret().doubleValue(), 0.1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetPretRangeValoareFoarteMare() {
		Produs p = new Produs();
		p.setPret(1010d, 2);
		assertEquals(505d, p.getPret().doubleValue(), 0.1);
	}
	
	
}
