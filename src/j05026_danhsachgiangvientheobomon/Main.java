package j05026_danhsachgiangvientheobomon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> l = new ArrayList<>();
        while(t-->0){
            l.add(new GiangVien(sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String tmp = sc.nextLine();
            String[] s = tmp.toUpperCase().split("\\s+");
            tmp = "";
            for(String i:s){
                tmp += i.substring(0,1);
            }
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n",tmp);
            for(GiangVien i:l){
                if(i.getBm().equals(tmp)){
                    System.out.println(i);
                }
            }
        }
    }
}