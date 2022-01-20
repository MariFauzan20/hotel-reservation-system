package HotelReservationSystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableHotel extends AbstractTableModel {
    ArrayList<Hotel> listHotel;
    
    public TableHotel(ArrayList<Hotel> lh) {
        this.listHotel = lh;
    }

    @Override
    public int getRowCount() { return listHotel.size(); }
    
    @Override
    public int getColumnCount() { return 4; }
    
    @Override
    public Object getValueAt(int row, int col) {
        switch(col) {
            case 0: return listHotel.get(row).getNama();
            case 1: return listHotel.get(row).getDeskripsi();
            case 2: return listHotel.get(row).getLokasi();
            case 3: return listHotel.get(row).getBanyakBintang();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col) {
            case 0: return "Nama";
            case 1: return "Deskripsi";
            case 2: return "Lokasi";
            case 3: return "Bintang";
            default: return null;
        }
    }
}
