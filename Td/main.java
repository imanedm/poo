package Td;
import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        // Création de quelques objets Client et Commande
        Client client1 = new Client(1, "John Doe", "123 rue Exemple", "0123456789");
        Client client2 = new Client(2, "Jane Smith", "456 rue Test", "0987654321");
        Client client3 = new Client(3, "Alice Johnson", "789 rue Test", "1122334455");

        // Ajout de commandes pour chaque client
        client1.enregistrerCommande("Commande 3");
        client1.enregistrerCommande("Commande 1");
        client1.enregistrerCommande("Commande 2");

        client2.enregistrerCommande("Commande 4");
        client2.enregistrerCommande("Commande 5");

        client3.enregistrerCommande("Commande 6");
        client3.enregistrerCommande("Commande 7");

        // Utilisation de List pour stocker plusieurs clients
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        // Tri des commandes d'un client
        Collections.sort(client1.getCommandes());
        Collections.sort(client2.getCommandes());
        Collections.sort(client3.getCommandes());

        // Utilisation d'un Set pour éviter les doublons dans une collection de commandes
        Set<String> commandesSet = new HashSet<>();
        commandesSet.add("Commande 1");
        commandesSet.add("Commande 1");  // Dupliqué, ne sera pas ajouté
        commandesSet.add("Commande 2");

        System.out.println("Commandes (sans doublons) : " + commandesSet);

        // Utilisation d'une Map pour associer chaque client à son codeClient
        Map<Integer, Client> clientMap = new HashMap<>();
        clientMap.put(client1.getCodeclient(), client1);
        clientMap.put(client2.getCodeclient(), client2);
        clientMap.put(client3.getCodeclient(), client3);

        // Écriture des informations des clients dans un fichier texte
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
            for (Client client : clients) {
                writer.write("Code Client: " + client.getCodeclient() + "\n");
                writer.write("Nom Client: " + client.getNomclient() + "\n");
                writer.write("Adresse Client: " + client.getAdrClient() + "\n");
                writer.write("Téléphone Client: " + client.getTelClient() + "\n");
                writer.write("Commandes: " + client.getCommandes() + "\n");
                writer.write("\n"); // Saut de ligne entre les clients
            }
        } catch (IOException e) {
            System.err.println("Erreur d'écriture dans le fichier : " + e.getMessage());
        }

        // Lecture du fichier texte et affichage de son contenu
        try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }
}
