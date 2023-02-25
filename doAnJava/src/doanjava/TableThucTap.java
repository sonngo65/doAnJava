/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanjava;

import ClassSource.DoanhNghiep;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableThucTap extends AbstractTableModel {

    private ArrayList<DoanhNghiep> ds = new ArrayList<DoanhNghiep>();
    public String name[] = {"STT", "Mã DN", "Tên DN", "Địa chỉ", "Số lượng", "Thời gian", "Giáo viên HD", "Số điện thoại"};
    public Class classes[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    public TableThucTap(ArrayList<DoanhNghiep> ds){
        this.ds = ds;
    }
    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return ds.get(rowIndex).getMaDN()+"";
            case 2:
                return ds.get(rowIndex).getTenDN();
            case 3:
                return ds.get(rowIndex).getDiaChiDN();
            case 4:
                return ds.get(rowIndex).getSVDangKy().size() + "/" + ds.get(rowIndex).getSoLuong();
            case 5:
                return ds.get(rowIndex).getThoiGianTT()+" tháng";
            case 6:
                return ds.get(rowIndex).getGVLienHe().getHoTen();
            case 7:
                return ds.get(rowIndex).getGVLienHe().getSdt();
            default:
                return null;
        }
        
       
    }
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    public String getColumnName(int columnIndex){
        return name[columnIndex];
    }
    
}
