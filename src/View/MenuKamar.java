/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import HotelReservationSystem.Database;
import HotelReservationSystem.Kamar;
import HotelReservationSystem.PilihanMenuKamar;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class MenuKamar extends javax.swing.JPanel {
    
    private Database db;
    private String idHotel;
    DefaultListModel<PilihanMenuKamar> listModelMenu;
    PilihanMenuKamar curSelected;
    private boolean isChanging = false;

    /**
     * Creates new form MenuKamar
     */
    public MenuKamar() {
        initComponents();
        db = new Database();
        listModelMenu = new DefaultListModel<>();
        listKamar.setModel(listModelMenu);
        listKamar.addListSelectionListener(new selectedMenuHandler());
    }

    public JLabel getLabelBack() {
        return labelBack;
    }
    
    public void setIdHotel(String id_hotel) {
        this.idHotel = id_hotel;
    }
    
    public void loadMenuKamarFromDB() {
        isChanging = true;
        listKamar.clearSelection();
        listUnselectedStuff();
        
        listModelMenu.removeAllElements();
        ArrayList<PilihanMenuKamar> menu = db.getPilihanMenuByHotel(idHotel);
        for (PilihanMenuKamar p : menu)
            listModelMenu.addElement(p);
        isChanging = false;
    }
    
    private void listSelectedStuff() {
        buttonTambah.setEnabled(false);
        buttonPerbarui.setEnabled(true);
        buttonHapus.setEnabled(true);
    }
    
    private void listUnselectedStuff() {
        textFieldTipe.setText("");
        textFieldHarga.setText("");
        spinnerBatasOrang.setValue(0);
        spinnerBanyakKamar.setValue(0);
        buttonTambah.setEnabled(true);
        buttonPerbarui.setEnabled(false);
        buttonHapus.setEnabled(false);
    }

    private class selectedMenuHandler implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting() && !isChanging) {
                PilihanMenuKamar p = (PilihanMenuKamar) listKamar.getSelectedValue();
                textFieldTipe.setText(p.getJenisKamar().getTipe());
                textFieldHarga.setText(Integer.toString(p.getJenisKamar().getHargaPerMalam()));
                spinnerBatasOrang.setValue(p.getJenisKamar().getBatasOrangPerKamar());
                spinnerBanyakKamar.setValue(p.getBanyakKamar());
                
                listSelectedStuff();
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCustomer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKamar = new javax.swing.JList();
        labelTipe = new javax.swing.JLabel();
        textFieldTipe = new javax.swing.JTextField();
        labelHarga = new javax.swing.JLabel();
        textFieldHarga = new javax.swing.JTextField();
        labelBatasOrang = new javax.swing.JLabel();
        spinnerBatasOrang = new javax.swing.JSpinner();
        spinnerBanyakKamar = new javax.swing.JSpinner();
        labelBanyakKamar = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonPerbarui = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        labelBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCustomer.setText("Menu Kamar");

        listKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listKamar);

        labelTipe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTipe.setText("Nama Tipe");

        textFieldTipe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHarga.setText("Harga Per Malam");

        textFieldHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelBatasOrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBatasOrang.setText("Batas Orang Per Kamar");

        spinnerBatasOrang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        spinnerBanyakKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelBanyakKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBanyakKamar.setText("Banyak Kamar Tersedia");

        buttonTambah.setBackground(new java.awt.Color(58, 152, 248));
        buttonTambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("Tambah");
        buttonTambah.setBorder(null);
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonPerbarui.setBackground(new java.awt.Color(58, 152, 248));
        buttonPerbarui.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonPerbarui.setForeground(new java.awt.Color(255, 255, 255));
        buttonPerbarui.setText("Perbarui");
        buttonPerbarui.setBorder(null);
        buttonPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerbaruiActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(255, 51, 51));
        buttonHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.setBorder(null);
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        labelBack.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelBack.setForeground(new java.awt.Color(255, 51, 51));
        labelBack.setText("< Back");
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelCustomer)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipe)
                        .addGap(32, 32, 32)
                        .addComponent(textFieldTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBatasOrang, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerBatasOrang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(177, 177, 177))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelBanyakKamar)
                        .addGap(32, 32, 32)
                        .addComponent(spinnerBanyakKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTipe)
                            .addComponent(textFieldTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHarga)
                            .addComponent(textFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerBatasOrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBatasOrang))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerBanyakKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBanyakKamar))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelBack)
                        .addGap(33, 33, 33)
                        .addComponent(labelCustomer)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        Kamar k = new Kamar(
                textFieldTipe.getText(),
                Integer.parseInt(textFieldHarga.getText()),
                (int) spinnerBatasOrang.getValue()
        );
        PilihanMenuKamar p = new PilihanMenuKamar(k, (int) spinnerBanyakKamar.getValue());
        
        db.insertPilihanMenu(idHotel, p);
        loadMenuKamarFromDB();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerbaruiActionPerformed
        PilihanMenuKamar p = (PilihanMenuKamar) listKamar.getSelectedValue();
        
        Kamar upd_k = p.getJenisKamar();
        upd_k.setTipe(textFieldTipe.getText());
        upd_k.setHargaPerMalam(Integer.parseInt(textFieldHarga.getText()));
        upd_k.setBatasOrangPerKamar((int) spinnerBatasOrang.getValue());
        p.setJenisKamar(upd_k);
        p.setBanyakKamar((int) spinnerBanyakKamar.getValue());
        
        db.updatePilihanMenuById(p.getId(), p);
        
        loadMenuKamarFromDB();
    }//GEN-LAST:event_buttonPerbaruiActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        PilihanMenuKamar p = (PilihanMenuKamar) listKamar.getSelectedValue();
        db.deletePilihanMenuById(p.getId(), p.getJenisKamar().getId());
        
        loadMenuKamarFromDB();
    }//GEN-LAST:event_buttonHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonPerbarui;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelBanyakKamar;
    private javax.swing.JLabel labelBatasOrang;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelTipe;
    private javax.swing.JList listKamar;
    private javax.swing.JSpinner spinnerBanyakKamar;
    private javax.swing.JSpinner spinnerBatasOrang;
    private javax.swing.JTextField textFieldHarga;
    private javax.swing.JTextField textFieldTipe;
    // End of variables declaration//GEN-END:variables
}
