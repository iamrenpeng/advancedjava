package ind.renpeng.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);
            while (true) {
                Socket incoming = serverSocket.accept() ;
                new Thread(new Task(incoming)).start();

            }
    }
   static class  Task implements  Runnable{
        Socket incoming;
        public Task(Socket socket){
            this.incoming=socket;
        }

        @Override
        public void run() {
            InputStream inputStream = null;
            try {
                inputStream = incoming.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            OutputStream outputStream = null;
            try {
                outputStream = incoming.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (Scanner in = new Scanner(inputStream)) {
                System.out.println(incoming.getRemoteSocketAddress());
                PrintWriter out = new PrintWriter(outputStream, true);
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    System.out.println(line);
                }
            }
        }
    }
}
