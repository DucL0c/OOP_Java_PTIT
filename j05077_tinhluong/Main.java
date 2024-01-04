package j05077_tinhluong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> a = new ArrayList<>();
        while(t-->0){
            a.add(new PhongBan(sc.next(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> l = new ArrayList<>();
        while(n-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String phong = "";
            int hsl = 0;
            int lcb = Integer.parseInt(sc.nextLine());
            int snc = Integer.parseInt(sc.nextLine());
            for(PhongBan i:a){
                if(i.getMaP().equals(ma.substring(3,5))){
                    phong = i.getTenP();
                    break;
                }
            }
            if(ma.substring(0,1).equals("A")){
                int x = Integer.parseInt(ma.substring(1,3));
                if(x>=1 && x<=3) hsl = 10;
                else if(x>=4 && x<=8) hsl = 12;
                else if(x>=9 && x<=15) hsl = 14;
                else if(x>=16) hsl = 20;
            }else if(ma.substring(0,1).equals("B")){
                int x = Integer.parseInt(ma.substring(1,3));
                if(x>=1 && x<=3) hsl = 10;
                else if(x>=4 && x<=8) hsl = 11;
                else if(x>=9 && x<=15) hsl = 13;
                else if(x>=16) hsl = 16;
            }else if(ma.substring(0,1).equals("C")){
                int x = Integer.parseInt(ma.substring(1,3));
                if(x>=1 && x<=3) hsl = 9;
                else if(x>=4 && x<=8) hsl = 10;
                else if(x>=9 && x<=15) hsl = 12;
                else if(x>=16) hsl = 14;
            }else if(ma.substring(0,1).equals("D")){
                int x = Integer.parseInt(ma.substring(1,3));
                if(x>=1 && x<=3) hsl = 8;
                else if(x>=4 && x<=8) hsl = 9;
                else if(x>=9 && x<=15) hsl = 11;
                else if(x>=16) hsl = 13;
            }
            l.add(new NhanVien(ma,ten,phong,hsl*lcb*snc*1000));
        }
        for(NhanVien i:l){
            System.out.println(i);
        }
    }
}
