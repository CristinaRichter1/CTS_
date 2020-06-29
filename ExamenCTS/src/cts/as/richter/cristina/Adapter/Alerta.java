package cts.as.richter.cristina.Adapter;

import cts.as.richter.cristina.clasePrimite.IAlertarePublica;

public class Alerta implements IAlertarePublica{
	
	@Override
	public void alertaIncendiu(String detalii, float probabilitate) {
		System.out.println("Alerta " +  detalii + " are probabilitatea de " + probabilitate);
	}

	@Override
	public void alertaInundatie(String detalii, float probabilitate) {
		System.out.println("Alerta " +  detalii + " are probabilitatea de " + probabilitate);
	}

	@Override
	public void informare(String detalii, float probabilitate) {
		System.out.println("Informarea " +  detalii + " are probabilitatea de " + probabilitate);
	}

}
