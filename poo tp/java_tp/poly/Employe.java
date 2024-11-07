package poly;

public class Employe {
	protected String nom;
	protected int salaire;
	public Employe(String nom ,int salaire) {
        this.nom = nom;
        this.salaire = salaire;
	}
	public void afficherInfos() {
	    System.out.println("Les informations de l'employé sont : " + nom  + salaire);
	}
}
