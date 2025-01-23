package np.edu.nast.stocket;

import java.io.DataInputStream;
import java.net.Socket;

public class DateTimeClient {
    public static void main(String[] args) {
        try{
            //192.168.1.165
            Socket s = new Socket("192.168.1.165",1234);

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
