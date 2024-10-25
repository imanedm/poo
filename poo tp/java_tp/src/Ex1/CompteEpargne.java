package Ex1;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret; 
    public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire); 
        this.tauxInteret = tauxInteret; 
    }

    public void calculerInteret() {
        double interet = solde * (tauxInteret / 100); 
        solde += interet; 
        System.out.println("Intérêts ajoutés : " + interet + "dh");
    }
}
