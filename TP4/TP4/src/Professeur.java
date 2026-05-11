import java.time.LocalDate;

public class Professeur extends Personne {
	
	// attributs privés 
	private String sexs;
	private LocalDate dateEmbauche;
	
	
	public Professeur(String leNom, String lePrenom, int jourNais, int moisNais, int anNais, String laVille, String leSexs, int jourEmbauche, int moisEmbauche, int anEmbauche) {
		super(leNom, lePrenom, jourNais, moisNais, anNais, laVille);
		this.sexs = leSexs;
		this.dateEmbauche = LocalDate.of(anEmbauche,moisEmbauche,jourEmbauche);
	}
	
	public Professeur(String leNom, String lePrenom) {
		super(leNom, lePrenom);
		this.sexs = null;
	}
	
	// getters: retournent les caractéristiques de l'objet invoqué
		/** getMaClasse() retourne la classe de l'Etudiant
		 * @return le prénom de l'Etudiant sur lequel est invoquée la méthode
		 */
		public String getSexe() {
			return this.sexs;
		}
	
		/** getMaClasse() retourne la classe de l'Etudiant
		 * @return le prénom de l'Etudiant sur lequel est invoquée la méthode
		 */
		public LocalDate getDateEmbauche() {
			return this.dateEmbauche;
		}
			
	
	/** toString() retourne les valeur des propriéter
	 * @return propriéter de l'Etudiant sur lequel est invoquée la méthode
	 */
	public String toString() {
		String st = super.toString();
		if (getSexe() != null) {st += "Sexs : " +getSexe()+"\n";}
		if (getDateEmbauche() != null) {st += "la Date Embauche : " +getDateEmbauche()+"\n";}
		return st;
	}
}