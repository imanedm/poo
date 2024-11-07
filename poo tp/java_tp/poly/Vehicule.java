package poly;

public class Vehicule {
    public void seDeplacer() {
        System.out.println("Le véhicule se déplace.");
    }
}

class Voiture extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("La voiture se déplace.");
    }
}

class Velo extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("Le vélo se déplace.");
    }
}





