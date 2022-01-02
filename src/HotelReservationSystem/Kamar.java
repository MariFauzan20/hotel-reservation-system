
package HotelReservationSystem;

import java.util.UUID;

/**
 *
 * @author Wina Munawaroh
 */
public class Kamar {
    private String id, tipe;
    private int hargaPerMalam, batasOrangPerKamar;
    
    public Kamar(String tipe, int hargaPerMalam, int batasOrangPerKamar) {
        this.id = UUID.randomUUID().toString();
        this.tipe = tipe;
        this.hargaPerMalam = hargaPerMalam;
        this.batasOrangPerKamar = batasOrangPerKamar;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public void setHargaPerMalam(int hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }
    
    public void setBatasOrangPerKamar(int batasOrangPerKamar) {
        this.batasOrangPerKamar = batasOrangPerKamar;
    }
    
    public String getId() {
        return id;
    }
    
    public String getTipe() {
        return tipe;
    }
    
    public int getHargaPerMalam() {
        return hargaPerMalam;
    }
    
    public int getBatasOrangPerKamar() {
        return batasOrangPerKamar;
    }
}
