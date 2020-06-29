package cts.as.richter.cristina.testeUnitare.exceptii;

public class ExceptieLungimeSirCaractereModelNepermisa extends IllegalArgumentException{
	public String mesaj;

	//getter
	public String getMesaj() {
		return mesaj;
	}

	//constructor
	public ExceptieLungimeSirCaractereModelNepermisa(String mesaj) {
		super();
		this.mesaj = mesaj;
	}
}
