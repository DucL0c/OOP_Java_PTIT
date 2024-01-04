package j05006_danhsachdoituongnhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String msv = "";
            if(i<10) msv = "0000" + i;
            else msv = "000"+i;
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            if(ns.charAt(2)!='/') ns = '0'+ns;
            if(ns.charAt(5)!='/') ns = ns.substring(0,3)+'0'+ns.substring(3,ns.length());
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String nkh = sc.nextLine();
            if(nkh.charAt(2)!='/') nkh = '0'+nkh;
            if(nkh.charAt(5)!='/') nkh = nkh.substring(0,3)+'0'+nkh.substring(3,nkh.length());
            NhanVien a = new NhanVien(msv,ten,gt,ns,dc,mst,nkh);
            System.out.println(a);
        }
    }
}