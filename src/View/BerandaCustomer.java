/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;

/**
 *
 * @author ASUS
 */
public class BerandaCustomer extends javax.swing.JPanel {

    /**
     * Creates new form Hotel
     */
    public BerandaCustomer() {
        initComponents();
    }

    public JButton getButtonExploreHotel() {
        return ButtonExploreHotel;
    }

    public JButton getButtonHistoriPemesanan() {
        return ButtonHistoriPemesanan;
    }

    public JButton getButtonLogout() {
        return ButtonLogout;
    }

    public JButton getButtonSettings() {
        return ButtonSettings;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonExploreHotel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonHistoriPemesanan = new javax.swing.JButton();
        ButtonSettings = new javax.swing.JButton();
        ButtonLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        ButtonExploreHotel.setBackground(new java.awt.Color(58, 152, 248));
        ButtonExploreHotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonExploreHotel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonExploreHotel.setText("Explore Hotel");
        ButtonExploreHotel.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Beranda");

        ButtonHistoriPemesanan.setBackground(new java.awt.Color(58, 152, 248));
        ButtonHistoriPemesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonHistoriPemesanan.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHistoriPemesanan.setText("Histori Pemesanan");
        ButtonHistoriPemesanan.setBorder(null);

        ButtonSettings.setBackground(new java.awt.Color(58, 152, 248));
        ButtonSettings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonSettings.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSettings.setText("Settings");
        ButtonSettings.setBorder(null);

        ButtonLogout.setBackground(new java.awt.Color(255, 51, 51));
        ButtonLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonLogout.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogout.setText("Logout");
        ButtonLogout.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ButtonExploreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonHistoriPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonExploreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHistoriPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExploreHotel;
    private javax.swing.JButton ButtonHistoriPemesanan;
    private javax.swing.JButton ButtonLogout;
    private javax.swing.JButton ButtonSettings;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
