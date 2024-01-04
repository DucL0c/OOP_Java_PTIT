package j07056_tinhtiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> l = new ArrayList<>();
        while(n-->0){
            l.add(new KhachHang(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(KhachHang i:l){
            System.out.println(i);
        }
    }
}