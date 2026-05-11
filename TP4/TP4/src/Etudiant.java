import java.time.LocalDate;
import java.time.Period;
/** Description de la classe Etudiant.
 * @author Marielle JOUIN  et Estelle Méret
 * @version 5.0
 */
public class Etudiant extends Personne{
	// attributs privés    
	private Classe classeDeEtudiant;
	
	public Etudiant(String leNom, String lePrenom, int jourNais, int moisNais, int anNais, String laVille, Classe classeDeEtudiant){
		super(leNom,lePrenom,jourNais,moisNais,anNais,laVille);
		this.classeDeEtudiant = classeDeEtudiant;
	}
	
	public Etudiant(String leNom, String lePrenom){
		super(leNom,lePrenom);
		this.classeDeEtudiant = null;
	}
			
	// méthodes publiques  									
	// setters pour modifier les propriétés de l'objet invoqué
	/** setMaClasse() modifie la classe de l'Etudiant
	 * @param nouvMaClasse : la nouveau classe de la l'Etudiant
	 */
	public void setMaClasse(Classe nouvMaClasse){
		this.classeDeEtudiant = nouvMaClasse;
	}
			
	// getters: retournent les caractéristiques de l'objet invoqué
	/** getMaClasse() retourne la classe de l'Etudiant
	 * @return le prénom de l'Etudiant sur lequel est invoquée la méthode
	 */
	public String getMaClasse() {
		String message = null;
		if(this.classeDeEtudiant.getCodeClasse() != null && this.classeDeEtudiant.getIntitule() != null) {
			message = this.classeDeEtudiant.getCodeClasse();
			message += ", "+this.classeDeEtudiant.getIntitule();
		}
		
		return message;
	}
			
	/** toString() retourne les valeur des propriéter
	 * @return propriéter de l'Etudiant sur lequel est invoquée la méthode
	 */
	public String toString() {
		String st = super.toString();
		if(this.classeDeEtudiant != null) {st += "Classe : " +getMaClasse()+"\n";}
		return st;
	}
}

