package j05079_lophocphan1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lop> l = new ArrayList<>();
        while(n-->0){
            l.add(new Lop(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ma = sc.nextLine();
            for(Lop i:l){
                if(i.getMal().equals(ma)){
                    System.out.printf("Danh sach nhom lop mon %s:\n",i.getTenl());
                    break;
                }
            }
            for(Lop i:l){
                if(i.getMal().equals(ma)){
                    System.out.println(i);
                }
            }
        }
    }
}