package np.edu.nast.stocket;

import java.net.InetAddress;
import java.util.Scanner;

public class HostInfoUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Host Name: ");
        String host=in.nextLine();
        try{
            InetAddress ip= InetAddress.getByName(host);
            System.out.println("IP address: "+ip);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        in.close();
    }
}
