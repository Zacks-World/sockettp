package org.sockettp.Ex2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        try{
            Socket socket = new Socket("localhost", 123);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            System.out.print ("Entrer le nom du fichier : ");
            String FichierName = scanner.nextLine() ;
            writer.println(FichierName);
            File file = (File) ois.readObject();
            System.out.println(file.getName());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

