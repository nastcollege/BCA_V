package np.edu.nast.stocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class UserInputResponseServer {
    public static void main(String[] args) {
        try {
            //step 1
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server is ready to serve at: 1234 Port");
            while (true) {
                //step 2
                Socket s = ss.accept();
                System.out.println("Clinet Connected");

                //Step 3
                DataInputStream is = new DataInputStream(s.getInputStream());
                String clientMessage = is.readUTF();
                System.out.println("Client: "+clientMessage);

                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("WELCOME, "+clientMessage.toUpperCase());
                s.close();
            }
        } catch (Exception e) {
            System.out.println("Server Error: "+e.getMessage());
        }
    }
}
