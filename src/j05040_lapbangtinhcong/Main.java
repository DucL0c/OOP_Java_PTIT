package j05040_lapbangtinhcong;

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
        for(NhanVien i:l){
            System.out.println(i);
        }
    }
}