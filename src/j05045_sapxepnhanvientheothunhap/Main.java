package j05045_sapxepnhanvientheothunhap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new NhanVien(sc.nextLine(),sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()) ));
        }
        Collections.sort(l);
        for(NhanVien i:l)
            System.out.println(i);
    }
}