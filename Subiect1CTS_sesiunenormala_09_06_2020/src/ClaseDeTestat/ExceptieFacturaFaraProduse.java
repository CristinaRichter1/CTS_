package ClaseDeTestat;

public class ExceptieFacturaFaraProduse extends IllegalArgumentException{
	
	public String mesaj;

	//getter
	public String getMesaj() {
		return mesaj;
	}

	//constructor
	public ExceptieFacturaFaraProduse(String mesaj) {
		super();
		this.mesaj = mesaj;
	}
}
