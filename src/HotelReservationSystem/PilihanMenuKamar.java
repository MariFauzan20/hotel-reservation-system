
package HotelReservationSystem;

import java.util.UUID;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class PilihanMenuKamar {
    private String id;
    private Kamar jenisKamar;
    private int banyakKamar;
    
    public PilihanMenuKamar(Kamar jenisKamar, int banyakKamar) {
        this.id = UUID.randomUUID().toString();
        this.jenisKamar = jenisKamar;
        this.banyakKamar = banyakKamar;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setJenisKamar(Kamar kamar) {
        this.jenisKamar = kamar;
    }
    public void setBanyakKamar(int banyakKamar) {
        this.banyakKamar = banyakKamar;
    }
    
    public String getId() {
        return id;
    }
    public Kamar getJenisKamar() {
        return jenisKamar;
    }
    public int getBanyakKamar() {
        return banyakKamar;
    }
    
    public void tambahKamar(int num) {
        banyakKamar += num;
    }
    public void kurangKamar(int num) {
        banyakKamar -= num;
    }
    
    public String toString() {
        return jenisKamar.getTipe();
    }
}
