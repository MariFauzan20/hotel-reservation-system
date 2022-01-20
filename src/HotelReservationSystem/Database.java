
package HotelReservationSystem;

import java.sql.*;
import java.util.ArrayList;

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
            
            int banyak_kamar = p.getBanyakKamar();
            
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

    public Customer getCustomerById(String id) {
        Customer res = new Customer("", "", "");
        try {
            String sql = "SELECT * FROM user INNER JOIN customer"
                    + " ON customer.id_user = user.id WHERE user.id='%s'";
            sql = String.format(sql, id);
            rs = stmt.executeQuery(sql);
            
            if (!rs.next()) return res;
            
            res.setId(id);
            res.setUsername(rs.getString("username"));
            res.setPassword(rs.getString("password"));
            res.setNama(rs.getString("nama"));
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public Hotel getHotelById(String id) {
        Hotel res = new Hotel("", "", "", "", "", -1);
        try {
            String sql = "SELECT * FROM user INNER JOIN hotel"
                    + " ON hotel.id_user = user.id WHERE user.id='%s'";
            sql = String.format(sql, id);
            rs = stmt.executeQuery(sql);
            
            if (!rs.next()) return res;
            
            res.setId(id);
            res.setUsername(rs.getString("username"));
            res.setPassword(rs.getString("password"));
            res.setNama(rs.getString("nama_hotel"));
            res.setDeskripsi(rs.getString("deskripsi"));
            res.setLokasi(rs.getString("lokasi"));
            res.setBanyakBintang(rs.getInt("banyak_bintang"));
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<Hotel> getAllHotels() {
        ArrayList<Hotel> res = new ArrayList<>();
        try {
            String sql = "SELECT * FROM user INNER JOIN hotel ON hotel.id_user = user.id";
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Hotel tmp = new Hotel("", "", "", "", "", -1);
                
                tmp.setId(rs.getString("id"));
                tmp.setUsername(rs.getString("username"));
                tmp.setPassword(rs.getString("password"));
                tmp.setNama(rs.getString("nama_hotel"));
                tmp.setDeskripsi(rs.getString("deskripsi"));
                tmp.setLokasi(rs.getString("lokasi"));
                tmp.setBanyakBintang(rs.getInt("banyak_bintang"));
                
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<Hotel> getHotelsByBintang(int bintang) {
        ArrayList<Hotel> res = new ArrayList<>();
        try {
            String sql = "SELECT * FROM user u INNER JOIN hotel h"
                    + " ON h.id_user = u.id WHERE h.banyak_bintang=%d";
            sql = String.format(sql, bintang);
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Hotel tmp = new Hotel("", "", "", "", "", -1);
                
                tmp.setId(rs.getString("id"));
                tmp.setUsername(rs.getString("username"));
                tmp.setPassword(rs.getString("password"));
                tmp.setNama(rs.getString("nama_hotel"));
                tmp.setDeskripsi(rs.getString("deskripsi"));
                tmp.setLokasi(rs.getString("lokasi"));
                tmp.setBanyakBintang(rs.getInt("banyak_bintang"));
                
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<Hotel> getHotelsByLokasi(String lokasi) {
        ArrayList<Hotel> res = new ArrayList<>();
        try {
            String sql = "SELECT * FROM user u INNER JOIN hotel h"
                    + " ON h.id_user = u.id WHERE h.lokasi LIKE '%%%s%%'";
            sql = String.format(sql, lokasi);
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Hotel tmp = new Hotel("", "", "", "", "", -1);
                
                tmp.setId(rs.getString("id"));
                tmp.setUsername(rs.getString("username"));
                tmp.setPassword(rs.getString("password"));
                tmp.setNama(rs.getString("nama_hotel"));
                tmp.setDeskripsi(rs.getString("deskripsi"));
                tmp.setLokasi(rs.getString("lokasi"));
                tmp.setBanyakBintang(rs.getInt("banyak_bintang"));
                
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<Customer> getCustomersByHotel(String id_hotel) {
        ArrayList<Customer> res = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT c.id, u.username, u.password, c.nama\n" +
                "FROM detil_pemesanan d\n" +
                "INNER JOIN customer c ON d.id_customer = c.id\n" +
                "INNER JOIN user u ON u.id = c.id_user\n" +
                "WHERE d.id_hotel = '%s'";
            sql = String.format(sql, id_hotel);
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Customer tmp = new Customer("", "", "");
                tmp.setId(rs.getString("id"));
                tmp.setUsername(rs.getString("username"));
                tmp.setPassword(rs.getString("password"));
                tmp.setNama(rs.getString("nama"));
                
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<PilihanMenuKamar> getPilihanMenuByHotel(String id_hotel) {
        ArrayList<PilihanMenuKamar> res = new ArrayList<>();
        try {
            String sql = "SELECT p.id id_p, k.id id_k, k.*, p.banyak_kamar\n" +
                "FROM pilihan_menu p\n" +
                "INNER JOIN kamar k ON p.id_kamar = k.id\n" +
                "WHERE p.id_hotel = '%s'";
            sql = String.format(sql, id_hotel);
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Kamar k = new Kamar("", -1, -1);
                k.setId(rs.getString("id_k"));
                k.setTipe(rs.getString("tipe"));
                k.setHargaPerMalam(rs.getInt("harga_per_malam"));
                k.setBatasOrangPerKamar(rs.getInt("batas_orang"));
                
                PilihanMenuKamar tmp = new PilihanMenuKamar(k, rs.getInt("banyak_kamar"));
                tmp.setId(rs.getString("id_p"));
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<DetilPemesanan> getPemesananByCustomer(String id_customer) {
        ArrayList<DetilPemesanan> res = new ArrayList<>();
        try {
            String sql = "SELECT\n" +
                "    d.id id_p, banyak_kamar byk_k, banyak_malam byk_m,\n" +
                "    uc.id id_c, uc.username un_c, uc.password pw_c, nama nm_c,\n" +
                "    uh.id id_h, uh.username un_h, uh.password pw_h, nama_hotel nm_h, deskripsi dk_h, lokasi lk_h, banyak_bintang bb_h,\n" +
                "    k.id id_k, tipe tipe_k, harga_per_malam harga_k, batas_orang batas_k\n" +
                "FROM detil_pemesanan d\n" +
                "INNER JOIN customer c ON d.id_customer = c.id\n" +
                "INNER JOIN hotel h ON d.id_hotel = h.id\n" +
                "INNER JOIN kamar k ON d.id_kamar = k.id\n" +
                "INNER JOIN user uc ON uc.id = c.id\n" +
                "INNER JOIN user uh ON uh.id = h.id\n" +
                "WHERE uc.id = '%s'";
            sql = String.format(sql, id_customer);
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Customer c = new Customer("", "", "");
                c.setId(rs.getString("id_c"));
                c.setUsername(rs.getString("un_c"));
                c.setPassword(rs.getString("pw_c"));
                c.setNama(rs.getString("nm_c"));
                
                Hotel h = new Hotel("", "", "", "", "", -1);
                h.setId(rs.getString("id_h"));
                h.setUsername(rs.getString("un_h"));
                h.setPassword(rs.getString("pw_h"));
                h.setNama(rs.getString("nm_h"));
                h.setDeskripsi(rs.getString("dk_h"));
                h.setLokasi(rs.getString("lk_h"));
                h.setBanyakBintang(rs.getInt("bb_h"));
                
                Kamar k = new Kamar("", -1, -1);
                k.setId(rs.getString("id_k"));
                k.setTipe(rs.getString("tipe_k"));
                k.setHargaPerMalam(rs.getInt("harga_k"));
                k.setBatasOrangPerKamar(rs.getInt("batas_k"));
                
                DetilPemesanan tmp = new DetilPemesanan(c, h, k, rs.getInt("byk_k"), rs.getInt("byk_m"));
                tmp.setId(rs.getString("id_p"));
                
                res.add(tmp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void updateCustomerById(String id, Customer c) {
        try {
            String upd_un = c.getUsername();
            String upd_pw = c.getPassword();
            String upd_nm = c.getNama();
            
            String sqlUser = "UPDATE user SET username='%s', password='%s' WHERE id='%s'";
            String sqlCustomer = "UPDATE customer SET nama='%s' WHERE id='%s'";
            sqlUser = String.format(sqlUser, upd_un, upd_pw, id);
            sqlCustomer = String.format(sqlCustomer, upd_nm, id);
            
            stmt.execute(sqlUser);
            stmt.execute(sqlCustomer);
            System.out.println("Data customer berhasil diperbarui.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateHotelById(String id, Hotel h) {
        try {
            String upd_un = h.getUsername();
            String upd_pw = h.getPassword();
            String upd_nm = h.getNama();
            String upd_dk = h.getDeskripsi();
            String upd_lk = h.getLokasi();
            int upd_bb = h.getBanyakBintang();
            
            String sqlUser = "UPDATE user SET username='%s', password='%s' WHERE id='%s'";
            String sqlHotel = "UPDATE hotel SET nama_hotel='%s',deskripsi='%s',lokasi='%s',banyak_bintang=%d WHERE id='%s'";
            sqlUser = String.format(sqlUser, upd_un, upd_pw, id);
            sqlHotel = String.format(sqlHotel, upd_nm, upd_dk, upd_lk, upd_bb, id);
            
            stmt.execute(sqlUser);
            stmt.execute(sqlHotel);
            System.out.println("Data hotel berhasil diperbarui.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updatePilihanMenuById(String id, PilihanMenuKamar p) {
        try {
            Kamar k = p.getJenisKamar();
            String id_k = k.getId();
            String upd_tp = k.getTipe();
            int upd_hg = k.getHargaPerMalam();
            int upd_bt = k.getBatasOrangPerKamar();
            int upd_byk_sedia = p.getBanyakKamar();
            
            String sqlKamar = "UPDATE kamar SET tipe='%s',harga_per_malam=%d,batas_orang=%d WHERE id='%s'";
            String sqlPM = "UPDATE pilihan_menu SET banyak_kamar=%d WHERE id = '%s'";
            sqlKamar = String.format(sqlKamar, upd_tp, upd_hg, upd_bt, id_k);
            sqlPM = String.format(sqlPM, upd_byk_sedia, id);
            
            stmt.execute(sqlKamar);
            stmt.execute(sqlPM);
            System.out.println("Data pilihan menu berhasil diperbarui.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
