package j05052_tracuudonhang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> l = new ArrayList<>();
        while(n-->0){
            l.add(new DonHang(sc.nextLine(),sc.nextLine(),
              Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for(DonHang i:l){
            System.out.println(i);
        }
    }
}
