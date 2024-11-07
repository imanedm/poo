package jv;

public abstract class Vehicule {
   protected String nom;
   private String typeCarburant;
   public Vehicule(String nom, String typeCarburant) {
	this.nom = nom;
	this.typeCarburant = typeCarburant;
}
  abstract void demarrer();
   abstract void arreter();
   public void afficherinfos() {
	   System.out.println("les infos sont : " + nom + typeCarburant);
   }
}
