package j05003_danhsachdoituongsinhvien1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String msv="";
            if(i<10) {
                msv = "B20DCCN00" + i;
            }
            else{
                msv = "B20DCCN0" + i;
            }
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            if(ngaysinh.charAt(2)!='/') ngaysinh = '0' + ngaysinh;
            if(ngaysinh.charAt(5)!='/')
                ngaysinh = ngaysinh.substring(0,3)+'0'+ngaysinh.substring(3,ngaysinh.length());
            float gpa = sc.nextFloat();
            SinhVien a = new SinhVien(msv,ten,lop,ngaysinh,gpa);
            System.out.println(a);
        }
    }
}