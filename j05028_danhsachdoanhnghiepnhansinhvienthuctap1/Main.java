package j05028_danhsachdoanhnghiepnhansinhvienthuctap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> l = new ArrayList<>();
        while(t-->0){
            l.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        for(DoanhNghiep i:l){
            System.out.println(i);
        }
    }
}