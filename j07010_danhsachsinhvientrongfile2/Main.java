package j07010_danhsachsinhvientrongfile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma = "";
            if(i<10) ma = "B20DCCN00" + i;
            else ma = "B20DCCN0" + i;
            SinhVien a = new SinhVien(ma,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
            System.out.println(a);
        }
    }
}