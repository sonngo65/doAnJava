/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanjava;

import ClassSource.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableSinhVien extends AbstractTableModel {
    private String name[] = {"Mã SV","Tên SV","Ngày sinh","Số ĐT","Lớp","Khoa"};
    private Class classes[] = {String.class,String.class,String.class,String.class,String.class,String.class};
    private ArrayList<SinhVien>  ds = new ArrayList<SinhVien>();
    public TableSinhVien( ArrayList<SinhVien> sv){
        ds = sv;
    }
    @Override
    public int getRowCount() {
        return ds.size();
    }

    public TableSinhVien() {
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          switch(columnIndex){
              case 0: return ds.get(rowIndex).getMaSV();
              case 1: return ds.get(rowIndex).getHoTen();
              case 2: return ds.get(rowIndex).getNgaySinh();
               case 3: return ds.get(rowIndex).getSdt();
              case 4:  return ds.get(rowIndex).getLop();
              case 5: return ds.get(rowIndex).getKhoa();
             
              default : return null;
          }
          
    }
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    public String getColumnName(int columnIndex){
        return name[columnIndex];
    }
    
}
