package j05036_tinhgiaban1;

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
            l.add(new MatHang(sc.nextLine(),sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(MatHang i:l){
            System.out.println(i);
        }
    }
}