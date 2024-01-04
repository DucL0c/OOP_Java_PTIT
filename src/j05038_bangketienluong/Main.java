package j05038_bangketienluong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new NhanVien(sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),sc.nextLine() ));
        }
        double tong = 0;
        for(NhanVien i:l){
            tong += i.getTl();
            System.out.println(i);
        }
        System.out.printf("Tong chi phi tien luong: %.0f",tong);
    }
}