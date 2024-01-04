package j05076_nhaphangxuat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> l = new ArrayList<>();
        while(t-->0){
            l.add(new MatHang(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String mah = sc.next();
            int sln = Integer.parseInt(sc.next());
            int dgn = Integer.parseInt(sc.next());
            int slx = Integer.parseInt(sc.next());
            for(MatHang i:l){
                if(i.getMa().equals(mah)){
                    System.out.println(i.getMa()+" "+i.getTen()+" "+sln*dgn+" "+
                            String.format("%.0f",slx*dgn + slx*dgn*i.getLx()));
                }
            }
        }
    }
}