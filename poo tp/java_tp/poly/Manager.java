package poly;

public class Manager extends Employe {
  private int nombreDeSubordonnes;
  public Manager(String name , int salaire ,int nombreDeSubordonnes ) {
		 super(name , salaire);
		 this.nombreDeSubordonnes = nombreDeSubordonnes;
	 }
  public void afficherInfos() {
	    System.out.println("Les informations de l'employé sont : " + nom  + salaire  + nombreDeSubordonnes);
	}
  public void gererEquipe() {
      System.out.println(nom + " gère une équipe de " + nombreDeSubordonnes + " subordonnés.");
  }
 
}
