package j05044_lietkenhanvientheochucvu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> l = new ArrayList<>();
        while(n-->0){
            l.add(new NhanVien(sc.nextLine(),sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()) ));
        }
        String cv = sc.nextLine();
        for(NhanVien i:l)
            if(i.getCv().equals(cv))
                System.out.println(i);
    }
}