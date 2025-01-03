package np.edu.nast.io;

import java.io.RandomAccessFile;

public class RandomDemo {
    public static void main(String[] args) {
       writeRand();
        readRand();
    }

    public static void writeRand() {
        try {
            RandomAccessFile rand = new RandomAccessFile("rand.txt", "rw");
//            char vows[] = {'a', 'e', 'i', 'o', 'u'};
            String text="This is text all about BCA";
//            for (char c : vows) {
//                rand.writeChar(c);
//            }

            rand.write(text.getBytes());
            rand.close();
            System.out.println("complete");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void readRand() {
            try {
                RandomAccessFile rand = new RandomAccessFile("rand.txt", "rw");
              rand.seek(0);
                System.out.println(rand.readLine());
                rand.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
