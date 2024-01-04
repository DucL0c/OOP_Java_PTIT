package j05012_tinhtien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> l = new ArrayList<>();
        while(t-->0){
            l.add(new HoaDon(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(l);
        for(HoaDon i:l){
            System.out.println(i);
        }
    }
}
