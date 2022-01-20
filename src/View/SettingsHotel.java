/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import HotelReservationSystem.Database;
import HotelReservationSystem.Hotel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class SettingsHotel extends javax.swing.JPanel {
    
    private Database db;
    private String idHotel;
    private Hotel h;

    /**
     * Creates new form SettingsHotel
     */
    public SettingsHotel() {
        initComponents();
        db = new Database();
    }

    public JLabel getLabelBack() {
        return labelBack;
    }
    
    public void setIdHotel(String id_hotel) {
        this.idHotel = id_hotel;
    }
    
    public void fillFormWithData() {
        h = db.getHotelById(idHotel);
        textFieldUsername.setText(h.getUsername());
        textFieldPassword.setText(h.getPassword());
        textFieldNamaHotel.setText(h.getNama());
        textFieldLokasi.setText(h.getLokasi());
        spinnerBintang.setValue(h.getBanyakBintang());
        textFieldDeskripsi.setText(h.getDeskripsi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSettings = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        labelNamaHotel = new javax.swing.JLabel();
        textFieldNamaHotel = new javax.swing.JTextField();
        textFieldLokasi = new javax.swing.JTextField();
        labelLokasi = new javax.swing.JLabel();
        labelBintang = new javax.swing.JLabel();
        spinnerBintang = new javax.swing.JSpinner();
        labelDeskripsi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFieldDeskripsi = new javax.swing.JTextArea();
        buttonSimpan = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        labelSettings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelSettings.setText("Settings");

        labelBack.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelBack.setForeground(new java.awt.Color(255, 51, 51));
        labelBack.setText("< Back");
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPassword.setText("Password");

        labelNamaHotel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNamaHotel.setText("Nama Hotel");

        labelLokasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLokasi.setText("Lokasi");

        labelBintang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBintang.setText("Banyak Bintang");

        labelDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDeskripsi.setText("Deskripsi");

        textFieldDeskripsi.setColumns(20);
        textFieldDeskripsi.setLineWrap(true);
        textFieldDeskripsi.setRows(5);
        jScrollPane1.setViewportView(textFieldDeskripsi);

        buttonSimpan.setBackground(new java.awt.Color(58, 152, 248));
        buttonSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelBack)
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(labelLokasi)
                            .addGap(40, 40, 40)
                            .addComponent(textFieldLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelPassword)
                                .addComponent(labelUsername)
                                .addComponent(labelNamaHotel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addComponent(labelSettings))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(textFieldNamaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(labelDeskripsi)
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBintang)
                        .addGap(40, 40, 40)
                        .addComponent(spinnerBintang, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labelSettings)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsername)
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNamaHotel)
                            .addComponent(textFieldNamaHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLokasi)
                            .addComponent(textFieldLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBintang)
                            .addComponent(spinnerBintang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDeskripsi)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        h.setUsername(textFieldUsername.getText());
        h.setPassword(textFieldPassword.getText());
        h.setNama(textFieldNamaHotel.getText());
        h.setLokasi(textFieldLokasi.getText());
        h.setBanyakBintang((int) spinnerBintang.getValue());
        h.setDeskripsi(textFieldDeskripsi.getText());
        db.updateHotelById(idHotel, h);
        JOptionPane.showConfirmDialog(
            null,
            "Data berhasil diperbarui",
            "",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
    }//GEN-LAST:event_buttonSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelBintang;
    private javax.swing.JLabel labelDeskripsi;
    private javax.swing.JLabel labelLokasi;
    private javax.swing.JLabel labelNamaHotel;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSettings;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JSpinner spinnerBintang;
    private javax.swing.JTextArea textFieldDeskripsi;
    private javax.swing.JTextField textFieldLokasi;
    private javax.swing.JTextField textFieldNamaHotel;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
