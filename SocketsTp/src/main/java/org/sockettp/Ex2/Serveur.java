package org.sockettp.Ex2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(123);
        System.out.println("Server is running and waiting for a connection...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter writer = new PrintWriter(outputStream, true);





    }
}
