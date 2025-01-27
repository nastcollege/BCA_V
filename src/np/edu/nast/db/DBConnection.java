package np.edu.nast.db;

//import java database related classes and interface

import java.sql.*;
import java.util.EnumMap;
import java.util.Scanner;

public class DBConnection {
    public static Connection connect() throws Exception {

        //driver load
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver locaded....");

        //database connection
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bca_v", "root", "");

        System.out.println("Database connected");
        return conn;

    }
}
