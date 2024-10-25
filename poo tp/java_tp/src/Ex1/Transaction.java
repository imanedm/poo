package Ex1;
import java.util.Date;
public class Transaction {
    private String type; // Type of transaction (e.g., "Dépôt", "Retrait")
    private double montant; // Amount of the transaction
    private Date date; // Date of the transaction

    public Transaction(String type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date = new Date(); // Set the date to the current date
    }

    @Override
    public String toString() {
        return date + ": " + type + " de " + montant + "dh";
    }
}

