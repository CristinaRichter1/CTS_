
//enumerarea se poate muta intr-o clasa separata
enum TipActiune {
	DOWNLOAD, LINK
}

public interface IAntivirus {
	//url-ul contine link-ul noii pagini sau numele fisierului de descarcat
	public void verificaActiuneUser(TipActiune tip, String url);
}
