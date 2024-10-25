package Ex1;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise; 


    public CompteCourant(String numeroCompte, String titulaire, double decouvertAutorise) {
        super(numeroCompte, titulaire);
        this.decouvertAutorise = decouvertAutorise; 
    }
    public boolean retirer(double montant) {
        if (solde + decouvertAutorise < montant) {
            System.out.println("Retrait refusé : le montant dépasse le découvert autorisé.");
            return false;
        }
        solde -= montant;
        System.out.println("Montant retiré : " + montant);
        return true;
    }
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }
}
