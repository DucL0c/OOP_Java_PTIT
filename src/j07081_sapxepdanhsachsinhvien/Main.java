package j07081_sapxepdanhsachsinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}