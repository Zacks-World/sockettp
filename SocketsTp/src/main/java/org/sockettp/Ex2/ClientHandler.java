package org.sockettp.Ex2;

import java.io.*;
import java.net.Socket;

class ClientHandler implements Runnable {
    private final Socket socket;
    private static int number=0;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        number++;
    }

    @Override
    public void run() {
        try

         {
             InputStream inputStream = socket.getInputStream();
             OutputStream os = socket.getOutputStream();
             InputStreamReader isr = new InputStreamReader(inputStream);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter(os, true);
             ObjectOutputStream oos = new ObjectOutputStream(os);
             System.out.println(number);
            // Read the file name from the client
            String fileName = br.readLine();
            File file = new File(fileName);

            // Check if the file exists and send the appropriate response
            if (file.exists()) {
                oos.writeObject(file);
                System.out.println("File sent to client: " + fileName);
            } else {
                pw.println("File doesn't exist");
                System.out.println("File not found: " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

