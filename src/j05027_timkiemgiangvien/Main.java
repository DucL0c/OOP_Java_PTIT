package j05027_timkiemgiangvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new GiangVien(sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String tmp = sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",tmp);
            for(GiangVien i:l){
                if(i.getTen().contains(tmp.toLowerCase())) {
                    System.out.println(i);
                }
            }
        }
    }
}