package jv;

public class Bateau extends Vehicule{
	public Bateau(String nom, String typeCarburant) {
		super(nom, typeCarburant);
	}
	public void demarrer() {
		System.out.println("le Bateau  demerrer");
	}
	   public void arreter() {
		   System.out.println("la Bateau arreter");
	   }
	   public void flotter() {
		   System.out.println("la Bateau flotte");
	   }
	   
}
