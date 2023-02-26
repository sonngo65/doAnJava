/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

import java.util.ArrayList;
import java.util.Objects;
import DBEngine.DBEngine;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class DoanhNghiep implements Serializable {

    private static final long serialVersionUID = 1113799434508676095L;
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

    public DoanhNghiep(String maDN, String tenDN, String diaChiDN, int soLuong, int thoiGianTT, GiaoVien GVLienHe) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.diaChiDN = diaChiDN;
        this.soLuong = soLuong;
        this.thoiGianTT = thoiGianTT;
        this.GVLienHe = GVLienHe;
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

    public static void main(String[] args) {

        DBEngine db = new DBEngine();

//              ArrayList<GiaoVien> ds = (ArrayList<GiaoVien>)db.docFile("GiaoVien.txt");
//                for(GiaoVien gv: ds){
//                    System.out.println(gv.getHoTen());
//                }
//            ArrayList<DoanhNghiep> ds = (ArrayList<DoanhNghiep>) db.docFile("DoanhNghiep.txt");
//            for(DoanhNghiep dn : ds){
//                System.out.println(dn.getGVLienHe().getHoTen());
//            }
        GiaoVien gv = new GiaoVien("GV01","ngth@hong.com" ,"Nguyễn Thị Hồng", "098231213", true);
        GiaoVien gv1 = new GiaoVien("GV02","tranth@hung.com" ,"Trần Thanh Hùng", "0983153463",true);
//        ArrayList<GiaoVien> ds = new ArrayList<GiaoVien>();
//        ds.add(gv);
//        ds.add(gv1);  
//        db.luuFile("GiaoVien.txt", ds);
        ArrayList<DoanhNghiep> ds1 = new ArrayList<DoanhNghiep>();
//        ArrayList<SinhVien> dssv = (ArrayList<SinhVien>)db.docFile("SinhVien.txt");
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
//        dssv.add(new SinhVien("2020607777", "01-01-2002", "CNTT03", "Công Nghệ Thông Tin", "", "Trần Diệu Linh", "0384985233"));
//        dssv.add(new SinhVien("2021643433", "20-12-2003", "KHMT01", "Công Nghệ Thông Tin", "", "Nguyễn Thị Diệp", "0918234423"));
          ArrayList<SinhVien> dssv1 = new ArrayList<SinhVien>();
            ArrayList<SinhVien> dssv2 = new ArrayList<SinhVien>();
              ArrayList<SinhVien> dssv3 = new ArrayList<SinhVien>();
//        dssv.add(new SinhVien("2020600233", "20-01-2002", "CNTT01", "Công Nghệ Thông Tin", "DN1102", "Ngô Văn Anh", "0877867223"));
        dssv2.add(new SinhVien("2019530145", "01-08-2001", "CNTT02", "Công Nghệ Thông Tin", "DN0424", "Nguyễn Thị Hoa", "0918205323"));
        dssv1.add(new SinhVien("2019620423", "06-06-2001", "CNTT04", "Công Nghệ Thông Tin", "DN0243", "Nguyễn Văn Quyết", "0832231232"));
        dssv3.add(new SinhVien("2019574274", "20-07-2001", "KHMT01", "Công Nghệ Thông Tin", "DN0506", "Trần Thanh Hải", "0877867223"));
        dssv1.add(new SinhVien("2019453443", "24-03-2001", "HTTT02", "Công Nghệ Thông Tin", "DN0243", "Quách Thị Hằng", "03837362423"));
        dssv2.add(new SinhVien("2019000211", "23-11-2001", "KTPM03", "Công Nghệ Thông Tin", "DN0424", "Vũ Diệu Linh", "03837837329"));
        dssv.add(new SinhVien("2019624353", "11-11-2001", "CNTT01", "Công Nghệ Thông Tin", "DN1102", "Ngô Văn Thần", "0918877827"));
//        db.luuFile("SinhVien.txt", dssv);
//         DoanhNghiep dn = new DoanhNghiep("", "", "", 26, 4, gv, dssv);
//        ds.add(dn);
        ds1.add(new DoanhNghiep("DN1102", "Công Ty Cổ Phần Đào Tạo Quản Lý Trực Tuyến Omt", "Tòa nhà 791 Building số 27-31/59 Láng Hạ, quận Ba Đình, Hà Nội", 20, 4, gv, dssv));
        ds1.add(new DoanhNghiep("DN0243", "Công ty TNHH phần mềm FPT", "Tòa nhà FPT, số 10 phố Phạm Văn Bạch, phường Dịch Vọng, quận Cầu", 19, 4, gv, dssv1));
        ds1.add(new DoanhNghiep("DN0424", "Công Ty TNHH CMC Global", "Tầng 9, Tòa nhà Thành Công, 80 Dịch Vọng Hậu, Cầu Giấy, Hà Nội", 24, 4, gv1, dssv2));
         ds1.add(new DoanhNghiep("DN0506", "Công ty cổ phần VTI", "Tầng 6 ,Tòa nhà Ac, số 3 ngõ 78 Duy tân Cầu giấy Hà Nội", 14, 4, gv1, dssv3));
         db.luuFile("DoanhNghiep.txt", ds1);
//       ArrayList<DoanhNghiep> ds = (ArrayList<DoanhNghiep>) db.docFile("DoanhNghiep.txt");
//       for(DoanhNghiep a : ds){
//           System.out.println(a.getMaDN());
//       }
    }
}
