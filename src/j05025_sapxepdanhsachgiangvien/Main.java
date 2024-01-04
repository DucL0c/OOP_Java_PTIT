package j05025_sapxepdanhsachgiangvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new GiangVien(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(GiangVien i:l){
            System.out.println(i);
        }
    }
}