/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import HotelReservationSystem.Database;
import HotelReservationSystem.DetilPemesanan;
import HotelReservationSystem.TabelCustomerHotel;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class CustomerHotel extends javax.swing.JPanel {
    
    private String idHotel;
    private Database db;
    private ArrayList<DetilPemesanan> arrDP;

    /**
     * Creates new form CustomerHotel
     */
    public CustomerHotel() {
        initComponents();
        db = new Database();
    }

    public JLabel getLabelBack() {
        return labelBack;
    }
    public void setIdHotel(String id_hotel) {
        this.idHotel = id_hotel;
    }
    
    public void loadCustomerHotel() {
        arrDP = db.getPemesananByHotel(idHotel);
        TabelCustomerHotel modelTabel = new TabelCustomerHotel(arrDP);
        tabelCustomer.setModel(modelTabel);
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
        tabelCustomer = new javax.swing.JTable();
        labelBack = new javax.swing.JLabel();
        labelDeskripsi = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCustomer.setText("Customer");

        tabelCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Tipe Kamar", "Banyak Kamar", "Banyak Malam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelCustomer);

        labelBack.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelBack.setForeground(new java.awt.Color(255, 0, 0));
        labelBack.setText("< Back");
        labelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDeskripsi.setText("List customer yang sudah memesan di hotel Anda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelCustomer)
                        .addGap(386, 386, 386))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelDeskripsi)
                        .addGap(311, 311, 311))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelBack)
                .addGap(30, 30, 30)
                .addComponent(labelCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDeskripsi)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JLabel labelDeskripsi;
    private javax.swing.JTable tabelCustomer;
    // End of variables declaration//GEN-END:variables
}
