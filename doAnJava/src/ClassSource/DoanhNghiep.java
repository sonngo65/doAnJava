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
        GiaoVien gv = new GiaoVien("GV01","ngth@hong.com" ,"Nguy???n Th??? H???ng", "098231213", true);
        GiaoVien gv1 = new GiaoVien("GV02","tranth@hung.com" ,"Tr???n Thanh H??ng", "0983153463",true);
//        ArrayList<GiaoVien> ds = new ArrayList<GiaoVien>();
//        ds.add(gv);
//        ds.add(gv1);  
//        db.luuFile("GiaoVien.txt", ds);
        ArrayList<DoanhNghiep> ds1 = new ArrayList<DoanhNghiep>();
//        ArrayList<SinhVien> dssv = (ArrayList<SinhVien>)db.docFile("SinhVien.txt");
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
//        dssv.add(new SinhVien("2020607777", "01-01-2002", "CNTT03", "C??ng Ngh??? Th??ng Tin", "", "Tr???n Di???u Linh", "0384985233"));
//        dssv.add(new SinhVien("2021643433", "20-12-2003", "KHMT01", "C??ng Ngh??? Th??ng Tin", "", "Nguy???n Th??? Di???p", "0918234423"));
          ArrayList<SinhVien> dssv1 = new ArrayList<SinhVien>();
            ArrayList<SinhVien> dssv2 = new ArrayList<SinhVien>();
              ArrayList<SinhVien> dssv3 = new ArrayList<SinhVien>();
//        dssv.add(new SinhVien("2020600233", "20-01-2002", "CNTT01", "C??ng Ngh??? Th??ng Tin", "DN1102", "Ng?? V??n Anh", "0877867223"));
        dssv2.add(new SinhVien("2019530145", "01-08-2001", "CNTT02", "C??ng Ngh??? Th??ng Tin", "DN0424", "Nguy???n Th??? Hoa", "0918205323"));
        dssv1.add(new SinhVien("2019620423", "06-06-2001", "CNTT04", "C??ng Ngh??? Th??ng Tin", "DN0243", "Nguy???n V??n Quy???t", "0832231232"));
        dssv3.add(new SinhVien("2019574274", "20-07-2001", "KHMT01", "C??ng Ngh??? Th??ng Tin", "DN0506", "Tr???n Thanh H???i", "0877867223"));
        dssv1.add(new SinhVien("2019453443", "24-03-2001", "HTTT02", "C??ng Ngh??? Th??ng Tin", "DN0243", "Qu??ch Th??? H???ng", "03837362423"));
        dssv2.add(new SinhVien("2019000211", "23-11-2001", "KTPM03", "C??ng Ngh??? Th??ng Tin", "DN0424", "V?? Di???u Linh", "03837837329"));
        dssv.add(new SinhVien("2019624353", "11-11-2001", "CNTT01", "C??ng Ngh??? Th??ng Tin", "DN1102", "Ng?? V??n Th???n", "0918877827"));
//        db.luuFile("SinhVien.txt", dssv);
//         DoanhNghiep dn = new DoanhNghiep("", "", "", 26, 4, gv, dssv);
//        ds.add(dn);
        ds1.add(new DoanhNghiep("DN1102", "C??ng Ty C??? Ph???n ????o T???o Qu???n L?? Tr???c Tuy???n Omt", "T??a nh?? 791 Building s??? 27-31/59 L??ng H???, qu???n Ba ????nh, H?? N???i", 20, 4, gv, dssv));
        ds1.add(new DoanhNghiep("DN0243", "C??ng ty TNHH ph???n m???m FPT", "T??a nh?? FPT, s??? 10 ph??? Ph???m V??n B???ch, ph?????ng D???ch V???ng, qu???n C???u", 19, 4, gv, dssv1));
        ds1.add(new DoanhNghiep("DN0424", "C??ng Ty TNHH CMC Global", "T???ng 9, T??a nh?? Th??nh C??ng, 80 D???ch V???ng H???u, C???u Gi???y, H?? N???i", 24, 4, gv1, dssv2));
         ds1.add(new DoanhNghiep("DN0506", "C??ng ty c??? ph???n VTI", "T???ng 6 ,T??a nh?? Ac, s??? 3 ng?? 78 Duy t??n C???u gi???y H?? N???i", 14, 4, gv1, dssv3));
         db.luuFile("DoanhNghiep.txt", ds1);
//       ArrayList<DoanhNghiep> ds = (ArrayList<DoanhNghiep>) db.docFile("DoanhNghiep.txt");
//       for(DoanhNghiep a : ds){
//           System.out.println(a.getMaDN());
//       }
    }
}
