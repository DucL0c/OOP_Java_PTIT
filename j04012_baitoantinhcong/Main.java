package j04012_baitoantinhcong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int luong = sc.nextInt();
        int soNgay = sc.nextInt();
        String chucVu = sc.next();
        NhanVien a = new NhanVien(ten,luong,soNgay,chucVu);
        System.out.println(a);
    }
}
//class NhanVien {
//    private String tenNV,ChucVu;
//    private int luongCoBan,soNgayCong,thuong,phuCap,luongThang,thuNhap;
//
//    public NhanVien(String tenNV, int luongCoBan, int soNgayCong,String chucVu) {
//        this.tenNV = tenNV;
//        this.luongCoBan = luongCoBan;
//        this.soNgayCong = soNgayCong;
//        this.ChucVu = chucVu;
//        this.luongThang = luongCoBan*soNgayCong;
//
//        if(soNgayCong>=25) this.thuong = luongThang*20/100;
//        else if(soNgayCong>=22 && soNgayCong<25) this.thuong = luongThang*10/100;
//        else if(soNgayCong<22) this.thuong = 0;
//
//        if(chucVu.equals("GD")) this.phuCap = 250000;
//        else if(chucVu.equals("PGD")) this.phuCap = 200000;
//        else if(chucVu.equals("TP")) this.phuCap = 180000;
//        else if(chucVu.equals("NV")) this.phuCap = 150000;
//
//        this.thuNhap = luongThang+thuong+phuCap;
//    }
//    public String toString(){
//        return "NV01"+" "+tenNV+" "+luongThang+" "+thuong+" "+phuCap+" "+thuNhap;
//    }
//}