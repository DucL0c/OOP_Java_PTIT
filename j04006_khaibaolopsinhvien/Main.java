package j04006_khaibaolopsinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.nextLine();
        String lop = sc.next();
        String ngaysinh = sc.next();
        if(ngaysinh.charAt(2)!='/')
            ngaysinh = '0' + ngaysinh;
        if(ngaysinh.charAt(5)!='/')
            ngaysinh = ngaysinh.substring(0,3)+'0'+ ngaysinh.substring(3,ngaysinh.length());
        float gpa = sc.nextFloat();
        SinhVien a = new SinhVien(hoten,lop,ngaysinh,gpa);
        System.out.println(a);
    }
}
//class SinhVien {
//    private String maSV,tenSV,lopSV,ngaySINH;
//    private float gpa;
//    public SinhVien() {
//        this.tenSV = "";
//        this.lopSV = "";
//        this.ngaySINH = "";
//        this.gpa = 0;
//    }
//    public SinhVien(String tenSV, String lopSV, String ngaySINH, float gpa) {
//        this.tenSV = tenSV;
//        this.lopSV = lopSV;
//        this.ngaySINH = ngaySINH;
//        this.gpa = gpa;
//    }
//    public String toString(){
//        return "B20DCCN001" + " " + tenSV + " " + lopSV + " " + ngaySINH + " " +String.format("%.2f",gpa);
//    }
//}