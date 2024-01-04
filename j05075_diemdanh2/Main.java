package j05075_diemdanh2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int n = t;
        ArrayList<SinhVien> l = new ArrayList<>();
        while (t-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        while(n-->0){
            String ma = sc.next();
            String dd = sc.next();
            int dcc = 10;
            for(int i=0;i<dd.length();i++){
                if(dd.charAt(i)=='x') continue;
                else if(dd.charAt(i)=='v') dcc -= 2;
                else if(dd.charAt(i)=='m') dcc -= 1;
            }
            for(SinhVien i:l){
                if(i.getMa().equals(ma)){
                    i.setDcc(dcc);
                }
            }
        }
        sc.nextLine();
        String lop = sc.nextLine();
        for(SinhVien i:l){
            if(i.getLop().equals(lop)){
                System.out.println(i);
            }
        }

    }
}