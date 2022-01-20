package HotelReservationSystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablePemesanan extends AbstractTableModel {
    ArrayList<DetilPemesanan> detailPemesanan;
    
    public TablePemesanan(ArrayList<DetilPemesanan> dp) {
        this.detailPemesanan = dp;
    }

    @Override
    public int getRowCount() { return detailPemesanan.size(); }
    
    @Override
    public int getColumnCount() { return 5; }
    
    @Override
    public Object getValueAt(int row, int col) {
        switch(col) {
            case 0: return detailPemesanan.get(row).getHotel().getNama();
            case 1: return detailPemesanan.get(row).getTipeKamar().getTipe();
            case 2: return detailPemesanan.get(row).getBanyakMalam();
            case 3: return detailPemesanan.get(row).getBanyakKamar();
            case 4: return detailPemesanan.get(row).getHargaTotal();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col) {
            case 0: return "Nama Hotel";
            case 1: return "Tipe Kamar";
            case 2: return "Banyak Kamar";
            case 3: return "Harga Total";
            default: return null;
        }
    }
}
