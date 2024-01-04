package j07018_chuanhoadanhsachsinhvien;

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
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}
