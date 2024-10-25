package Ex1;
import java.util.ArrayList;
public class Banque {
	private ArrayList<CompteBancaire> comptes;
	 static String nombercomptes;

    public Banque() {
        comptes = new ArrayList<>();
    }
    public void ajouterCompte(CompteBancaire compte) {
    	comptes.add(compte);
    }
    public CompteBancaire chercherCompte(String numeroCompte) {
    	for (CompteBancaire compte : comptes) {
    		if (compte.getNumeroCompte().equals(numeroCompte)) {
    			return compte;
    		}
    	}
    	 System.out.println("Compte introuvable.");
		    return null;
    }
    public void transfert(String numeroSource, String numeroDest, double montant) {
    	CompteBancaire compteSource = chercherCompte(numeroSource);
    	CompteBancaire compteDest = chercherCompte(numeroDest);
    	 if (compteSource == null) {
    	        System.out.println("Compte source introuvable.");
    	        return;
    	    }
    	 if (compteDest == null) {
    	        System.out.println("Compte destination introuvable.");
    	        return;
    	    }
    	 if (montant <= 0) {
    	        System.out.println("Le montant doit être positif.");
    	        return;
    	    }
    	 if (compteSource.getSolde() < montant) {
    	        System.out.println("Solde insuffisant sur le compte source.");
    	        return;
    	    }
    	    compteSource.retirer(montant); 
    	    System.out.println("Transfert de " + montant + " euros de " + numeroSource + " à " + numeroDest + " effectué avec succès.");
    }
    static void afficherNombreComptes() {
        System.out.println("Nombre total de comptes : " + nombercomptes);
    }
}
