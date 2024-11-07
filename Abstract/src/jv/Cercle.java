package jv;
public class Cercle extends Forme {
    private double r; 
    public Cercle(double r) {
        this.r = r;
    }

    @Override
    public double calculersurface() {
        return Math.PI * r * r;
    }

    @Override
    public double calculerperimetre() {
        return 2 * Math.PI * r;
    }
}
