package j05014_tuyengiaovien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new GiaoVien(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()) ));
        }
        Collections.sort(l);
        for(GiaoVien i:l){
            System.out.println(i);
        }
    }
}
