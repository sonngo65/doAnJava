/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

/**
 *
 * @author Admin
 */
public class GiaoVien {
    private String maGV;
    private String tenGV;
    private String soDienThoai;

    public String getMaGV() {
        return maGV;
    }

    public GiaoVien(String maGV, String tenGV, String soDienThoai) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.soDienThoai = soDienThoai;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }
}
