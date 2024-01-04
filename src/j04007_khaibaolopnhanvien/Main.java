package j04007_khaibaolopnhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String gioitinh = sc.nextLine();
        String ngaysinh = sc.nextLine();
        if(ngaysinh.charAt(2)!='/') ngaysinh = '0'+ngaysinh;
        if(ngaysinh.charAt(5)!='/') ngaysinh = ngaysinh.substring(0,3)+"0"+ngaysinh.substring(3,ngaysinh.length());
        String diachi = sc.nextLine();
        String masothue = sc.nextLine();
        String ngaykihopdong = sc.nextLine();
        if(ngaykihopdong.charAt(2)!='/') ngaykihopdong = '0'+ngaykihopdong;
        if(ngaykihopdong.charAt(5)!='/') ngaykihopdong = ngaykihopdong.substring(0,3)+"0"+ngaykihopdong.substring(3,ngaysinh.length());
        NhanVien a = new NhanVien(hoten,gioitinh,ngaysinh,diachi,masothue,ngaykihopdong);
        System.out.println(a);
    }
}
//class NhanVien {
//    private String hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong;
//
//    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
//        this.hoTen = hoTen;
//        this.gioiTinh = gioiTinh;
//        this.ngaySinh = ngaySinh;
//        this.diaChi = diaChi;
//        this.maSoThue = maSoThue;
//        this.ngayKiHopDong = ngayKiHopDong;
//    }
//
//    public String toString(){
//        return "00001"+" "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSoThue+" "+ngayKiHopDong;
//    }
//}