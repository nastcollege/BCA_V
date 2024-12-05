package np.edu.nast.io;

import java.io.FileWriter;
import java.util.Scanner;

public class StudentInfo {

    public static void store(String name, int age, double gpa) {
        try {
            FileWriter fw = new FileWriter("student.mkt");
            fw.write(name + "\n" + age + "\n" + gpa);
            fw.close();
            System.out.println("Complete");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
//take user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name age and gpa");
        String name = in.next();
        int age = in.nextInt();
        double gpa = in.nextDouble();
        StudentInfo.store(name,age,gpa);
        in.close();
    }

}
