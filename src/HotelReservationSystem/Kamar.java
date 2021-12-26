
package HotelReservationSystem;

/**
 *
 * @author Wina Munawaroh
 */
public class Kamar {
    private String tipe;
    private int hargaPerMalam, batasOrangPerKamar;
    
    public Kamar(String tipe, int hargaPerMalam, int batasOrangPerKamar) {
        this.tipe = tipe;
        this.hargaPerMalam = hargaPerMalam;
        this.batasOrangPerKamar = batasOrangPerKamar;
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
