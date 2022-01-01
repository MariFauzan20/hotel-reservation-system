
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

    public void insertCustomer(Customer c) {
        try {
            String id = c.getId();
            String username = c.getUsername();
            String password = c.getPassword();
            String nama = c.getNama();
            
            String sqlUser = "INSERT INTO user VALUES('%s','%s','%s','%s')";
            String sqlCustomer = "INSERT INTO customer VALUES('%s','%s','%s')";
            sqlUser = String.format(sqlUser, id, username, password, "customer");
            sqlCustomer = String.format(sqlCustomer, id, id, nama);
            
            stmt.execute(sqlUser);
            stmt.execute(sqlCustomer);
            System.out.println("Customer baru berhasil dibuat.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertHotel(Hotel h) {
        try {
            String id = h.getId();
            String username = h.getUsername();
            String password = h.getPassword();
            String nama = h.getNama();
            String deskripsi = h.getDeskripsi();
            String lokasi = h.getLokasi();
            int bintang = h.getBanyakBintang();
            
            String sqlUser = "INSERT INTO user VALUES('%s','%s','%s','%s')";
            String sqlHotel = "INSERT INTO hotel VALUES('%s','%s','%s','%s','%s',%d)";
            sqlUser = String.format(sqlUser, id, username, password, "hotel");
            sqlHotel = String.format(sqlHotel, id, id, nama, deskripsi, lokasi, bintang);
            
            stmt.execute(sqlUser);
            stmt.execute(sqlHotel);
            System.out.println("Hotel baru berhasil dibuat.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertPilihanMenu(String id_hotel, PilihanMenuKamar p) {
        try {
            String id = p.getId();
            
            Kamar k = p.getJenisKamar();
            String id_kamar = k.getId();
            String tipe = k.getTipe();
            int harga = k.getHargaPerMalam();
            int batas_org = k.getBatasOrangPerKamar();
            
            int banyak_kamar = p.getbanyakKamar();
            
            String sqlKamar = "INSERT INTO kamar VALUES ('%s','%s',%d,%d)";
            String sqlPM = "INSERT INTO pilihan_menu VALUES('%s','%s','%s',%d)";
            
            sqlKamar = String.format(sqlKamar, id_kamar, tipe, harga, batas_org);
            sqlPM = String.format(sqlPM, id, id_hotel, id_kamar, banyak_kamar);
            
            stmt.execute(sqlKamar);
            stmt.execute(sqlPM);
            System.out.println("Pilihan menu berhasil ditambah.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertDetilPemesanan(DetilPemesanan d) {
        try {
            String id = d.getId();
            String id_c = d.getCustomer().getId();
            String id_h = d.getHotel().getId();
            String id_k = d.getTipeKamar().getId();
            int byk_kamar = d.getBanyakKamar();
            int byk_malam = d.getBanyakMalam();
            int total = d.getHargaTotal();
            
            String sql = "INSERT INTO detil_pemesanan VALUES ('%s','%s','%s','%s',%d,%d,%d)";
            sql = String.format(sql, id, id_c, id_h, id_k, byk_kamar, byk_malam, total);
            
            stmt.execute(sql);
            System.out.println("Detil pemesanan berhasil dibuat.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String verifyCustomer(String username, String password) {
        try {
            String sql = "SELECT id FROM user WHERE role='customer' AND username='%s' AND password='%s'";
            sql = String.format(sql, username, password);
            rs = stmt.executeQuery(sql);
            
            if (!rs.next()) return "not found";
            return rs.getString("id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public String verifyHotel(String username, String password) {
        try {
            String sql = "SELECT id FROM user WHERE role='hotel' AND username='%s' AND password='%s'";
            sql = String.format(sql, username, password);
            rs = stmt.executeQuery(sql);
            
            if (!rs.next()) return "not found";
            return rs.getString("id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
