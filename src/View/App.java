
package View;

import java.awt.CardLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class App extends javax.swing.JFrame {
    
    private CardLayout cardLayout;
    private Login login;
    private Register register;
    private BerandaCustomer berandaCustomer;
    private ExploreHotel exploreHotel;
    private DetailHotel detailHotel;
    private HistoriPemesanan historiPemesanan;
    private SettingsCustomer settingsCustomer;
    private BerandaHotel berandaHotel;
    private MenuKamar menuKamar;
    private CustomerHotel customerHotel;
    private SettingsHotel settingsHotel;
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        login = new Login();
        register = new Register();
        berandaCustomer = new BerandaCustomer();
        exploreHotel = new ExploreHotel();
        detailHotel = new DetailHotel();
        historiPemesanan = new HistoriPemesanan();
        settingsCustomer = new SettingsCustomer();
        berandaHotel = new BerandaHotel();
        customerHotel = new CustomerHotel();
        menuKamar = new MenuKamar();
        settingsHotel = new SettingsHotel();
        
        cardLayout = (CardLayout) parentPanel.getLayout();
        parentPanel.add(login, "Login");
        parentPanel.add(register, "Register");
        parentPanel.add(berandaCustomer, "BerandaCustomer");
        parentPanel.add(exploreHotel, "ExploreHotel");
        parentPanel.add(detailHotel, "DetailHotel");
        parentPanel.add(historiPemesanan, "HistoriPemesanan");
        parentPanel.add(settingsCustomer, "SettingsCustomer");
        parentPanel.add(berandaHotel, "BerandaHotel");
        parentPanel.add(customerHotel, "CustomerHotel");
        parentPanel.add(menuKamar, "MenuKamar");
        parentPanel.add(settingsHotel, "SettingsHotel");
        
        pack();
        
        routeLoginPage();
        routeRegisterPage();
        routeBerandaCustomer();
        routeExploreHotel();
        routeBerandaHotelPage();
        routeCustomerHotelPage();
        routeMenuKamarPage();
        routeSettingsHotelPage();
        routeDetailHotel();
        routeHistoriPemesanan();
        routeSettings();
        
        cardLayout.show(parentPanel, "Login");
    }
    
    private void routeLoginPage() {
        login.getLabelAkun().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "Register");
            }
        });
        login.getButtonSubmit().addActionListener((ActionEvent e) -> {
            login.verifyInputUser();
            String role = login.getRoleUser();
            if (role == "customer") {
                cardLayout.show(parentPanel, "BerandaCustomer");
            } else if (role == "hotel") {
                cardLayout.show(parentPanel, "BerandaHotel");
            } else {
                JOptionPane.showConfirmDialog(
                    null,
                    "Username/password salah",
                    "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE
                );
            }
        });
    }
    
    private void routeRegisterPage() {
        register.getLabelAkun().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "Login");
            }
        });
    }
    
    private void routeBerandaCustomer() {
        berandaCustomer.getButtonExploreHotel().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "ExploreHotel");
        });
        
        berandaCustomer.getButtonHistoriPemesanan().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "HistoriPemesanan");
        });
        
        berandaCustomer.getButtonSettings().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "SettingsCustomer");
        });
        
        berandaCustomer.getButtonLogout().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "Login");
        });
    }
    
    private void routeExploreHotel() {       
        exploreHotel.getButtonPilih().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "DetailHotel");
        });
        
        exploreHotel.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaCustomer");
            }
        });
    }
    
    private void routeDetailHotel() {       
        detailHotel.getButtonPesan().addActionListener((ActionEvent e) -> {
              cardLayout.show(parentPanel, "HistoriPemesanan");
        });
        
        detailHotel.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "ExploreHotel");
            }
        });
    }
    
    private void routeHistoriPemesanan() {         
        historiPemesanan.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaCustomer");
            }
        });
    }
    
    private void routeSettings() {         
        settingsCustomer.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaCustomer");
            }
        });
    }
          
    private void routeBerandaHotelPage() {
        berandaHotel.getButtonMenuKamar().addActionListener((ActionEvent e) -> {
            menuKamar.setIdHotel(login.getCurrentUserId());
            menuKamar.loadMenuKamarFromDB();
            cardLayout.show(parentPanel, "MenuKamar");
        });
        berandaHotel.getButtonLihatCustomer().addActionListener((ActionEvent e) -> {
            cardLayout.show(parentPanel, "CustomerHotel");
        });
        berandaHotel.getButtonSettings().addActionListener((ActionEvent e) -> {
            cardLayout.show(parentPanel, "SettingsHotel");
        });
        berandaHotel.getButtonLogout().addActionListener((ActionEvent e) -> {
            cardLayout.show(parentPanel, "Login");
        });
    }
    
    private void routeCustomerHotelPage() {
        customerHotel.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaHotel");
            }
        });
    }
    
    private void routeMenuKamarPage() {
        menuKamar.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaHotel");
            }
        });
    }
    
    private void routeSettingsHotelPage() {
        settingsHotel.getLabelBack().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cardLayout.show(parentPanel, "BerandaHotel");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel parentPanel;
    // End of variables declaration//GEN-END:variables
}
