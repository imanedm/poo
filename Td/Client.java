package Td;
import java.util.List;
import java.util.ArrayList;
public class Client {
  private int Codeclient ;
  private String Nomclient;
  private String AdrClient;
  private String TelClient;
  List<String> Commandes = new ArrayList();

  public Client(int codeclient, String nomclient, String adrClient, String telClient) {
	this.Codeclient = codeclient;
	this.Nomclient = nomclient;
	this.AdrClient = adrClient;
	this.TelClient = telClient;
	this.Commandes = new ArrayList();
}

public int getCodeclient() {
	return Codeclient;
}

public void setCodeclient(int codeclient) {
	Codeclient = codeclient;
}

public String getNomclient() {
	return Nomclient;
}

public void setNomclient(String nomclient) {
	Nomclient = nomclient;
}

public String getAdrClient() {
	return AdrClient;
}

public void setAdrClient(String adrClient) {
	AdrClient = adrClient;
}

public String getTelClient() {
	return TelClient;
}

public void setTelClient(String telClient) {
	TelClient = telClient;
}

public List<String> getCommandes() {
	return Commandes;
}

public void setCommandes(List<String> commandes) {
	Commandes = commandes;
}
public void enregistrerCommande(String Commande) {
    this.Commandes.add(Commande);
}
public boolean SupprimerCommande(int numCommande) {
	if(numCommande >= 0 && numCommande < Commandes.size()) {
		Commandes.remove(numCommande);
		return true;
	}
	return false;
}

@Override
public String toString() {
	return "Client [Codeclient=" + Codeclient + ", Nomclient=" + Nomclient + ", AdrClient=" + AdrClient + ", TelClient="
			+ TelClient + ", Commandes=" + Commandes + "]";
}

 
}

