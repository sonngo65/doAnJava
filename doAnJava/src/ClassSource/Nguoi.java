/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Nguoi implements Serializable{
    protected String hoTen;
    protected String sdt;
    protected boolean isAD;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String sdt) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        isAD = false;
    }

    public Nguoi(String hoTen, String sdt, boolean isAD) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.isAD = isAD;
    }
}

