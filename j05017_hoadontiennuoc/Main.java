package j05017_hoadontiennuoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> l = new ArrayList<>();
        while(t-->0){
            l.add(new KhachHang(sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l);
        for(KhachHang i:l){
            System.out.println(i);
        }
    }
}