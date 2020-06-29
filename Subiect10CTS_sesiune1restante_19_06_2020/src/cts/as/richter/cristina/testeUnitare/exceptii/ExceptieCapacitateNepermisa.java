package cts.as.richter.cristina.testeUnitare.exceptii;

public class ExceptieCapacitateNepermisa extends IllegalArgumentException{
	public String mesaj;

	//constructor
	public ExceptieCapacitateNepermisa(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	//getter
	public String getMesaj() {
		return mesaj;
	}
	
}
