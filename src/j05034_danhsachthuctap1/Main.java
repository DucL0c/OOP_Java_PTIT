package j05034_danhsachthuctap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String tmp = sc.nextLine();
            for(SinhVien i:l){
                if(i.getDn().equals(tmp)){
                    System.out.println(i);
                }
            }
        }
    }
}