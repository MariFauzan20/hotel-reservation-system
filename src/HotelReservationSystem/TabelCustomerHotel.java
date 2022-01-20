/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationSystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Muhammad Tsaqif Ammar
 */
public class TabelCustomerHotel extends AbstractTableModel {
    
    ArrayList<DetilPemesanan> listCustomer;
    
    public TabelCustomerHotel(ArrayList<DetilPemesanan> lc) {
        this.listCustomer = lc;
    }

    @Override
    public int getRowCount() { return listCustomer.size(); }
    
    @Override
    public int getColumnCount() { return 4; }
    
    @Override
    public Object getValueAt(int row, int col) {
        switch(col) {
            case 0: return listCustomer.get(row).getCustomer().getNama();
            case 1: return listCustomer.get(row).getTipeKamar().getTipe();
            case 2: return listCustomer.get(row).getBanyakKamar();
            case 3: return listCustomer.get(row).getBanyakMalam();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col) {
            case 0: return "Nama";
            case 1: return "Tipe Kamar";
            case 2: return "Banyak Kamar";
            case 3: return "Banyak Malam";
            default: return null;
        }
    }
}
