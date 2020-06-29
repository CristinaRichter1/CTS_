package ClaseDeTestat.Teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ClaseDeTestat.ExceptieFacturaFaraProduse;
import ClaseDeTestat.Facturare;
import ClaseDeTestat.Produs;
import ClaseDeTestat.Teste.Categorii.Categoria2;
import ClaseDeTestat.Teste.Categorii.CategorieTesteVarsta;


public class testCalculValoareTVA{
	//Facturare f = new Facturare();
	//Produs p1;
	//Produs p2;

	@Test(expected=ExceptieFacturaFaraProduse.class)
	@Category(CategorieTesteVarsta.class)
	public void testCalculValoareTVAExistenceNull() {
		Produs p1 = new Produs();
		Facturare f = new Facturare();
		f.setProduse(null);
		assertNull(f.calculValoareTVA(100d, null));
	}
	
	@Test
	@Category({CategorieTesteVarsta.class,Categoria2.class})
	public void testCalculValoareTVAExistenceNotNull() {
		//Produs p1 = new Produs("Produs", 10d);
		Facturare f = new Facturare();
		assertNotNull(f.calculValoareTVA(100d, 10d));
	}
	
	@Test()
	public void testCalculValoareTVAInverse() {
		Facturare f = new Facturare();
		double valoareFacturaFaraTVA=200;
		double valoareTVA = 0.19;
		double actual_result = f.calculValoareTVA(200d, 0.19);
		double expected_result = actual_result/valoareTVA;
		assertEquals(expected_result, valoareFacturaFaraTVA, 0.1);
	}
	
}
