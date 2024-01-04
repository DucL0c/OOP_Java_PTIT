package j07025_danhsachkhachhangtrongfile;

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
            l.add(new KhachHang(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine()));
        }
        Collections.sort(l);
        for(KhachHang i:l){
            System.out.println(i);
        }
    }
}
