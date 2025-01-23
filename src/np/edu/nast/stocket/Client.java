package np.edu.nast.stocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            System.out.println("client ready");

            //io stream
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());
            Scanner in = new Scanner(System.in);
            System.out.println("write message");
            while (true) {
                //writing
                dos.writeUTF(in.nextLine());
                dos.flush();
                //reading
                System.out.println("Server: " + din.readUTF() + "\n");
            }
        } catch (Exception e) {
            System.out.println("client error: " + e);
        }
    }
}

