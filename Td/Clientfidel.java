package Td;

public class Clientfidel extends Client {
    private String Codefidelite;
    private float TauxReduction;
	public Clientfidel(int codeclient, String nomclient, String adrClient, String telClient, String codefidelite,
			float tauxReduction) {
		super(codeclient, nomclient, adrClient, telClient);
		Codefidelite = codefidelite;
		TauxReduction = tauxReduction;
	}
	@Override
	public String toString() {
		return "Clientfidel [Codefidelite=" + Codefidelite + ", TauxReduction=" + TauxReduction + "]";
	}
    
}
