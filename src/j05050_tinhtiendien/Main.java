package j05050_tinhtiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            l.add(new KhachHang(sc.nextLine(),Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())));
        }
        for(KhachHang i:l){
            System.out.println(i);
        }
    }
}