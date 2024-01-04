package j05024_lietkesinhvientheonganhketoan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String tmp = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",tmp.toUpperCase());
            if (tmp.equals("Cong nghe thong tin") || tmp.equals("An toan thong tin")){
                for(SinhVien i:l){
                    if(i.getMa().equals(tmp) && !i.getLop().equals("E")){
                        System.out.println(i);
                    }
                }
            }
            else{
                for(SinhVien i:l){
                    if(i.getMa().equals(tmp)){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}