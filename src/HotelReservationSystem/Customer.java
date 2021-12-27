
package HotelReservationSystem;

/**
 *
 * @author Wina Munawaroh
 */
public class Customer extends User {
    private String nama;
    
    public Customer(String username, String password, String nama) {
        super(username, password);
        this.nama = nama;
    }
 
    @Override
    public String getNama() {
       return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
}
