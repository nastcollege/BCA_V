package np.edu.nast.thread;

import java.util.Scanner;

public class Paragraph extends Thread{
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter paragraph");
        String text = in.nextLine();
        char[] carge=text.toCharArray();
        for(char c:carge){
            System.out.println(c);
            try{Thread.sleep(200);}catch (Exception e){System.out.println(e);}
        }
    }
}
