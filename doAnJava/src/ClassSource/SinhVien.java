/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class SinhVien extends Nguoi implements Serializable {

    private static final long serialVersionUID = 1113799434508676095L;
    private String maSV;
    private String ngaySinh;
    private String lop;
    private String khoa;
    private String maDN;

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }

    public SinhVien() {

    }

    public SinhVien(String maSV, String ngaySinh, String lop, String khoa, String maDN, String hoTen, String sdt) {
        super(hoTen, sdt);
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.khoa = khoa;
        this.maDN = maDN;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getMaDN() {
        return maDN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setMaDN(String maDN) {
        this.maDN = maDN;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maSV);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        return Objects.equals(this.maSV, other.maSV);
    }
}
