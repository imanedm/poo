package Ex1;

public class BanqueTes {

    public static void main(String[] args) {
        Banque banque = new Banque();
        CompteBancaire compte1 = new CompteBancaire("001", "Alice");
        CompteBancaire compte2 = new CompteBancaire("002", "Bob");
        CompteBancaire compte3 = new CompteBancaire("003", "Charlie");
        CompteCourant compteCourant1 = new CompteCourant("123456", "Imane", 500);
        CompteEpargne compteEpargne1 = new CompteEpargne("654321", "Ali", 3.5);

        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);
        banque.ajouterCompte(compte3);

        compte1.deposer(1000);
        compte2.deposer(500);
        compte1.retirer(200);
        compte3.retirer(50);
        banque.transfert("001", "002", 300);
        
        System.out.println("Soldes après transactions :");
        compte1.affichersolde();
        compte2.affichersolde();
        compte3.affichersolde();
        banque.afficherNombreComptes();
        compteCourant1.deposer(1000);
        compteCourant1.affichersolde();

        compteCourant1.retirer(200);
        compteCourant1.affichersolde();

        compteCourant1.retirer(1300); 
        compteCourant1.affichersolde();
        compteCourant1.afficherTransactions(); 

        compteEpargne1.deposer(2000);
        compteEpargne1.affichersolde();

        compteEpargne1.calculerInteret(); 
        compteEpargne1.affichersolde();

        compteEpargne1.retirer(500); 
        compteEpargne1.affichersolde();

        compteEpargne1.deposer(1000);
        compteEpargne1.affichersolde();

        compteEpargne1.calculerInteret(); 
        compteEpargne1.affichersolde();
        compteEpargne1.afficherTransactions(); 
    }
}

