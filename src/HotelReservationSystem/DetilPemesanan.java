/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystem;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class DetilPemesanan {
    private int id, banyakKamar, banyakMalam, hargaTotal;
    private Customer customer;
    private Hotel hotel;
    private Kamar tipeKamar;
    
    public DetilPemesanan(int id, Customer c, Hotel h, Kamar k, int cntK, int cntM) {
        this.id = id;
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
