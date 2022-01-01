
package HotelReservationSystem;

import java.util.UUID;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class DetilPemesanan {
    private String id;
    private int banyakKamar, banyakMalam, hargaTotal;
    private Customer customer;
    private Hotel hotel;
    private Kamar tipeKamar;
    
    public DetilPemesanan(Customer c, Hotel h, Kamar k, int cntK, int cntM) {
        this.id = UUID.randomUUID().toString();
        this.customer = c;
        this.hotel = h;
        this.tipeKamar = k;
        this.banyakKamar = cntK;
        this.banyakMalam = cntM;
        this.hargaTotal = k.getHargaPerMalam()*cntK*cntM;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public Kamar getTipeKamar() {
        return tipeKamar;
    }
    public int getBanyakKamar() {
        return banyakKamar;
    }
    public int getBanyakMalam() {
        return banyakMalam;
    }
    public int getHargaTotal() {
        return hargaTotal;
    }
}
