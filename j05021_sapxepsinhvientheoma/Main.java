package j05021_sapxepsinhvientheoma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> l = new ArrayList<>();
        while(sc.hasNextLine()){
            l.add(new SinhVien(sc.nextLine(),sc.nextLine(),
                    sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(SinhVien i:l){
            System.out.println(i);
        }
    }
}