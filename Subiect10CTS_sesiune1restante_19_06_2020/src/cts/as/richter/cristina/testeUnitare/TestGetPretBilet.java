package cts.as.richter.cristina.testeUnitare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import cts.as.richter.cristina.clasePrimite.Avion;
import cts.as.richter.cristina.interfete.ITesteUnitarePret;

public class TestGetPretBilet {

	/*
	 * la examen nu e nevoie sa faci toate testele astea.
	 * Trebuie sa le faci doar atatea teste ca aceasta metoda 
	 * sa aiba coverage de 100%
	 * Right BICEP -> Right (OK si pentru CORRECT -> Range)
	 * verifica daca rezultatele furnizate de metoda sunt corecte
	 */
	
	@Test
	@Category({ITesteUnitarePret.class})
	public void testGetPretBiletRightNrMicPasageri() {
		Avion a = new Avion(1f, "Boeing", 100f);
		String message = "Pret incorect";
		float expected = 100;
		int numarPasageri = 1;//nr pas < 100
		float actual = a.getPretBilet(numarPasageri); 
		assertEquals(message, expected, actual, 0.1);
	}
	
	@Test
	public void testGetPretBiletRight149Pasageri() {
		Avion a = new Avion(1f, "Boeing", 100f);
		String message = "Pret incorect";
		float expected = 200;
		int numarPasageri = 149;//nr pas < 150
		float actual = a.getPretBilet(numarPasageri); 
		assertEquals(message, expected, actual, 0.1);
	}
	
	@Test
	public void testGetPretBiletRight151Pasageri() {
		Avion a = new Avion(1f, "Boeing", 100f);
		assertEquals(300, a.getPretBilet(150), 0.1);
	}
	
	/*
	 * Right BICEP - Boundary (OK si pentru CORRECT -> Range)
	 * verifica daca limitele sunt definite corect
	 */
	
	@Test
	public void testGetPretBiletBoundaryInferior() {
		Avion a = new Avion(100f, "Boeing", 100f);
		assertEquals(100, a.getPretBilet(99), 0.1);
	}
	
	@Test
	public void testGetPretBiletBoundary() {
		Avion a = new Avion(100f, "Boeing", 100f);
		assertEquals(300, a.getPretBilet(150), 0.1); 
	}
	
	/*
	 * Right BICEP - Inverse Relationship
	 * Verifica corectitudinea rezultatului furnizat de metoda testata prin compararea
	 * acestuia cu toate posibilele rezultate care nu trebuie sa fie returnate de metoda
	 * in functie de parametrii de intrare stabiliti
	 */
	
	@Test
	public void testGetPretBiletInverseRelationship() {
		
	}
	
	
	/*
	 * Right BICEP - Cross-check, se verifica corectitudinea metodei prin testarea
	 * rezultatului furnizat de o metoda care proceseaza aceeasi cerinta folosind alt algoritm.
	 */
	
	
	/*
	 * Right BICEP - Error-conditions, verifica metoda prin testarea cu parametri de intrare
	 * care ar putea genera erori.
	 */
	
	
	/*
	 * Performance, verifica daca metoda furnizeaza rezultatul corect intr-o limita de timp 
	 * stabilita anterior
	 * 
	 */
}
