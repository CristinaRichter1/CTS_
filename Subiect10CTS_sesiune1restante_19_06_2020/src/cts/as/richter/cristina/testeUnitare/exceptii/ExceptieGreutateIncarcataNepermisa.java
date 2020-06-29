package cts.as.richter.cristina.testeUnitare.exceptii;

public class ExceptieGreutateIncarcataNepermisa extends IllegalArgumentException{
	public String message;

	//getter
	public String getMessage() {
		return message;
	}

	//constructor
	public ExceptieGreutateIncarcataNepermisa(String message) {
		super();
		this.message = message;
	}
	
	
}
