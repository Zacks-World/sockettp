package org.sockettp.Ex2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(123);
            System.out.println("Server is running and waiting for connections...");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // Create a new thread to handle the client
                new Thread(new ClientHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
