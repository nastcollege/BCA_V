package np.edu.nast.stocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class USerInputRequestServer {
    public static void main(String[] args) {
        try{
            //192.168.1.165
            Socket s = new Socket("192.168.1.165",1234);


            //sending data to server
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = in.next();
            dos.writeUTF(name);

            //reading date and time
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String reply = dis.readUTF();
            System.out.println(reply);

            //close socket
            s.close();

        }catch (Exception e){
            System.out.println("Client Error: "+e.getMessage());
        }
    }
}
