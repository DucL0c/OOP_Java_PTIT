package j05022_lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String malop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n",malop);
            for(SinhVien i:l){
                if(i.getLop().equals(malop)) {
                    System.out.println(i);
                }
            }
        }
    }
}