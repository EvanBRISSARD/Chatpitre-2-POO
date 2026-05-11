
public class Classe {
	private String codeClasse;
	private String intitule;
	
	public Classe(String _codeClasse, String _intitule) {
		this.codeClasse = _codeClasse;
		this.intitule = _intitule;
	}
	
	public Classe() {
		this.codeClasse = null;
		this.intitule = null;
	}
	
	public String getCodeClasse() {
		return this.codeClasse;
	}
	
	public String getIntitule() {
		return this.intitule;
	}
}
