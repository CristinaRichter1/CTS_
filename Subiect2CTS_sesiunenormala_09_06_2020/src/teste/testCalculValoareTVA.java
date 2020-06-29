package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Facturare;
import teste.categorii.Categoria2;
import teste.categorii.CategorieTesteVarsta;
public class testCalculValoareTVA {

	@Test(expected=exceptii.ExceptieFacturaFaraProduse.class)
	@Category(CategorieTesteVarsta.class)
	public void testCalculValoareTVAExistence() {
		Facturare f = new Facturare();
		f.setProduse(null);
		assertNull(f.calculValoareTVA(100d, null));
	}
	
	@Test
	//@Category({CategorieTesteVarsta.class,Categoria2.class})
	public void testCalculValoareTVAExistenceNotNull() {
		//Produs p1 = new Produs("Produs", 10d);
		Facturare f = new Facturare();
		assertNotNull(f.calculValoareTVA(100d, 10d));
	}
	

}
