package j05068_sapxepbanggiaxangdau;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> l = new ArrayList<>();
        while(t-->0){
            l.add(new DonHang(sc.next(),Double.parseDouble(sc.next())));
        }
        Collections.sort(l);
        for(DonHang i:l){
            System.out.println(i);
        }
    }
}