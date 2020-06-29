package ClaseDeTestat.Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ClaseDeTestat.Produs;
import ClaseDeTestat.Teste.Categorii.CategorieTesteVarsta;

public class testSetter {

	@Test
	@Category(CategorieTesteVarsta.class)
	public void testSetPretRightCase1() {
		Produs p = new Produs();
		p.setPret(10.0, 1);
		
		assertTrue(p.getPret() == 10);
	}
	
	@Test
	public void testSetPretRightCase2() {
		Produs p = new Produs();
		p.setPret(10.0, 2);
		
		assertTrue(p.getPret() == 5);
	}
	
	@Test
	public void testSetPretRightDefault() {
		Produs p = new Produs();
		p.setPret(10.0, -1);
		
		assertTrue(p.getPret() == 10);
	}
	
	@Test
	public void testSetPretBoundaryInferior() {
		Produs p = new Produs();
		p.setPret(1.0, 1);
		assertEquals(1.0d, p.getPret().doubleValue(), 0.1);
	}
	
	@Test
	public void testSetPretBoundarySuperior() {
		Produs p = new Produs();
		p.setPret(1000d, 2);
		assertEquals(500.0d, p.getPret().doubleValue(), 0.1);
	}

	//ordinea inserarii produselor p1 < p2 in functie de pret
	@Test
	public void testGetPretOrder() {
		Produs p1 = new Produs("ADenumire", 10d);
		Produs p2 = new Produs("ODenumire", 20d);
		
		assertTrue(p1.getPret() < p2.getPret());	
	}
	
	//ordinea inserarii produselor p1 > p2 in functie de pret
	@Test
	public void testGetPretOrder2() {
		Produs p1 = new Produs("ADenumire", 30d);
		Produs p2 = new Produs("ODenumire", 20d);
		
		assertTrue(p1.getPret() > p2.getPret());
	}
}
