package j05016_hoadonkhachsan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,soPhong;
    private int soNgayO,thanhTien;
    private static int cnt=1;
    public KhachHang(String ten,String soPhong,String ngayNhanPhong,String ngayTraPhong,int tienDV){
        this.ma = String.format("KH%02d",cnt++);
        this.ten = ten;
        this.soPhong = soPhong;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngay1 = LocalDate.parse(ngayNhanPhong,dtf);
        LocalDate ngay2 = LocalDate.parse(ngayTraPhong,dtf);
        this.soNgayO = (int) ChronoUnit.DAYS.between(ngay1,ngay2) + 1;

        if(soPhong.charAt(0)=='1') this.thanhTien = soNgayO*25+tienDV;
        else if(soPhong.charAt(0)=='2') this.thanhTien = soNgayO*34+tienDV;
        else if(soPhong.charAt(0)=='3') this.thanhTien = soNgayO*50+tienDV;
        else if(soPhong.charAt(0)=='4') this.thanhTien = soNgayO*80+tienDV;}

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + " " + soNgayO + " " + thanhTien;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Integer.compare(o.thanhTien,this.thanhTien);
    }
}
