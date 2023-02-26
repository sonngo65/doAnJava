/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassSource;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HopDong {

    private String maHD;
    private Date ngayLap = new Date();
    private DoanhNghiep DN = new DoanhNghiep();
    private SinhVien SV = new SinhVien();

    public String getMaHD() {
        return maHD;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public DoanhNghiep getDN() {
        return DN;
    }

    public SinhVien getSV() {
        return SV;
    }

    public HopDong() {
    }

    public HopDong( DoanhNghiep DN, SinhVien SV) {

        this.DN = DN;
        this.SV = SV;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setDN(DoanhNghiep DN) {
        this.DN = DN;
    }

    public void setSV(SinhVien SV) {
        this.SV = SV;
    }

    public String xuatHopDong() {
        String hd = "";
        hd += "                                                                             CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM\n\n";
        hd += "                                                                                      Độc lập – Tự do – Hạnh phúc \n\n";
        hd += "                                                                                      HỢP ĐỒNG THỰC TẬP SINH \n\n";
        hd += "                                                                                            Số: " + "hd2342" + "/HĐTTS \n\n";
        hd += "\tHợp đồng thực tập sinh (Sau đây gọi tắt là “Hợp đồng”) này được lập ngày " + this.ngayLap.getDate() + " tháng " + (this.ngayLap.getMonth() + 1) + "  năm " + (this.ngayLap.getYear() + 1900) + "\n\tgiữa các bên sau đây:\n";
        hd += "\tBÊN A: BÊN TUYỂN DỤNG THỰC TẬP SINH\n\n";
        hd += "\tMã doanh nghiệp: " + DN.getMaDN() + "\n\tTên doanh nghiệp: " + DN.getTenDN() + "\n\tĐịa chỉ doanh nghiệp: " + DN.getDiaChiDN() + "\n";
        hd += "\tBÊN B: BÊN THỰC TẬP SINH\n\n";
        hd += "\tÔNG/BÀ: "+SV.getHoTen()+" \n\tSinh ngày: "+SV.getNgaySinh()+ " \n\tSố điện thoại: "+SV.getSdt()+" \n\n";
        hd += "\tĐIỀU 1. ĐỐI TƯỢNG CỦA HỢP ĐỒNG\n"
                + "\n"
                + "\tCông ty tuyển dụng Ông/Bà "+SV.getHoTen()+" vào vị trí thực tập sinh với thời gian và chế độ thực tập\n\tđược quy định tạiĐiều 2 và Điều 3 của Hợp đồng này.\n"
                + "\tĐIỀU 2. THỜI GIAN THỰC TẬP\n"
                + "\n"
                + "\t+ Sáng từ: 8giờ đến 12giờ.\n"
                + "\n"
                + "\t+ Chiều từ:2giờ đến 6giờ.\n"
                + "\n"
                + "\tĐIỀU 3. CHI PHÍ TRỢ CẤP, PHƯƠNG THỨC THANH TOÁN, THỜI HẠN THANH TOÁN TRỢ CẤP\n"
                + "\n"
                + "\t3.1 Chi phí trợ cấp:\n"
                + "\n"
                + "\tThực tập sinh được trả trợ cấp trong quá trình thực tập là: 3.000.000 vnd/tháng.\n\n"
                + "                                            BÊN B                                                                               BÊN A\n\n"
         
                + "                                    (Ký và ghi rõ họ tên)                                                   (Ký, đóng dấu và ghi rõ họ tên)\n"
                
                + "" ;
        return hd;
    }

    public static void main(String[] args) {
        HopDong a = new HopDong();
        System.out.println(a.xuatHopDong());
    }
}
