package j06003_quanlybainhom1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        ArrayList<SinhVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        ArrayList<Nhom> a = new ArrayList<>();
        while(m-->0){
            a.add(new Nhom(sc.nextLine()));
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String maN = sc.nextLine();
            System.out.printf("DANH SACH NHOM %s:\n",maN);
            for(SinhVien i:l){
                if(i.getmaNhom().equals(maN)){
                    System.out.println(i);
                }
            }
            for(Nhom i:a){
                if(i.getMaNhom().equals(maN)){
                    System.out.printf("Bai tap dang ky: %s\n",i.getDetai());
                    break;
                }
            }
        }
    }
}