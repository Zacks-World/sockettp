package org.sockettp.Ex1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(123);
            int number = (int) (Math.random() * 100); // Générer un nombre entre 0 et 99
            System.out.println("Nombre à deviner : " + number);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            int guess;
            String input;
            do {
                input = reader.readLine(); // Lire la saisie du client sous forme de chaîne
                guess = Integer.parseInt(input); // Convertir la chaîne en entier
                if (guess > number) {
                    writer.println(guess + " est plus superieure");
                } else if (guess < number) {
                    writer.println(guess + " est plus inferieure");
                } else {
                    writer.println(guess + " est correcte");
                }
            } while (guess != number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
