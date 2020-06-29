
public abstract class PhotoImage {
	protected int inaltime;
	protected int lungime;
	protected String culoareDeBaza;
	
	public abstract void resize(float procentResize);
	public abstract void aplicaFiltruCuloare(String culoare);
}
