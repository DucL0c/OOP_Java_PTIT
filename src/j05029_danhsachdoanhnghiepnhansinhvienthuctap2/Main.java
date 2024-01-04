package j05029_danhsachdoanhnghiepnhansinhvienthuctap2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> l = new ArrayList<>();
        while(t-->0){
            l.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),
                    Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String[] s = sc.nextLine().split("\\s+");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",a,b);
            for(DoanhNghiep i:l){
                if(i.getSl()>=a && i.getSl()<=b){
                    System.out.println(i);
                }

            }
        }

    }
}