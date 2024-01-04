package j06004_quanlybainhom2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        ArrayList<SinhVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for(int i=1;i<=m;i++){
            String deTai = sc.nextLine();
            for(SinhVien j:l){
                if(Integer.parseInt(j.getmaNhom())==i){
                    j.setDeTai(deTai);
                }
            }
        }
        Collections.sort(l);
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}