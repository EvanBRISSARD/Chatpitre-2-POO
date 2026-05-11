import java.time.LocalDate;
import java.time.Period;

public class Personne {
	// attributs privés 
	private String nom;
	private String prenom;
	private LocalDate dateNais;
	private String maVille;
	
	// constructeurs
	// constructeur 1
		/** crée un nouvel Personne avec un nom, un prénom et sa date de naissance
		 * @param leNom : le nom de la Personne
		 * @param lePrenom : le prénom de la Personne
		 * @param jourNais: le jour de naissance de la Personne
		 * @param moisNais: le mois de naissance de la Personne
		 * @param anNais: l'année de naissance de la Personne
		 */
		public Personne(String leNom, String lePrenom, int jourNais, int moisNais, int anNais ){
			this(leNom,lePrenom);
			this.dateNais = LocalDate.of(anNais,moisNais,jourNais);
		}
		
		// constructeur 2 (moins complet) permet de créer une Personne sans définir sa date de naissance
		/** crée un nouvel une Personne avec un nom et un prénom
		 * @param leNom : le nom de la Personne
		 * @param lePrenom : le prénom de la Personne
		 */
		public Personne(String leNom, String lePrenom){
			this.nom = leNom;
			this.prenom = lePrenom;
		}
		
		// constructeur 3
		/** crée un nouvel Personne avec un nom, un prénom et sa date de naissance
		* @param leNom : le nom de la Personne
		* @param lePrenom : le prénom de la Personne
		* @param jourNais: le jour de naissance de la Personne
		* @param moisNais: le mois de naissance de la Personne
		* @param anNais: l'année de naissance de la Personne
		* @param laVille: la ville de la Personne
		*/
		public Personne(String leNom, String lePrenom, int jourNais, int moisNais, int anNais, String laVille ){
			this(leNom,lePrenom,jourNais,moisNais,anNais);
			this.maVille = laVille;
		}
		
		// méthodes publiques  									
		// setters pour modifier les propriétés de l'objet invoqué
		/** setNom() modifie le nom de la Personne
		 * @param nouvNom : le nouveau nom de la Personne
		 */
		public void setNom(String nouvNom){
			this.nom = nouvNom;
		}
		/** setPrenom() modifie le prenom de la Personne
		 * @param nouvPrenom : le nouveau prenom de la Personne
		 */
		public void setPrenom(String nouvPrenom){
			this.prenom = nouvPrenom;
		}
		/** setDateNais() modifie la date de naissance de la Personne
		 * @param nouvJour le nouveau jour de naissance de la Personne
		 * @param nouvMois le nouveau mois de naissance de la Personne
		 * @param nouvAn la nouvelle année de naissance de la Personne
		 */
		public void setDateNais(int nouvJour, int nouvMois, int nouvAn){
			this.dateNais=LocalDate.of(nouvAn,nouvMois,nouvJour);
		}
		/** setMaVille() modifie la ville de la Personne
		 * @param nouvVille : la nouveau ville de la Personne
		 */
		public void setMaVille(String nouvVille){
			this.maVille = nouvVille;
		}

		// getters: retournent les caractéristiques de l'objet invoqué
		/** getNom() retourne le nom de la Personne
		 * @return le nom de la Personne sur lequel est invoquée la méthode
		 */
		public String getNom() {
			return this.nom;
		}
		/** getPrenom() retourne le prénom de la Personne
		 * @return le prénom de la Personne sur lequel est invoquée la méthode
		 */
		public String getPrenom() {
			return this.prenom;
		}
		/** getDateNais() retourne la date de naissance de la Personne
		 * @return la date de naissance de la Personne 
		 */
		public LocalDate getdateNais() {
			return this.dateNais;
		}
		/** getMaVille() retourne la ville de la Personne
		 * @return la ville de la Personne sur lequel est invoquée la méthode
		 */
		public String getMaVille() {
			return this.maVille;
		}

		/** calculAge() retourne l'âge de la Personne
		 * @return l'âge de la Personne sur lequel est invoquée la méthode
		 */
		public int calculAge(){
			LocalDate today = LocalDate.now();
			LocalDate birthday = this.dateNais;
			Period p = Period.between(birthday, today);
			return p.getYears();
		}
		
		/** toString() retourne les valeur des propriéter
		 * @return propriéter de la Personne sur lequel est invoquée la méthode
		 */
		public String toString() {
			String st = "**************************************\n";
			st += "nom : " +getNom()+"\n";
			st += "prenom : " +getPrenom()+"\n";
			if(getdateNais() != null) {st += "dateNais : " +getdateNais()+"\n";}
			if(getMaVille() != null) {st += "ville : " +getMaVille()+"\n";}
			return st;
		}
}
