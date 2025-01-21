package np.edu.nast.stocket;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ReadContentFromWeb {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://nast.edu.np/");
            URLConnection connection=url.openConnection();
            InputStream is =connection.getInputStream();
            int c;
            while((c=is.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println("Total Length: "+is.available());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
