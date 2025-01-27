package np.edu.nast.db;

//import java database related classes and interface

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ReadAllRecord {

    public static void main(String[] args) {

        try {

            //database connection
            Connection conn =DBConnection.connect();

            //statement
            String sql = "SELECT * FROM tbl_students";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs =  stmt.executeQuery();
            while(rs.next()){
                System.out.print("ID:"+rs.getInt("id"));
                System.out.print("\tNAME: "+rs.getString("first_name") +" "+rs.getString("last_name"));
                System.out.print("\tEmail: "+rs.getString("email"));
                System.out.println("\tMobile: "+rs.getString("mobile"));
            }
            conn.close();
            //close
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
