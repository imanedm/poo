package Ex1;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private String numeroCompte;
    protected double solde;
    private String titulaire;
    private List<Transaction> transactions; // List to store transactions

    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = 0;
        this.titulaire = titulaire;
        this.transactions = new ArrayList<>(); // Initialize the transaction list
    }

    public void deposer(double montant) {
        solde += montant; // Update the balance
        transactions.add(new Transaction("Dépôt", montant)); // Record the deposit
    }

    public boolean retirer(double montant) {
        if (solde < montant) {
            System.out.println("suffisant");
            return false;
        }
        solde -= montant; // Update the balance
        transactions.add(new Transaction("Retrait", montant)); // Record the withdrawal
        return true;
    }

    public void affichersolde() {
        System.out.println("le solde est :" + solde + "dh");
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public void afficherTransactions() {
        System.out.println("Transactions pour le compte " + numeroCompte + ":");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
