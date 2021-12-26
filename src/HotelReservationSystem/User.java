
package HotelReservationSystem;

/**
 *
 * @author Wina Munawaroh
 */
public abstract class User {
    private int id;
    private String username, password;
    
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    abstract public void setNama(String nama); 
    
    public int getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    abstract public String getNama();
        
    boolean verifyLogin(String passwordInput) {
      return passwordInput == this.password;
    }
}
