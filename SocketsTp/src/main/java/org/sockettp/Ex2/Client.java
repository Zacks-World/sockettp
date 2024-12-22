package org.sockettp.Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 123);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String response;
            do {
                System.out.print("Entrer une valeur : ");
                int value = scanner.nextInt(); // Lire la saisie utilisateur
                writer.println(value); // Envoyer l'entier au serveur sous forme de chaîne

                response = reader.readLine(); // Lire la réponse du serveur
                System.out.println(response);
            } while (!response.contains("est correcte")); // Arrêter si la réponse indique "correcte"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
