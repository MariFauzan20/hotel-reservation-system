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
public class Hotel extends User {
    private String namaHotel, deskripsi, lokasi;
    private int banyakBintang;

    public Hotel(String username, String password, String namaHotel, String deskripsi, String lokasi, int banyakBintang) {
        super(username, password);
        this.lokasi = lokasi;
        this.namaHotel = namaHotel;
        this.deskripsi = deskripsi;
        this.banyakBintang = banyakBintang;
    }

    @Override
    public void setNama(String nama) {
        this.namaHotel = nama;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public void setBanyakBintang(int banyakBintang) {
        this.banyakBintang = banyakBintang;
    }

    @Override
    public String getNama() {
        return namaHotel;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public String getLokasi() {
        return lokasi;
    }
    public int getBanyakBintang() {
        return banyakBintang;
    }
}
