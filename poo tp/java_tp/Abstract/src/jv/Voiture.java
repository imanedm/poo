package jv;

public class Voiture extends Vehicule implements Roulant{
	public Voiture(String nom, String typeCarburant) {
		super(nom, typeCarburant);
	}
	public void demarrer() {
		System.out.println("le voiture demerrer");
	}
	   public void arreter() {
		   System.out.println("la voiture arreter");
	   }
	   public void rouler() {
		   System.out.println("la voiture roule");
	   }
	  
}