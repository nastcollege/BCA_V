package np.edu.nast.db;

//import java database related classes and interface

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteRecord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Id to delete record");
        Integer id = in.nextInt();
        try {

            //database connection
            Connection conn = DBConnection.connect();

            //statement
            String sql = "DELETE FROM tbl_students WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);

            //execute

            int res = stmt.executeUpdate();
            if (res > 0) {
                System.out.println("Delete Success");
            } else {
                System.out.println("Sorry, Unable to Delete");
            }
            conn.close();
            //close
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
