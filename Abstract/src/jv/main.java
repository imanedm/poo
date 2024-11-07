package jv;

public class main {

	 public static void main(String[] args) {
	        Vehicule[] vehicules = new Vehicule[2]; 
	        vehicules[0] = new Voiture("Toyota", "Essence"); 
	        vehicules[1] = new Bateau("Titanic", "Diesel");
	        for (Vehicule vehicule : vehicules) {
	            vehicule.demarrer();
	            vehicule.arreter();
	            
	        
	            if (vehicule instanceof Roulant) {
	                ((Roulant) vehicule).rouler();
	            }

	            if (vehicule instanceof Flottant) {
	                ((Flottant) vehicule).flotter();
	            }

	            System.out.println(); 
	        }

}
}