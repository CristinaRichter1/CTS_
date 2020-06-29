package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieGreutateIncarcataNepermisa;

public class TestSetGreutateIncarcata {

	
	/* Subiect testare unitara
	 * Dându-se clasa Avion și restricțiile definite prin comentarii să se implementeze 
	 * teste unitare (toate testele unitare aferente unei metode sunt implementate 
	 * într-un TestCase) care să cuprindă:
	 * 1.	un unit test care să realizeze o testare Boundary pentru setGreutateIncarcata() (1.5p)
	 * 2.	un unit test care să testeze o testare Error Condition pentru setGreutateIncarcata().
	 *  Pentru test se va folosi o excepție custom (1.5p)
	 */
	
	@Test
	public void testSetGreutateIncarcataBounderyInferior() {
		Avion a = new Avion();
		a.setGreutateIncarcata(0);
		assertEquals(0, a.getGreutateIncarcata(), 0.1);
	}
	
	@Test
	public void testSetGreutateIncarcataBounderySuperior() {
		Avion a = new Avion();
		a.setGreutateIncarcata(1000);
		assertEquals(1000, a.getGreutateIncarcata(), 0.1);
	}
	
	@Test(expected=ExceptieGreutateIncarcataNepermisa.class)
	public void testSetGreutateIncarcataErrorCondition() {
		/*
		 * ca sa apelez constructorul cu parametrii care are exceptia,
		 * pentru ca daca apelez constructorul fara param trebuie sa implementez din nou 
		 * exceptia in setGreutateIncarcata() si incalc principiul DRY
		 */
		Avion a = new Avion(1001f, "Boeing", 1001f); 
		a.setGreutateIncarcata(1002);
		assertEquals(1001, a.getGreutateIncarcata(), 0.1);
	}

}
