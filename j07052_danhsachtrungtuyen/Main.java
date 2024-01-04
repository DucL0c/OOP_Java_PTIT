package j07052_danhsachtrungtuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> l = new ArrayList<>();
        while(n-->0){
            l.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()) ));
        }
        Collections.sort(l);
        int t = Integer.parseInt(sc.nextLine());
        double dc = l.get(t-1).getTong();
        for(ThiSinh i:l){
            if(i.getTong()<dc){
                i.setTt("TRUOT ");
            }
            else{
                i.setTt("TRUNG TUYEN");
            }
        }
        System.out.println(String.format("%.1f",dc));
        for(ThiSinh i:l){
            System.out.println(i);
        }
    }
}