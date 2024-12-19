package Td;
import java.util.Date;
public class Commande implements Comparable<Commande> {
   private int Numcommande;
   private Date DateCommande;
   private String NomFournisseur;
public Commande(int numcommande, Date dateCommande, String nomFournisseur) {
	super();
	Numcommande = numcommande;
	DateCommande = dateCommande;
	NomFournisseur = nomFournisseur;
}
public int getNumcommande() {
	return Numcommande;
}
public void setNumcommande(int numcommande) {
	Numcommande = numcommande;
}
public Date getDateCommande() {
	return DateCommande;
}
public void setDateCommande(Date dateCommande) {
	DateCommande = dateCommande;
}
public String getNomFournisseur() {
	return NomFournisseur;
}
public void setNomFournisseur(String nomFournisseur) {
	NomFournisseur = nomFournisseur;
}
   @Override
   public String toString() { 
	   return"Commande{" + "Numcommande" + Numcommande +  ", DateCommande=" + DateCommande +
               ", NomFournisseur='" + NomFournisseur + '\'' +
               '}';
   }
   @Override 
   public boolean equals(Object obj) {
	   if (this == obj) return true;
	   if (obj == null || this.getClass() != obj.getClass()) return false;
       Commande commande = (Commande) obj;
       return Numcommande == commande.Numcommande;
}
   @Override
   public int compareTo(Commande cmd) {
       return this.DateCommande.compareTo(cmd.DateCommande);
   }
}
