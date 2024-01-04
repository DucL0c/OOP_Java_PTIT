package j04005_khaibaolopthisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String ngaysinh = sc.nextLine();
        if(ngaysinh.charAt(2)!='/')
            ngaysinh = '0' + ngaysinh;
        if(ngaysinh.charAt(5)!='/')
            ngaysinh = ngaysinh.substring(0,3) + '0' + ngaysinh.substring(3,ngaysinh.length());
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh a = new ThiSinh(hoten,ngaysinh,diem1,diem2,diem3);
        System.out.println(a);
    }
}
//class ThiSinh {
//    private String hoTen,ngaySinh;
//    private float diem1,diem2,diem3,tongDiem;
//    public ThiSinh(){}
//
//    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
//        this.hoTen = hoTen;
//        this.ngaySinh = ngaySinh;
//        this.diem1 = diem1;
//        this.diem2 = diem2;
//        this.diem3 = diem3;
//    }
//    public String toString(){
//        this.tongDiem = this.diem1+this.diem2+this.diem3;
//        return this.hoTen + " " + this.ngaySinh + " " +this.tongDiem;
//    }
//}