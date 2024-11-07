package poly;

public class Mainn {

    public static void main(String[] args) {
        Employe[] employes = {
            new Developpeur("Amine", 150, "C++"),
            new Manager("Imane", 5000, 1)
        };

        for (Employe employe : employes) {
            employe.afficherInfos(); 
        }

        
        Employe n = new Developpeur("Sara", 200, "Java");
        n.afficherInfos(); 
    }
    Employe p = new Manager("Sara", 200, "Java");
    p.afficherInfos(); 
}
    
}

