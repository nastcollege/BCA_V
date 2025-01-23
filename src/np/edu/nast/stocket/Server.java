package np.edu.nast.stocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("server ready...");
            while (true) {
                Socket s = serverSocket.accept();
                System.out.println("client connected");
                //io stream
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                Scanner in = new Scanner(System.in);
                System.out.println("write message");
                while (true) {
                    //reading
                    System.out.print("Client: " + din.readUTF() + "\n");
                    //writing
                    dos.writeUTF(in.nextLine());
                }
            }
        } catch (Exception e) {
            System.out.println("server error:"+e);
        }
    }
}