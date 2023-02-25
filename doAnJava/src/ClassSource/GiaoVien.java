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
public class GiaoVien extends Nguoi implements Serializable {
    private String maGV;
    private String email;

    public GiaoVien(String maGV, String email, String hoTen, String sdt) {
        super(hoTen, sdt);
        this.maGV = maGV;
        this.email = email;
    }

    public GiaoVien(String maGV, String email, String hoTen, String sdt, boolean isAD) {
        super(hoTen, sdt, isAD);
        this.maGV = maGV;
        this.email = email;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return sdt;
    }
  

    public String getMaGV() {
        return maGV;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.maGV);
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
        final GiaoVien other = (GiaoVien) obj;
        return Objects.equals(this.maGV, other.maGV);
    }

   
}
