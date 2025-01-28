package np.edu.nast.db;

//import java database related classes and interface

import java.sql.*;
import java.util.EnumMap;
import java.util.Scanner;

public class UpdateRecord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Id to update record");
        Integer id = in.nextInt();
        try {

            //database connection
            Connection conn = DBConnection.connect();

            //statement
            String sql = "SELECT * FROM tbl_students WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("ID:" + rs.getInt("id"));
                System.out.print("\tNAME: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                System.out.print("\tEmail: " + rs.getString("email"));
                System.out.println("\tMobile: " + rs.getString("mobile"));
            }
            conn.close();
            //close
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Enter First Name");
        String firstName = in.next();

        System.out.println("Enter Last Name");
        String lastName = in.next();

        System.out.println("Enter Email");
        String email = in.next();

        System.out.println("Enter Mobile Number");
        String mobile = in.next();

        in.close();
        try {

            //database connection
            Connection conn = DBConnection.connect();

            //statement
            String sql = "UPDATE tbl_students SET first_name=?, last_name=?, email=?, mobile=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setString(4, mobile);
            stmt.setInt(5,id);

            //execute

            int res = stmt.executeUpdate();
            if (res > 0) {
                System.out.println("Update Success");
            } else {
                System.out.println("Sorry, Unable to Update");
            }
            conn.close();
            //close
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
