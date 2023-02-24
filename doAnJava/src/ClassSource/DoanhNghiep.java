/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class DoanhNghiep {
    private String maDN;
    private String tenDN;
    private String diaChiDN;
    private int soLuong;
    private int thoiGianTT;
    private GiaoVien GVLienHe;
    private ArrayList<SinhVien> SVDangKy;

    public ArrayList<SinhVien> getSVDangKy() {
        return SVDangKy;
    }

    public DoanhNghiep(String maDN, String tenDN, String diaChiDN, int soLuong, int thoiGianTT, GiaoVien GVLienHe, ArrayList<SinhVien> SVDangKy) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.diaChiDN = diaChiDN;
        this.soLuong = soLuong;
        this.thoiGianTT = thoiGianTT;
        this.GVLienHe = GVLienHe;
        this.SVDangKy = SVDangKy;
    }



    public DoanhNghiep() {
    }

    public DoanhNghiep(String maDN, String tenDN, String diaChiDN) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.diaChiDN = diaChiDN;
    }

    public String getMaDN() {
        return maDN;
    }

    public String getTenDN() {
        return tenDN;
    }

    public String getDiaChiDN() {
        return diaChiDN;
    }

    public void setMaDN(String maDN) {
        this.maDN = maDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public void setDiaChiDN(String diaChiDN) {
        this.diaChiDN = diaChiDN;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.maDN);
        return hash;
    }

    public DoanhNghiep(String maDN) {
        this.maDN = maDN;
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
        final DoanhNghiep other = (DoanhNghiep) obj;
        return Objects.equals(this.maDN, other.maDN);
    }

    public void setGVLienHe(GiaoVien GVLienHe) {
        this.GVLienHe = GVLienHe;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setThoiGianTT(int thoiGianTT) {
        this.thoiGianTT = thoiGianTT;
    }

    public GiaoVien getGVLienHe() {
        return GVLienHe;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getThoiGianTT() {
        return thoiGianTT;
    }
    
}
