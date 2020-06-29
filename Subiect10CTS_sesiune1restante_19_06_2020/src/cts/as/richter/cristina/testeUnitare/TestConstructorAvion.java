package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieGreutateIncarcataNepermisa;
import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieLungimeSirCaractereModelNepermisa;

public class TestConstructorAvion {
	
	/*
	 * 3.	un unit test de tip Existence pentru constructorul cu parametri (1.5p)
	 * 4.	un unit test de verificare de tip Range pentru constructorul cu parametri;(1.5p)
	 */
	
	/******************************
	 * Right -> teste corectitudine
	 ******************************/
	@Test
	public void testConstructorParametriiRight() {
		new Avion(105f, "Boeing", 100f);
	}


	@Test
	public void testAvionExistence() {
		Avion a = new Avion(100f, "Boeing", 100f);
		assertNotNull(a);
	}
	
	@Test
	public void testAvionRangeBounderySuperior() {
		Avion a = new Avion(1000f, "Boeing", 1000f);
		assertEquals(1000f, a.getGreutateIncarcata(), .1);
	}

	@Test
	public void testAvionRangeGreutateBounderyInferior() {
		Avion a = new Avion(0f, "Boeing", 1000f);
		assertEquals(0f, a.getGreutateIncarcata(), .1);
	}
	
	@Test(expected=ExceptieGreutateIncarcataNepermisa.class)
	public void testAvionRangeGreutateValoareNegativa() {
		Avion a = new Avion(-1f, "Boeing", 1000f);
		assertEquals(-1f, a.getGreutateIncarcata(), .1);
	}
	
	@Test(expected=ExceptieGreutateIncarcataNepermisa.class)
	public void testAvionRangeGreutateValoarePreaMare() {
		Avion a = new Avion(1001f, "Boeing", 1000f);
		assertEquals(1001f, a.getGreutateIncarcata(), .1);
	}
	
	@Test(expected=ExceptieLungimeSirCaractereModelNepermisa.class)
	public void testAvionRangeDenumireModelPreaScurta() {
		Avion a = new Avion(100f, "Boei", 1000f);
		assertEquals("Boei", a.getModel());
	}
}
