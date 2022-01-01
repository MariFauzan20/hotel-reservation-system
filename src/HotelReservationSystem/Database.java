
package HotelReservationSystem;

import java.sql.*;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost/db_hrs";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() {
        try {
            // TODO: Check if the database 'db_hrs' is created already.
            // if not, then create the database along with all the required tables
            // by running the .sql file.
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            System.out.println("Berhasil terhubung dengan database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void releaseConnection() {
        try {
            if (!stmt.isClosed()) stmt.close();
            if (!conn.isClosed()) conn.close();
            System.out.println("Koneksi dengan database berhasil dilepas.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
