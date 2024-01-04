package j05081_danhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String ma = "";
            if(i<10)  ma = "MH00" + i;
            else ma = ma = "MH0" + i;
            l.add(new MatHang(ma,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l);
        for(MatHang i:l){
            System.out.println(i);
        }
    }
}