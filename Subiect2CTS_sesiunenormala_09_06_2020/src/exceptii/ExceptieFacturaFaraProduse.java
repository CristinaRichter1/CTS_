package exceptii;

public class ExceptieFacturaFaraProduse extends IllegalArgumentException{
	public String mesaj;
	
	//constructor
	public ExceptieFacturaFaraProduse(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	//getter
	public String getMesaj() {
		return mesaj;
	}
}
