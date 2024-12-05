package np.edu.nast.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class DyteDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.dat");
            FileOutputStream fos = new FileOutputStream("dest.docx");
            int c;
            while((c=fis.read())!=-1){
                fos.write(c);
            }
            System.out.println("Complete");
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
