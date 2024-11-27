import java.util.Scanner;

public class ParaWordDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter paragraph");
        String para = in.nextLine();

        String[] strArr=para.split(" ");

        new ParaWord(strArr).start();
    }
}
