package cts.as.richter.cristina.clasePrimite;

import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieGreutateIncarcataNepermisa;
import cts.as.richter.cristina.testeUnitare.exceptii.ExceptieLungimeSirCaractereModelNepermisa;

//class e protected. Daca vreau sa o folosesc in alta parte o fac public
//daca nu vreau sa modific clasa, creez testele in acelasi pachet cu clasele.


//era protected inainte
public class Avion  {
	//greutateaIncarcata se afla in intervalul [0, CAPACITATE].
	//nu are cum sa aiba o greutate mai mare decat capacitatea
	private float greutateaIncarcata;
	//lungima sirului de caractere pentru model este de minim 5.
	private String model;
	//capacitatea este cuprinsa intre 100 si 1000 de tone.
	private final float CAPACITATE;

	public Avion(float greutateaIncarcata, String model, float capacitate) {
		if (greutateaIncarcata < 0 || greutateaIncarcata > 1000) {
			throw new ExceptieGreutateIncarcataNepermisa("Greutate nepermisa");
		}
		this.greutateaIncarcata = greutateaIncarcata;
		
		if (model.length() < 5) {
			throw new ExceptieLungimeSirCaractereModelNepermisa("Model: min 5 caractere.");
		}
		this.model = model;
		this.CAPACITATE = capacitate;
	}
	
	public Avion() {
		this.greutateaIncarcata = 0;
		this.model = null;
		this.CAPACITATE = 100;
	}

	public float getGreutateIncarcata() {
		return greutateaIncarcata;
	}

	public void setGreutateIncarcata(float greutateaIncarcata) {
		//if (greutateaIncarcata < 0 || greutateaIncarcata > 1000) {
		//	throw new ExceptieGreutateIncarcataNepermisa("Greutate nepermisa");
		//}
		this.greutateaIncarcata = greutateaIncarcata;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCapacitate() {
		//if (CAPACITATE < 100 || CAPACITATE > 1000) {
		//	throw new ExceptieCapacitateNepermisa("Capacitate nepermisa.");
		//}
		return CAPACITATE;
	}
	
	public float getPretBilet(int nrPasageri){
		int pretBilet = 100;
		
		if(nrPasageri < 100) {
			return pretBilet;
		}
		else
			if(nrPasageri < 150) {
				return pretBilet * 2;
			}
			else {
				return pretBilet * 3;
			}
	}
	
	public int getNumarLocuriOcupate(boolean[] statusLocuri){
		int nr = -10;
		for(boolean esteOcupat : statusLocuri)
			if(esteOcupat)
				nr += 1;
		return nr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avion [greutate incarcata=");
		builder.append(greutateaIncarcata);
		builder.append(", model=");
		builder.append(model);
		builder.append(", CAPACITATE=");
		builder.append(CAPACITATE);
		builder.append("]");
		return builder.toString();
	}

}