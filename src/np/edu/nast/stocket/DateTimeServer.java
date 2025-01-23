package np.edu.nast.stocket;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {
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
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("Welcome to NAST COllege");
                s.close();
            }
        } catch (Exception e) {
            System.out.println("Server Error: "+e.getMessage());
        }
    }
}
