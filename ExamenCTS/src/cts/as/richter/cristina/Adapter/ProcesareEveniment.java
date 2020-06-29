package cts.as.richter.cristina.Adapter;

import cts.as.richter.cristina.clasePrimite.IProcesareEveniment;
import cts.as.richter.cristina.clasePrimite.TipEveniment;

public class ProcesareEveniment implements IProcesareEveniment{

	@Override
	public void transmitereMesaj(TipEveniment tip, String detalii, float probabilitate) {
		System.out.println("Evenimentul " + tip + " cu detaliile " + detalii + " are o probabilitate de " + probabilitate);
	}

}
