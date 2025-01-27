package np.edu.nast.db;

//import java database related classes and interface

import java.sql.*;
import java.util.EnumMap;
import java.util.Scanner;

public class CreateRecord {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=in.nextLine();

        System.out.println("Enter Last Name");
        String lastName=in.nextLine();

        System.out.println("Enter Email");
        String email=in.nextLine();

        System.out.println("Enter Mobile Number");
        String mobile=in.nextLine();

        in.close();
        try {

            //database connection
            Connection conn =DBConnection.connect();

            //statement
            String sql = "INSERT INTO tbl_students(first_name, last_name, email, mobile) VALUES(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setString(4, mobile);

            //execute

            int res = stmt.executeUpdate();
            if (res > 0) {
                System.out.println("Saved Success");
            } else {
                System.out.println("Sorry, Unable to save");
            }
            conn.close();
            //close
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
