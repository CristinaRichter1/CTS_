package cts.as.richter.cristina.testeUnitare.exceptii;

public class ExceptieAvionFaraGreutate extends IllegalArgumentException {
	public String mesaj;

	public ExceptieAvionFaraGreutate(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}	
}
