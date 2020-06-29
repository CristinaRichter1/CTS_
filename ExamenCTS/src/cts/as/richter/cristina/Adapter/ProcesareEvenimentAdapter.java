package cts.as.richter.cristina.Adapter;

import cts.as.richter.cristina.clasePrimite.IAlertarePublica;

public class ProcesareEvenimentAdapter extends ProcesareEveniment implements IAlertarePublica{

	@Override
	public void alertaIncendiu(String detalii, float probabilitate) {
		System.out.println("AlertaIncendiu");
	}

	@Override
	public void alertaInundatie(String detalii, float probabilitate) {
		System.out.println("AlertaInundatie");
	}

	@Override
	public void informare(String detalii, float probabilitate) {
		System.out.println("Informare");
	}

}
