package jv;

public class Hydravion extends Vehicule implements Volant,Flottant {
	public void voler() {
		System.out.println("hydravion voler");
	}
	public Hydravion(String nom, String typeCarburant) {
		super(nom, typeCarburant);
	}
	public void flotter(){
		System.out.println("hydravion flotter");
	}
	 @Override
	    public void demarrer() {
	        System.out.println(nom + " démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println(nom + " s'arrête.");
	    }
}
