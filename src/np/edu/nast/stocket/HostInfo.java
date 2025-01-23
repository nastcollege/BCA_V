package np.edu.nast.stocket;

import java.net.InetAddress;

public class HostInfo {
    public static void main(String[] args) {
        try{
            InetAddress ip= InetAddress.getLocalHost();
            System.out.println("IP address: "+ip);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
