package j05023_lietkesinhvientheokhoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String khoa = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n",khoa);
            for(SinhVien i:l){
                if((i.getLop()).equals(khoa.substring(2,4))) {
                    System.out.println(i);
                }
            }
        }
    }
}