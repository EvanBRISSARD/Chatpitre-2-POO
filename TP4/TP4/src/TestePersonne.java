
public class TestePersonne {
    public static void main(String[] args)
    {
    	Classe classe1 = new Classe("BTS","SIO1");
    	
    	//Personne personne1 = new Personne("Alice", "Pauche", 8, 01, 2007, "ingres");
    	Personne personne1 = new Personne("Alice", "Pauche");
    			
    	//Etudiant etudiant1 = new Etudiant("Paul", "lardon", 31, 5, 2006, "Orleans", classe1);
    	Etudiant etudiant1 = new Etudiant("Paul", "lardon");
    	
    	//Professeur professeur1 = new Professeur("Adram", "cosmo", 4, 11, 1986, "Saran", "Homme", 11, 6, 2012 );
    	Professeur professeur1 = new Professeur("Adram", "cosmo");
    	
    	System.out.println(personne1);
    	System.out.println(etudiant1);
    	System.out.println(professeur1);
    }
}
