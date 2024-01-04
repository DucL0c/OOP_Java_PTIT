package j07025_danhsachkhachhangtrongfile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang>{
    private String ma,ten,gioiTinh,ngaySinh,diaChi;
    private static int cnt=1;

    public KhachHang(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ma = String.format("KH%03d",cnt++);
        this.ten = "";
        String[] tmp = ten.trim().toLowerCase().split("\\s+");
        for(String i:tmp){
            this.ten += i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        }
        this.ten = this.ten.trim();
        this.gioiTinh = gioiTinh;
        if(ngaySinh.charAt(2)!='/') ngaySinh = '0' + ngaySinh;
        if(ngaySinh.charAt(5)!='/') ngaySinh = ngaySinh.substring(0,3)+"0"+ngaySinh.substring(3);
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+gioiTinh+" "+diaChi+" "+ngaySinh;
    }

    @Override
    public int compareTo(KhachHang o) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(this.ngaySinh, formatter);
        LocalDate date2 = LocalDate.parse(o.ngaySinh, formatter);
        return date1.compareTo(date2);
    }
}
