package j05030_bangdiemthanhphan1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            System.out.printf("%d %s\n",i+1,l.get(i));
        }
    }
}