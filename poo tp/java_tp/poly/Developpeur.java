package poly;

public class Developpeur extends Employe {
 private String langage;
 public Developpeur(String name , int salaire , String langage) {
	 super(name , salaire);
	 this.langage = langage;
 }
 public void afficherInfos() {
	    System.out.println("Les informations de l'employé sont : " + nom  + salaire + langage);
	}
 public void afficherLangage(String langage) {
System.out.println(" le langage utilisé :" + langage);	 
 }
}
 