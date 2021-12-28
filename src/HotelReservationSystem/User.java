
package HotelReservationSystem;

import java.util.UUID;

/**
 *
 * @author Wina Munawaroh
 */
public abstract class User {
    private String id;
    private String username, password;
    
    public User(String username, String password) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    abstract public void setNama(String nama); 
    
    public String getId() {
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
      return (passwordInput == this.password);
    }
}
